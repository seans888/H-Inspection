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
           