package ispector.edu.apc;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import ispector.edu.apc.async.Get_Sessions;
import ispector.edu.apc.async.Insert_Session;
import ispector.edu.apc.async.Update_Session_HK_End;
import ispector.edu.apc.global.HousekeepingApp;
import ispector.edu.apc.global.Logs;
import ispector.edu.apc.hardware.CameraState;

import java.util.ArrayList;
import java.util.List;

