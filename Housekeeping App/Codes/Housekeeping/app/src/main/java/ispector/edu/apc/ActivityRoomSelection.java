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

        // getting user info from log in
        logInResult = getIntent().getStringExtra("result");

        // display user info in Activity
        String[] result = logInResult.split("#%");
        tv_UserFullName.setText("Full Name: " + result[0] + " " + result[1]);
        tv_UserType.setText("User Type: " + result[2]);
        final List<String> suite = new ArrayList<String>();
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.row_spinner,suite);

        rg_RoomType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected

                suite.clear();

                if (rb_Suite.isChecked()){
                    suite.add("Choose Room No.");
                    suite.add("1");
                    suite.add("2");
                    suite.add("3");
                    suite.add("4");
                    suite.add("5");
                    suite.add("6");
                    suite.add("7");
                    suite.add("8");
                    suite.add("9");
                    suite.add("10");
                    spnr_RoomNo.setAdapter(adapter);
                    spnr_RoomNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                            // your code here
                            Logs.show("v",TAG,suite.get(position));
                            if (!suite.get(position).startsWith("Choose")){
                                HousekeepingApp.setRoomNo(suite.get(position));
                                getQRCodeStatus(suite.get(position));
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parentView) {
                            // your code here
                        }

                    });
                }

                if (rb_NonSuite.isChecked()){
                    suite.add("Choose Room No.");
                    suite.add("11");
                    suite.add("12");
                    suite.add("13");
                    suite.add("14");
                    suite.add("15");
                    suite.add("16");
                    suite.add("17");
                    suite.add("18");
                    suite.add("19");
                    suite.add("20");
                    spnr_RoomNo.setAdapter(adapter);
                    spnr_RoomNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                            // your code here
                            Logs.show("v",TAG,suite.get(position));
                            if (!suite.get(position).startsWith("Choose")){
                                HousekeepingApp.setRoomNo(suite.get(position));
                                getQRCodeStatus(suite.get(position));

                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parentView) {
                            // your code here
                        }

                    });
                }
            }
        });







    }

    private void getQRCodeStatus(String s) {
        Get_Sessions get_QR_Code_Status_Of_User_And_Room = new Get_Sessions(
                new Get_Sessions.MyInterface() {
            @Override
            public void myMethod(String result) {
                Logs.show("v", TAG, "result >> " + result);
                if (result.startsWith("No") && HousekeepingApp.getUserType().equals("HK")){ // New Session
                    btn_StartQR.setVisibility(View.VISIBLE);
                    btn_EndQR.setVisibility(View.GONE);
                    tv_RoomStatus.setText("Ready for Cleaning");
                    token = "HK_ReadyForCleaning";
                } else if (result.startsWith("No") && HousekeepingApp.getUserType().equals("INSP")){ // New Session
                    btn_StartQR.setVisibility(View.GONE);
                    btn_EndQR.setVisibility(View.GONE);
                    tv_RoomStatus.setText("Ready for Cleaning");
                }
                else{

                    String[] tks = result.split("#%");
                    if (HousekeepingApp.getUserType().equals("HK")
                            && !tks[0].equals("null") // HK_START - SCANNED
                            && tks[1].equals("null") // HK_END - NOT
                            && tks[2].equals("null") // INSP_START - NOT
                            && tks[3].equals("null") // INSP_END - NOT
                            ){
                            btn_StartQR.setVisibility(View.GONE);
                            btn_EndQR.setVisibility(View.VISIBLE);
                            tv_RoomStatus.setText("On-going Cleaning");
                        token = "HK_OnGoingCleaning";
                    } else if (HousekeepingApp.getUserType().equals("HK")
                            && !tks[0].equals("null")// HK_START - SCANNED
                            && !tks[1].equals("null") // HK_END - SCANNED
                            && tks[2].equals("null") // INSP_START - NOT
                            && tks[3].equals("null") // INSP_END - NOT
                            ){
                        btn_StartQR.setVisibility(View.GONE);
                        btn_EndQR.setVisibility(View.GONE);
                        tv_RoomStatus.setText("Ready for Inspection");
                        token = "HK_ReadyForInspection";
                    } else if (HousekeepingApp.getUserType().equals("HK")
                            && !tks[0].equals("null") // HK_START - SCANNED
                            && !tks[1].equals("null") // HK_END - SCANNED
                            && !tks[2].equals("null") // INSP_START - SCANNED
                            && tks[3].equals("null") // INSP_END - NOT
                            ){
                        btn_StartQR.setVisibility(View.GONE);
                        btn_EndQR.setVisibility(View.GONE);
                        tv_RoomStatus.setText("On-Going Inspection");
                        token = "HK_OnGoingInspection";
                    }

                    // INSP

                    else if (HousekeepingApp.getUserType().equals("INSP")
                            && !tks[0].equals("null") // HK_START - SCANNED
                            && tks[1].equals("null") // HK_END - NOT
                            && tks[2].equals("null") // INSP_START - NOT
                            && tks[3].equals("null") // INSP_END - NOT
                            ){
                        btn_StartQR.setVisibility(View.GONE);
                        btn_EndQR.setVisibility(View.GONE);
                        tv_RoomStatus.setText("On-going Cleaning");
                        token = "INSP_OnGoingCleaning";
                    } else if (HousekeepingApp.getUserType().equals("INSP")
                            && !tks[0].equals("null") // HK_START - SCANNED
                            && !tks[1].equals("null") // HK_END - SCANNED
                            && tks[2].equals("null") // INSP_START - NOT
                            && tks[3].equals("null") // INSP_END - NOT
                            ){
                        btn_StartQR.setVisibility(View.VISIBLE);
                        btn_EndQR.setVisibility(View.GONE);
                        tv_RoomStatus.setText("Ready for Inspection");
                        token = "INSP_ReadyForInspection";
                    } 