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
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScannerGreen1 extends AppCompatActivity {
    private Button scan_btn;
    private FirebaseDatabase mFirebaseInstance;
    private DatabaseReference mFirebaseDatabase1, mFirebaseDatabase;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner_green);
//GET REFERENCES AND INSTANCES
        mFirebaseInstance = FirebaseDatabase.getInstance();
        mFirebaseDatabase1 = mFirebaseInstance.getReference("Rooms");
        mFirebaseDatabase = mFirebaseInstance.getReference("Users");
        scan_btn = (Button) findViewById(R.id.scan_btn);
        final Activity activity = this;
        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntentIntegrator integrator = new IntentIntegrator(activity);

                integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                integrator.setPrompt("Scan");
                integrator.setCameraId(0);
                integrator.setBeepEnabled(false);
                integrator.setBarcodeImageEnabled(false);
                integrator.initiateScan();







            }
        });



    }

//WHEN QR IS SCANNED IT SAVES THE DATA
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null){
            if(result.getContents()==null){

                Toast.makeText(this, "You cancelled the scanning", Toast.LENGTH_LONG).show();

            }
            else {

                String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
                Intent inte = getIntent();
                String RoomName = inte.getStringExtra("RoomName");
                String userEmail = inte.getStringExtra("userEmail");
                String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child(date).child("Sign-in").child(currentDateTimeString).child("Room");;
                DatabaseReference reference1 = mFirebaseDatabase1.child(RoomName).child(date).child("Sign-in").child(currentDateTimeString).child("User");
                reference1.setValue(userEmail);
                String resultnew = result.toString();
                reference.setValue(resultnew);

                Toast.makeText(getApplicationContext(), "Scan-in successful!",
                        Toast.LENGTH_LONG).show();

                Intent mIntent = new Intent(getApplicationContext(), ScannerParent.class);
                mIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(mIntent);
                finish();

            }
        }
        else {
            super.onActivityResult(requestCode, resultCode, data);


        }


    }
    //RETURN TO ORIGINAL STATE IF BACK IS PRESSED

    @Override
    public void onBackPressed() {
        String message = "READY FOR HOUSEKEEPING";
        Intent inte = getIntent();
        String RoomName = inte.getStringExtra("RoomName");
        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
        reference.setValue(message);
        Intent mIntent = new Intent(getApplicationContext(), ScannerParent1.class);
        startActivity(mIntent);
        finish();
    }


}