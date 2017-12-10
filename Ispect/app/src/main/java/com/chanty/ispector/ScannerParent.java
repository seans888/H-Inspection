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