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


