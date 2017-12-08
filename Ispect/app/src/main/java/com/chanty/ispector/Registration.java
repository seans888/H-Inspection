package com.chanty.ispector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Iterator;

public class Registration extends Activity {

    //VIEW AND WIDGETS
    TextView createUser, moveToLoginBtn, moveToLoginBtn1;
    EditText userEmailEdit, userPasswordEdit;
    RadioButton HK, HKS;
    RadioGroup Usertype;


    private static final String TAG = "EmailPassword";

    //FIREBASE AUTH FIELDS
    FirebaseAuth nAuth;
    FirebaseAuth.AuthStateListener nAuthlistener;

    DatabaseReference mDatabaseRef, mUserCheckData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_registration);





        //ASSIGN ID
        createUser = (TextView) findViewById(R.id.createUserBtn);
        moveToLoginBtn = (TextView) findViewById(R.id.moveToLogin);
        userEmailEdit = (EditText) findViewById(R.id.emailEditTextCreate);
        userPasswordEdit = (EditText) findViewById(R.id.passEditTextCreate);
        Usertype = (RadioGroup) findViewById(R.id.radioGroup);








