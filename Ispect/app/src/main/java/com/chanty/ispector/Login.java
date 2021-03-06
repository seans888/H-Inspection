package com.chanty.ispector;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
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

public class Login extends Activity {

    //VIEW AND WIDGETS
    TextView loginBtn;
    TextView signupBtn;
    EditText userEmailEdit, userPasswordEdit;

     //STRING FIELDS
    String userEmailString, userPasswordString;

    //FIREBASE AUTH FIELDS
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener nAuthlistener;

    DatabaseReference mDatabaseRef;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        //ASSIGN IDS
        loginBtn = (TextView) findViewById(R.id.loginBtn);
        signupBtn = (TextView) findViewById(R.id.signupBtn);
        userEmailEdit = (EditText) findViewById(R.id.loginEditText);
        userPasswordEdit = (EditText) findViewById(R.id.loginPasswordEditText);

        //ASSIGN INSTANCE
        mAuth = FirebaseAuth.getInstance();
        mDatabaseRef = FirebaseDatabase.getInstance().getReference().child("Users");

nAuthlistener = new FirebaseAuth.AuthStateListener(){
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser User = firebaseAuth.getCurrentUser();

                if (User != null){

                    final String emailForVer = User.getEmail();

                    mDatabaseRef.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            checkUserValidation(dataSnapshot,emailForVer);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });




                }else{

                }


                signupBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        startActivity(new Intent(Login.this, Registration.class));
                    }
                });


            }


        };
         //ONCLICK LISTENER
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Perform Login Operation
                userEmailString = userEmailEdit.getText().toString().trim();
                userPasswordString = userPasswordEdit.getText().toString().trim();
                final String userType = "Housekeeper";




                if(!TextUtils.isEmpty(userEmailString) && !TextUtils.isEmpty(userPasswordString) && userPasswordString != null && userEmailString != null)
                {
                    mAuth.signInWithEmailAndPassword(userEmailString, userPasswordString).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful() )
                            {


                                mDatabaseRef.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        checkUserValidation(dataSnapshot, userEmailString);
                                        checkUserValidation(dataSnapshot, userType);

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                    }
                                });


                            }
                            else
                            {
                                Toast.makeText(Login.this, "User Login Failed", Toast.LENGTH_LONG).show();

                            }

                        }
                    });
                }
            }
        });

    }


 private void checkUserValidation(DataSnapshot dataSnapshot, String emailForVer) {
        Iterator iterator  = dataSnapshot.getChildren().iterator();

        while(iterator.hasNext())
        {
            DataSnapshot dataUser  = (DataSnapshot) iterator.next();
            if(String.valueOf(dataUser.child("emailUser").getValue()).equals(emailForVer) && dataUser.child("emailUser") != null) {
                if (String.valueOf(dataUser.child("isVerified").getValue()).equals("unverified") && dataUser.child("isVerified") != null) {
                    Intent in = new Intent(Login.this, Home.class);
                    in.putExtra("USER_KEY", String.valueOf(dataUser.child("userKey").getValue()));
                    in.putExtra("USER_EMAIL", String.valueOf(dataUser.child("emailUser").getValue()));
                    startActivity(in);
                } else {

                    Intent inte = new Intent(Login.this, Home.class);
                    startActivity(inte);

                }
            }


        }



    }









    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(nAuthlistener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mAuth.removeAuthStateListener(nAuthlistener);
    }
}
