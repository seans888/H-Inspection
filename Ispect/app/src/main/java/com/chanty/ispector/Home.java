package com.chanty.ispector;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //DRAWER LAYOUT
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        //NAVIGATION DRAWER
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();



 getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//NAVIGATION VIEW GETS FROM NAV_MENU LAYOUT
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
                    String userEmail1 = intent1.getStringExtra("USER_EMAIL");
                    String userKey1 = intent1.getStringExtra("USER_KEY");
                    String userType1 = intent1.getStringExtra("USER_TYPE");
                    accountActivity5.putExtra("userEmail", userEmail1);
                    accountActivity5.putExtra("userKey", userKey1);
                    accountActivity5.putExtra("userType", userType1);
                    startActivity(accountActivity5);
                    finish();
                    break;

                case(R.id.nav_normal): Intent accountActivity6 = new Intent(getApplicationContext(), ScannerParent.class);
                    Intent intent = getIntent();
                    String userEmail = intent.getStringExtra("USER_EMAIL");
                    String userKey = intent.getStringExtra("USER_KEY");
                    String userType = intent.getStringExtra("USER_TYPE");
                    accountActivity6.putExtra("userEmail", userEmail);
                    accountActivity6.putExtra("userKey", userKey);
                    accountActivity6.putExtra("userType", userType);
                    startActivity(accountActivity6);
                    finish();
                    break;


            }
                return true;
            } });

        //NAVIGATION DRAWER
    }