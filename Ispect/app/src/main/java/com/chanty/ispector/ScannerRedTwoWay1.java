package com.chanty.ispector;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.zxing.integration.android.*;
import com.google.zxing.integration.android.IntentIntegrator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//THIS IS FOR THE SCANIN OF THE INSPECTOR
public class ScannerRedTwoWay1 extends AppCompatActivity {
    private Button scan_btn;
    private FirebaseDatabase mFirebaseInstance;
    private DatabaseReference mFirebaseDatabase1, mFirebaseDatabase;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner_red_two_way);
//ASSIGN INSTANCES AND REFERENCES
        mFirebaseInstance = FirebaseDatabase.getInstance();
        mFirebaseDatabase1 = mFirebaseInstance.getReference("Rooms");
        mFirebaseDatabase = mFirebaseInstance.getReference("Users");

        scan_btn = (Button) findViewById(R.id.scan_btn);
        final Activity activity = this;
        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                com.google.zxing.integration.android.IntentIntegrator integrator = new com.google.zxing.integration.android.IntentIntegrator(activity);

                integrator.setDesiredBarcodeFormats(com.google.zxing.integration.android.IntentIntegrator.QR_CODE_TYPES);
                integrator.setPrompt("Scan");
                integrator.setCameraId(0);
                integrator.setBeepEnabled(false);
                integrator.setBarcodeImageEnabled(false);
                integrator.initiateScan();




            }
        });



    }

//IF QR IS SCANNED IT SAVES THE TIME AND INSPECTOR AND REDIRECTS TO THE CHECKLIST ACTIVITY
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        com.google.zxing.integration.android.IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null){
            if(result.getContents()==null){

                Toast.makeText(this, "You cancelled the scanning", Toast.LENGTH_LONG).show();

            }
            else {

                String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
                Intent inte = getIntent();
                String RoomName = inte.getStringExtra("RoomName");
                String userEmail = inte.getStringExtra("userEmail");
                int index = userEmail.lastIndexOf('@');
                String newuserEmail = userEmail.substring(0, index);
                String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Room");
                DatabaseReference reference2 = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child("Time");

                String resultnew = result.toString();
                reference.setValue(resultnew);
                reference2.setValue(currentDateTimeString);


                Toast.makeText(getApplicationContext(), "Scan-in successful!",
                        Toast.LENGTH_LONG).show();

                Intent mIntent = new Intent(getApplicationContext(), Checklist1.class);
                mIntent.putExtra("inspector", userEmail);
                mIntent.putExtra("result", resultnew);
                mIntent.putExtra("Time", currentDateTimeString);
                mIntent.putExtra("newEmail", newuserEmail);
                mIntent.putExtra("RoomName", RoomName);
                startActivity(mIntent);
                finish();


            }
        }
        else {
            super.onActivityResult(requestCode, resultCode, data);


        }


    }

    @Override
    public void onBackPressed() {
        String message = "READY FOR INSPECTION";
        Intent inte = getIntent();
        String RoomName = inte.getStringExtra("RoomName");
        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
        reference.setValue(message);
        Intent mIntent = new Intent(getApplicationContext(), ScannerParent1.class);
        startActivity(mIntent);
        finish();
    }
}
