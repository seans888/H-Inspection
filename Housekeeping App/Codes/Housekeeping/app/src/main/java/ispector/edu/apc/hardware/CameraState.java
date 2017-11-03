package ispector.edu.apc.hardware;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;


/**
 * Created by ispector on 10/23/2017.
 */

public class CameraState {
    Context c;
    String myPref;
    SharedPreferences sp;

