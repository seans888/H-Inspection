package com.chanty.ispector;


import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ScannerParent extends AppCompatActivity {


//INITIALIZE VARIABLES FROM XML
    private Button room1, room2, room3, room4, room5, room6, room7, room8, room9,room10;
    private DatabaseReference mFirebaseDatabase, mFirebaseDatabase1, userRef;
    private FirebaseDatabase mFirebaseInstance;

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private  String roomStat;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner_parent);
        final boolean finish = getIntent().getBooleanExtra("finish", false);
        if (finish) {
            startActivity(new Intent(this, Login.class));
            finish();
            return;
        }


        //GET INSTANCE AND REFERENCES FROM DATABASE
        mFirebaseInstance = FirebaseDatabase.getInstance();
        mFirebaseDatabase1 = mFirebaseInstance.getReference("Rooms");
        mFirebaseDatabase = mFirebaseInstance.getReference("Users");


        //GET EXTRA FROM PREVIOUS INTENT FROM NAVIG. DRAWER

        Intent intent = getIntent();
        String userKey = intent.getStringExtra("userKey");

        userRef = mFirebaseDatabase.child(userKey);


//GET ROOM IDS
        room1 = (Button) findViewById(R.id.rm1Btn);
        room2 = (Button) findViewById(R.id.rm2Btn);
        room3 = (Button) findViewById(R.id.rm3Btn);
        room4 = (Button) findViewById(R.id.rm4Btn);
        room5 = (Button) findViewById(R.id.rm5Btn);
        room6 = (Button) findViewById(R.id.rm6Btn);
        room7 = (Button) findViewById(R.id.rm7Btn);
        room8 = (Button) findViewById(R.id.rm8Btn);
        room9 = (Button) findViewById(R.id.rm9Btn);
        room10 = (Button) findViewById(R.id.rm10Btn);

        //DRAWER LAYOUT
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        //navigation Drawer
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView mNavigationView = (NavigationView) findViewById(R.id.nav_menu);
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){
            @Override public boolean onNavigationItemSelected(MenuItem menuItem)
            { switch (menuItem.getItemId())
            {
                case(R.id.nav_home): Intent accountActivity = new Intent(getApplicationContext(), Home.class);
                    startActivity(accountActivity);
                    finish();
                    break;

                case(R.id.nav_logout): Intent accountActivity4 = new Intent(getApplicationContext(), Registration.class);
                    startActivity(accountActivity4);
                    Toast.makeText(getApplicationContext(), "Signed out!",
                            Toast.LENGTH_LONG).show();
                    FirebaseAuth.getInstance().signOut();
                    break;

                case(R.id.nav_suite): Intent accountActivity5 = new Intent(getApplicationContext(), ScannerParent1.class);
                    Intent intent1 = getIntent();
                    String userEmail1 = intent1.getStringExtra("userEmail");
                    String userKey1 = intent1.getStringExtra("userKey");
                    String userType1 = intent1.getStringExtra("userType");
                    accountActivity5.putExtra("userEmail", userEmail1);
                    accountActivity5.putExtra("userKey", userKey1);
                    accountActivity5.putExtra("userType", userType1);
                    startActivity(accountActivity5);
                    break;

                case(R.id.nav_normal): Intent accountActivity6 = new Intent(getApplicationContext(), ScannerParent.class);
                    Intent intent = getIntent();
                    String userEmail = intent.getStringExtra("userEmail");
                    String userKey = intent.getStringExtra("userKey");
                    String userType = intent.getStringExtra("userType");
                    accountActivity6.putExtra("userEmail", userEmail);
                    accountActivity6.putExtra("userKey", userKey);
                    accountActivity6.putExtra("userType", userType);
                    startActivity(accountActivity6);

                    break;


            }
                return true;
            } });

        //Navigation Drawer
//ROOMS

        mFirebaseDatabase1.child("Room1").addValueEventListener(new ValueEventListener() { //attach listener
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) { //something changed!

                for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                    String location = locationSnapshot.getValue().toString();

//THIS PART MAKES UP THE ROOM COLORING WORKFLOW BASED ON DATABASE VALUES

                    if (location.equals("READY FOR HOUSEKEEPING")) {
                        room1.setBackgroundResource(R.drawable.button2);
                        roomStat = "Red";
                    } else if (location.equals("BEING HOUSEKEPT")) {
                        room1.setBackgroundResource(R.drawable.button1);
                        roomStat = "Yellow";
                    } else {
                        room1.setBackgroundResource(R.drawable.button);
                        roomStat = "Green";
                    }


                    if (roomStat.equals("Red")) {

                        room1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if (location.equals("Housekeeper")) {

                                                String message = "BEING HOUSEKEPT";
                                                String RoomName = "Room1";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerGreen.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            } else {

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }
                                    }


                                        @Override
                                        public void onCancelled (DatabaseError databaseError){

                                            //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                            String message = "READY FOR HOUSEKEEPING";
                                            String RoomName = "Room1";
                                            DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                            reference.setValue(message);


                                        }

                                });


                            }
                        });


                    } else if (roomStat.equals("Yellow")) {

                        room1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "READY FOR INSPECTION";
                                                String RoomName = "Room1";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerYellow.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "BEING HOUSEKEPT";
                                        String RoomName = "Room1";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                    else {
                        room1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper Inspector")){

                                                String message = "READY FOR HOUSEKEEPING";
                                                String RoomName = "Room1";
                                                Intent intent = getIntent();
                                                String userEmail = intent.getStringExtra("userEmail");

                                                //NEW INTENT
                                                Intent next1 = new Intent(getApplicationContext(), ScannerRedTwoWay.class);
                                                next1.putExtra("userEmail", userEmail);
                                                next1.putExtra("RoomName", RoomName);


                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);

                                                //START ACTIVITY
                                                startActivity(next1);

                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to inspect!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                            String message = "READY FOR INSPECTION";
                                            String RoomName = "Room1";
                                            DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                            reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {


            }
        });
        mFirebaseDatabase1.child("Room2").addValueEventListener(new ValueEventListener() { //attach listener
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) { //something changed!

                for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                    String location = locationSnapshot.getValue().toString();

//THIS PART MAKES UP THE ROOM COLORING WORKFLOW BASED ON DATABASE VALUES

                    if (location.equals("READY FOR HOUSEKEEPING")) {
                        room2.setBackgroundResource(R.drawable.button2);
                        roomStat = "Red";
                    } else if (location.equals("BEING HOUSEKEPT")) {
                        room2.setBackgroundResource(R.drawable.button1);
                        roomStat = "Yellow";
                    } else {
                        room2.setBackgroundResource(R.drawable.button);
                        roomStat = "Green";
                    }


                    if (roomStat.equals("Red")) {

                        room2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if (location.equals("Housekeeper")) {

                                                String message = "BEING HOUSEKEPT";
                                                String RoomName = "Room2";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerGreen.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            } else {

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "READY FOR HOUSEKEEPING";
                                        String RoomName = "Room2";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });

                            }
                        });


                    } else if (roomStat.equals("Yellow")) {

                        room2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "READY FOR INSPECTION";
                                                String RoomName = "Room2";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerYellow.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "BEING HOUSEKEPT";
                                        String RoomName = "Room2";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                    else {
                        room2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper Inspector")){

                                                String message = "READY FOR HOUSEKEEPING";
                                                String RoomName = "Room2";
                                                Intent intent = getIntent();
                                                String userEmail = intent.getStringExtra("userEmail");

                                                //NEW INTENT
                                                Intent next1 = new Intent(getApplicationContext(), ScannerRedTwoWay.class);
                                                next1.putExtra("userEmail", userEmail);
                                                next1.putExtra("RoomName", RoomName);


                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);

                                                //START ACTIVITY
                                                startActivity(next1);

                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to inspect!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "READY FOR INSPECTION";
                                        String RoomName = "Room2";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {


            }
        });
        mFirebaseDatabase1.child("Room3").addValueEventListener(new ValueEventListener() { //attach listener
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) { //something changed!

                for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                    String location = locationSnapshot.getValue().toString();

//THIS PART MAKES UP THE ROOM COLORING WORKFLOW BASED ON DATABASE VALUES

                    if (location.equals("READY FOR HOUSEKEEPING")) {
                        room3.setBackgroundResource(R.drawable.button2);
                        roomStat = "Red";
                    } else if (location.equals("BEING HOUSEKEPT")) {
                        room3.setBackgroundResource(R.drawable.button1);
                        roomStat = "Yellow";
                    } else {
                        room3.setBackgroundResource(R.drawable.button);
                        roomStat = "Green";
                    }


                    if (roomStat.equals("Red")) {

                        room3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "READY FOR INSPECTION";
                                                String RoomName = "Room3";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerGreen.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "BEING HOUSEKEPT";
                                        String RoomName = "Room3";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });


                    } else if (roomStat.equals("Yellow")) {

                        room3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "READY FOR INSPECTION";
                                                String RoomName = "Room3";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerYellow.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "BEING HOUSEKEPT";
                                        String RoomName = "Room3";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                    else {
                        room3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper Inspector")){

                                                String message = "READY FOR HOUSEKEEPING";
                                                String RoomName = "Room3";
                                                Intent intent = getIntent();
                                                String userEmail = intent.getStringExtra("userEmail");

                                                //NEW INTENT
                                                Intent next1 = new Intent(getApplicationContext(), ScannerRedTwoWay.class);
                                                next1.putExtra("userEmail", userEmail);
                                                next1.putExtra("RoomName", RoomName);


                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);

                                                //START ACTIVITY
                                                startActivity(next1);

                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to inspect!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "READY FOR INSPECTION";
                                        String RoomName = "Room3";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {


            }
        });
        mFirebaseDatabase1.child("Room4").addValueEventListener(new ValueEventListener() { //attach listener
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) { //something changed!

                for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                    String location = locationSnapshot.getValue().toString();

//THIS PART MAKES UP THE ROOM COLORING WORKFLOW BASED ON DATABASE VALUES

                    if (location.equals("READY FOR HOUSEKEEPING")) {
                        room4.setBackgroundResource(R.drawable.button2);
                        roomStat = "Red";
                    } else if (location.equals("BEING HOUSEKEPT")) {
                        room4.setBackgroundResource(R.drawable.button1);
                        roomStat = "Yellow";
                    } else {
                        room4.setBackgroundResource(R.drawable.button);
                        roomStat = "Green";
                    }


                    if (roomStat.equals("Red")) {

                        room4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "BEING HOUSEKEPT";
                                                String RoomName = "Room4";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerGreen.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "READY FOR HOUSEKEEPING";
                                        String RoomName = "Room4";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });

                            }
                        });


                    } else if (roomStat.equals("Yellow")) {

                        room4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "READY FOR INSPECTION";
                                                String RoomName = "Room4";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerYellow.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "BEING HOUSEKEPT";
                                        String RoomName = "Room4";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                    else {
                        room4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper Inspector")){

                                                String message = "READY FOR HOUSEKEEPING";
                                                String RoomName = "Room4";
                                                Intent intent = getIntent();
                                                String userEmail = intent.getStringExtra("userEmail");

                                                //NEW INTENT
                                                Intent next1 = new Intent(getApplicationContext(), ScannerRedTwoWay.class);
                                                next1.putExtra("userEmail", userEmail);
                                                next1.putExtra("RoomName", RoomName);


                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);

                                                //START ACTIVITY
                                                startActivity(next1);

                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to inspect!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "READY FOR INSPECTION";
                                        String RoomName = "Room4";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {


            }
        });
        mFirebaseDatabase1.child("Room5").addValueEventListener(new ValueEventListener() { //attach listener
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) { //something changed!

                for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                    String location = locationSnapshot.getValue().toString();

//THIS PART MAKES UP THE ROOM COLORING WORKFLOW BASED ON DATABASE VALUES

                    if (location.equals("READY FOR HOUSEKEEPING")) {
                        room5.setBackgroundResource(R.drawable.button2);
                        roomStat = "Red";
                    } else if (location.equals("BEING HOUSEKEPT")) {
                        room5.setBackgroundResource(R.drawable.button1);
                        roomStat = "Yellow";
                    } else {
                        room5.setBackgroundResource(R.drawable.button);
                        roomStat = "Green";
                    }


                    if (roomStat.equals("Red")) {

                        room5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "BEING HOUSEKEPT";
                                                String RoomName = "Room5";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerGreen.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "READY FOR HOUSEKEEPING";
                                        String RoomName = "Room5";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });

                            }
                        });


                    } else if (roomStat.equals("Yellow")) {

                        room5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "READY FOR INSPECTION";
                                                String RoomName = "Room5";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerYellow.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "BEING HOUSEKEPT";
                                        String RoomName = "Room5";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                    else {
                        room5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper Inspector")){

                                                String message = "READY FOR HOUSEKEEPING";
                                                String RoomName = "Room5";
                                                Intent intent = getIntent();
                                                String userEmail = intent.getStringExtra("userEmail");

                                                //NEW INTENT
                                                Intent next1 = new Intent(getApplicationContext(), ScannerRedTwoWay.class);
                                                next1.putExtra("userEmail", userEmail);
                                                next1.putExtra("RoomName", RoomName);


                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);

                                                //START ACTIVITY
                                                startActivity(next1);

                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to inspect!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "READY FOR INSPECTION";
                                        String RoomName = "Room5";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {


            }
        });
        mFirebaseDatabase1.child("Room6").addValueEventListener(new ValueEventListener() { //attach listener
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) { //something changed!

                for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                    String location = locationSnapshot.getValue().toString();

//THIS PART MAKES UP THE ROOM COLORING WORKFLOW BASED ON DATABASE VALUES

                    if (location.equals("READY FOR HOUSEKEEPING")) {
                        room6.setBackgroundResource(R.drawable.button2);
                        roomStat = "Red";
                    } else if (location.equals("BEING HOUSEKEPT")) {
                        room6.setBackgroundResource(R.drawable.button1);
                        roomStat = "Yellow";
                    } else {
                        room6.setBackgroundResource(R.drawable.button);
                        roomStat = "Green";
                    }


                    if (roomStat.equals("Red")) {

                        room6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "BEING HOUSEKEPT";
                                                String RoomName = "Room6";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerGreen.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "READY FOR HOUSEKEEPING";
                                        String RoomName = "Room6";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });

                            }
                        });


                    } else if (roomStat.equals("Yellow")) {

                        room6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "READY FOR INSPECTION";
                                                String RoomName = "Room6";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerYellow.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "BEING HOUSEKEPT";
                                        String RoomName = "Room6";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                    else {
                        room6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper Inspector")){

                                                String message = "READY FOR HOUSEKEEPING";
                                                String RoomName = "Room6";
                                                Intent intent = getIntent();
                                                String userEmail = intent.getStringExtra("userEmail");

                                                //NEW INTENT
                                                Intent next1 = new Intent(getApplicationContext(), ScannerRedTwoWay.class);
                                                next1.putExtra("userEmail", userEmail);
                                                next1.putExtra("RoomName", RoomName);


                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);

                                                //START ACTIVITY
                                                startActivity(next1);

                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to inspect!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "READY FOR INSPECTION";
                                        String RoomName = "Room6";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {


            }
        });
        mFirebaseDatabase1.child("Room7").addValueEventListener(new ValueEventListener() { //attach listener
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) { //something changed!

                for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                    String location = locationSnapshot.getValue().toString();

//THIS PART MAKES UP THE ROOM COLORING WORKFLOW BASED ON DATABASE VALUES

                    if (location.equals("READY FOR HOUSEKEEPING")) {
                        room7.setBackgroundResource(R.drawable.button2);
                        roomStat = "Red";
                    } else if (location.equals("BEING HOUSEKEPT")) {
                        room7.setBackgroundResource(R.drawable.button1);
                        roomStat = "Yellow";
                    } else {
                        room7.setBackgroundResource(R.drawable.button);
                        roomStat = "Green";
                    }


                    if (roomStat.equals("Red")) {

                        room7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "BEING HOUSEKEPT";
                                                String RoomName = "Room7";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerGreen.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "READY FOR HOUSEKEEPING";
                                        String RoomName = "Room7";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });

                            }
                        });


                    } else if (roomStat.equals("Yellow")) {

                        room7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "READY FOR INSPECTION";
                                                String RoomName = "Room7";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerYellow.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "BEING HOUSEKEPT";
                                        String RoomName = "Room7";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                    else {
                        room7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper Inspector")){

                                                String message = "READY FOR HOUSEKEEPING";
                                                String RoomName = "Room7";
                                                Intent intent = getIntent();
                                                String userEmail = intent.getStringExtra("userEmail");

                                                //NEW INTENT
                                                Intent next1 = new Intent(getApplicationContext(), ScannerRedTwoWay.class);
                                                next1.putExtra("userEmail", userEmail);
                                                next1.putExtra("RoomName", RoomName);


                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);

                                                //START ACTIVITY
                                                startActivity(next1);

                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to inspect!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "READY FOR INSPECTION";
                                        String RoomName = "Room7";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {


            }
        });
        mFirebaseDatabase1.child("Room8").addValueEventListener(new ValueEventListener() { //attach listener
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) { //something changed!

                for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                    String location = locationSnapshot.getValue().toString();

//THIS PART MAKES UP THE ROOM COLORING WORKFLOW BASED ON DATABASE VALUES

                    if (location.equals("READY FOR HOUSEKEEPING")) {
                        room8.setBackgroundResource(R.drawable.button2);
                        roomStat = "Red";
                    } else if (location.equals("BEING HOUSEKEPT")) {
                        room8.setBackgroundResource(R.drawable.button1);
                        roomStat = "Yellow";
                    } else {
                        room8.setBackgroundResource(R.drawable.button);
                        roomStat = "Green";
                    }


                    if (roomStat.equals("Red")) {

                        room8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "BEING HOUSEKEPT";
                                                String RoomName = "Room8";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerGreen.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "READY FOR HOUSEKEEPING";
                                        String RoomName = "Room8";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });
                            }
                        });


                    } else if (roomStat.equals("Yellow")) {

                        room8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "READY FOR INSPECTION";
                                                String RoomName = "Room8";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerYellow.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "BEING HOUSEKEPT";
                                        String RoomName = "Room8";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                    else {
                        room8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper Inspector")){

                                                String message = "READY FOR HOUSEKEEPING";
                                                String RoomName = "Room8";
                                                Intent intent = getIntent();
                                                String userEmail = intent.getStringExtra("userEmail");

                                                //NEW INTENT
                                                Intent next1 = new Intent(getApplicationContext(), ScannerRedTwoWay.class);
                                                next1.putExtra("userEmail", userEmail);
                                                next1.putExtra("RoomName", RoomName);


                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);

                                                //START ACTIVITY
                                                startActivity(next1);

                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to inspect!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "READY FOR INSPECTION";
                                        String RoomName = "Room8";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {


            }
        });
        mFirebaseDatabase1.child("Room9").addValueEventListener(new ValueEventListener() { //attach listener
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) { //something changed!

                for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                    String location = locationSnapshot.getValue().toString();

//THIS PART MAKES UP THE ROOM COLORING WORKFLOW BASED ON DATABASE VALUES

                    if (location.equals("READY FOR HOUSEKEEPING")) {
                        room9.setBackgroundResource(R.drawable.button2);
                        roomStat = "Red";
                    } else if (location.equals("BEING HOUSEKEPT")) {
                        room9.setBackgroundResource(R.drawable.button1);
                        roomStat = "Yellow";
                    } else {
                        room9.setBackgroundResource(R.drawable.button);
                        roomStat = "Green";
                    }


                    if (roomStat.equals("Red")) {

                        room9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "BEING HOUSEKEPT";
                                                String RoomName = "Room9";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerGreen.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "READY FOR HOUSEKEEPING";
                                        String RoomName = "Room9";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });

                            }
                        });


                    } else if (roomStat.equals("Yellow")) {

                        room9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "READY FOR INSPECTION";
                                                String RoomName = "Room9";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerYellow.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "BEING HOUSEKEPT";
                                        String RoomName = "Room9";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                    else {
                        room9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper Inspector")){

                                                String message = "READY FOR HOUSEKEEPING";
                                                String RoomName = "Room9";
                                                Intent intent = getIntent();
                                                String userEmail = intent.getStringExtra("userEmail");

                                                //NEW INTENT
                                                Intent next1 = new Intent(getApplicationContext(), ScannerRedTwoWay.class);
                                                next1.putExtra("userEmail", userEmail);
                                                next1.putExtra("RoomName", RoomName);


                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);

                                                //START ACTIVITY
                                                startActivity(next1);

                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to inspect!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "READY FOR INSPECTION";
                                        String RoomName = "Room9";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {


            }
        });
        mFirebaseDatabase1.child("Room10").addValueEventListener(new ValueEventListener() { //attach listener
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) { //something changed!

                for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                    String location = locationSnapshot.getValue().toString();

//THIS PART MAKES UP THE ROOM COLORING WORKFLOW BASED ON DATABASE VALUES

                    if (location.equals("READY FOR HOUSEKEEPING")) {
                        room10.setBackgroundResource(R.drawable.button2);
                        roomStat = "Red";
                    } else if (location.equals("BEING HOUSEKEPT")) {
                        room10.setBackgroundResource(R.drawable.button1);
                        roomStat = "Yellow";
                    } else {
                        room10.setBackgroundResource(R.drawable.button);
                        roomStat = "Green";
                    }


                    if (roomStat.equals("Red")) {

                        room10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "BEING HOUSEKEPT";
                                                String RoomName = "Room10";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerGreen.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "READY FOR HOUSEKEEPING";
                                        String RoomName = "Room10";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });

                            }
                        });


                    } else if (roomStat.equals("Yellow")) {

                        room10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper")){

                                                String message = "READY FOR INSPECTION";
                                                String RoomName = "Room10";
                                                Intent intent = getIntent();
                                                String userKey = intent.getStringExtra("userKey");
                                                String userEmail = intent.getStringExtra("userEmail");
                                                Intent next1 = new Intent(getApplicationContext(), ScannerYellow.class);
                                                next1.putExtra("userKey", userKey);
                                                next1.putExtra("RoomName", RoomName);
                                                next1.putExtra("userEmail", userEmail);
                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);
                                                startActivity(next1);


                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to housekeep!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "BEING HOUSEKEPT";
                                        String RoomName = "Room10";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                    else {
                        room10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                userRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()) {
                                            String location = locationSnapshot.getValue().toString();
                                            if(location.equals("Housekeeper Inspector")){

                                                String message = "READY FOR HOUSEKEEPING";
                                                String RoomName = "Room10";
                                                Intent intent = getIntent();
                                                String userEmail = intent.getStringExtra("userEmail");

                                                //NEW INTENT
                                                Intent next1 = new Intent(getApplicationContext(), ScannerRedTwoWay.class);
                                                next1.putExtra("userEmail", userEmail);
                                                next1.putExtra("RoomName", RoomName);


                                                DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                                reference.setValue(message);

                                                //START ACTIVITY
                                                startActivity(next1);

                                                break;


                                            }else{

                                                Toast.makeText(getApplicationContext(), "You are not authorized to inspect!",
                                                        Toast.LENGTH_LONG).show();
                                                break;


                                            }
                                        }

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        //RETURN PAST DATABASE RoomStatus VALUE WHEN SCANNER IS CANCELLED

                                        String message = "READY FOR INSPECTION";
                                        String RoomName = "Room10";
                                        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
                                        reference.setValue(message);


                                    }
                                });


                            }
                        });
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {


            }
        });

//ROOMS




    }

    //TOGGLE BAR OF THE NAVIGATION BAR


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
}
