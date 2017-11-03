package ispector.edu.apc.global;

import android.app.Application;
import android.util.Log;

/**
 * Created by ispector on 11/07/2017.
 */

public class Logs extends Application {

    public static void show(String type, String TAG, String message){
        switch (type){
            case "v": Log.v(TAG, message); break;
            case "w": Log.w(TAG, message); break;
            case "e": Log.e(TAG, message); break;
            case "i": Log.i(TAG, message); break;
            case "d": Log.d(TAG, message); break;
            default: break;
        }
    }
}
