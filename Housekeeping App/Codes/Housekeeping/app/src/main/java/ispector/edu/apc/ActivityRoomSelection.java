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

public class ActivityRoomSelection extends AppCompatActivity {

    private Context c;
    private TextView tv_UserFullName
            , tv_UserType
            , tv_RoomStatus;
    private Spinner spnr_RoomNo;
    private Button btn_StartQR
            , btn_EndQR;
    private String logInResult
            , Fullname
            , UserType
            , TAG = ActivityRoomSelection.class.getSimpleName()
            , token;
    private RadioButton rb_Suite
            , rb_NonSuite;
    private RadioGroup rg_RoomType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_selection);

        c = this;

        tv_UserFullName = (TextView) findViewById(R.id.tv_UserFullName);
        tv_UserType = (TextView) findViewById(R.id.tv_UserType);
        tv_RoomStatus = (TextView) findViewById(R.id.tv_RoomStatus);
        rb_Suite = (RadioButton) findViewById(R.id.rb_Suite);
        rb_NonSuite = (RadioButton) findViewById(R.id.rb_NonSuite);
        rg_RoomType = (RadioGroup) findViewById(R.id.rg_RoomType);
        spnr_RoomNo = (Spinner) findViewById(R.id.spnr_RoomNo);
        btn_StartQR = (Button) findViewById(R.id.btn_StartQR);
        btn_EndQR = (Button) findViewById(R.id.btn_EndQR);

