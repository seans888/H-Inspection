package ispector.edu.apc.async;

import android.content.Context;
import android.os.AsyncTask;

import ispector.edu.apc.global.HousekeepingApp;
import ispector.edu.apc.global.Logs;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by ispector on 2017-10-25.
 */

public class Get_Sessions extends AsyncTask<Void, Void, String> {

    private MyInterface mListener;
    private String TAG = Get_Sessions.class.getSimpleName()
            , _userType
            , _roomNo
            , _userNo
            , _HK_START = null
            , _HK_END = null
            , _INSP_START = null
            , _INSP_END = null
            ;


    public Get_Sessions(MyInterface mListener, Context context, String usertype, String userNo, String roomNo) {
        this.mListener  = mListener;
        this._userType = usertype;
        this._roomNo = roomNo;
        this._userNo = userNo;
    }


    @Override
    protected void onPreExecute() {
        Logs.show("d", TAG, "Loading data...");
        super.onPreExecute();}

    protected String doInBackground(Void... args) {

       //String address = "http://192.168.0.10/housekeepingapp/get_all_users.php?username="+_username+"&password="+_password;
        //String address = HousekeepingApp.ServerAddress + "/get_all_users.php";
        String address = HousekeepingApp.ServerAddress + "/get_user_room_qr_data.php?HK_UserNo="+_userNo+"&RoomNo="+_roomNo;
        Logs.show("v", TAG, "address >> " + address);
        HttpURLConnection urlConnection;

        try {
            URL url = new URL(address);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            JSONObject jsonObject = new JSONObject();
            InputStream inputStream;
            // get stream
            if (urlConnection.getResponseCode() < HttpURLConnection.HTTP_BAD_REQUEST) {
                inputStream = urlConnection.getInputStream();
            } else {
                inputStream = urlConnection.getErrorStream();
            }
            // parse stream
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String temp, response = "";
            while ((temp = bufferedReader.readLine()) != null) {
                response += temp;
                Logs.show("e", TAG, "response >> " + response);
            }
            // put into JSONObject
            jsonObject.put("Content", response);
            jsonObject.put("Message", urlConnection.getResponseMessage());
            jsonObject.put("Length", urlConnection.getContentLength());
            jsonObject.put("Type", urlConnection.getContentType());

            int i = jsonObject.length();
            Logs.show("e", TAG, "length >> " + Integer.toString(i));
            JSONArray json = new JSONArray(response);
            if (json.length() == 0){
                return "No session found";
            }else{
                for(int j=0;j<json.length();j++){
                    JSONObject e = json.getJSONObject(j);
                    _HK_START =  e.getString("HK_START");
                    _HK_END =  e.getString("HK_END");
                    Logs.show("e", TAG, "_HK_START >> " + _HK_START);
                    Logs.show("e", TAG, "_HK_END >> " +  _HK_END);

                    _INSP_START =  e.getString("INSP_START");
                    _INSP_END =  e.getString("INSP_END");
                    Logs.show("e", TAG, "_INSP_START >> " + _INSP_START);
                    Logs.show("e", TAG, "_INSP_END >> " +  _INSP_END);
                }
                return _HK_START + "#%" + _HK_END + "#%" + _INSP_START + "#%" + _INSP_END;
            }



        } catch (IOException | JSONException e) {
            return e.toString();
        }

    }

    protected void onPostExecute(String result) {
        // dismiss the dialog after getting all products
        if (mListener != null){
            mListener.myMethod(result);        }else{
            mListener.myMethod(null);        }

    }

    public interface MyInterface {
        public void myMethod(String result);    }
}
