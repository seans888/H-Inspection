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

public class Get_UserData extends AsyncTask<Void, Void, String> {

    private MyInterface mListener;
    private String _username
            , _password
            , TAG = Get_UserData.class.getSimpleName()
            , lastName
            , firstname
            , usertype
            , userNo;


    public Get_UserData(MyInterface mListener, Context context, String username, String password) {
        this.mListener  = mListener;
        this._username = username;
        this._password = password;
    }


    @Override
    protected void onPreExecute() {
        Logs.show("d", TAG, "Loading data...");
        super.onPreExecute();}

    protected String doInBackground(Void... args) {

       //String address = "http://192.168.0.10/housekeepingapp/get_all_users.php?username="+_username+"&password="+_password;
        //String address = HousekeepingApp.ServerAddress + "/get_all_users.php";
        String address = HousekeepingApp.ServerAddress + "/get_user_data.php?username="+_username+"&password="+_password;
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
                return "Invalid username and password. Please check credentials.";
            }else{
                for(int j=0;j<json.length();j++){
                    JSONObject e = json.getJSONObject(j);
                    lastName =  e.getString("LastName");
                    firstname =  e.getString("FirstName");
                    usertype =  e.getString("UserType");
                    userNo = e.getString("UserNo");
                    Logs.show("e", TAG, "LastName >> " + lastName);
                    Logs.show("e", TAG, "FirstName >> " +  firstname);
                    Logs.show("e", TAG, "UserType >> " + usertype);
                    Logs.show("e", TAG, "userNo >> " + userNo);
                    HousekeepingApp.setUserNo(userNo);
                    HousekeepingApp.setUserType(usertype);
                }
                return firstname + "#%" + lastName + "#%" + usertype;
            }



        } catch (IOException | JSONException e) {
            return e.toString();
        }

    }

    protected void onPostExecute(String result) {
        // dismiss the dialog after getting all user data
        if (mListener != null){
            mListener.myMethod(result);        }else{
            mListener.myMethod(null);        }

    }

    public interface MyInterface {
        public void myMethod(String result);    }
}
