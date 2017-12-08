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

         //ASSIGN INSTANCE
        mDatabaseRef = FirebaseDatabase.getInstance().getReference();
        mUserCheckData =  FirebaseDatabase.getInstance().getReference().child("Users");
        nAuth = FirebaseAuth.getInstance();





        nAuthlistener = new FirebaseAuth.AuthStateListener(){
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                FirebaseUser user = firebaseAuth.getCurrentUser();

                if (user != null) {

                    final String emailForVer = user.getEmail();
                    mUserCheckData.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {

                            checkUserValidation(dataSnapshot, emailForVer);

                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });

                } else {


                }


            }

        };

         //ON CLICK LISTENER

        createUser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {


                final String userEmailString, userPassString,FinalString;
                int id = Usertype.getCheckedRadioButtonId();
                RadioButton userType = (RadioButton) findViewById(id);

                userEmailString = userEmailEdit.getText().toString();
                userPassString = userPasswordEdit.getText().toString();
                FinalString = userType.getText().toString();







                if (!TextUtils.isEmpty(userEmailString) && !TextUtils.isEmpty(userPassString))
                {
                    nAuth.createUserWithEmailAndPassword(userEmailString,userPassString).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful())
                            {


                                DatabaseReference mChildDatabase = mDatabaseRef.child("Users").push();
                                String key_user = mChildDatabase.getKey();
                                String user_id = nAuth.getCurrentUser().getUid();
                                mChildDatabase.child("UserType").setValue(FinalString);
                                mChildDatabase.child("userID").setValue(user_id);
                                mChildDatabase.child("isVerified").setValue("unverified");
                                mChildDatabase.child("userKey").setValue(key_user);
                                mChildDatabase.child("emailUser").setValue(userEmailString);
                                mChildDatabase.child("passWordUser").setValue(userPassString);
                                Toast.makeText(Registration.this, "User Account Created! Please login!", Toast.LENGTH_LONG).show();
                                Intent myIntent  = new Intent(Registration.this, Login.class);
                                startActivity(myIntent);
                            }
                            else
                            {

                                Log.w("TAG", "createUserWithEmail:failure",task.getException());
                                //Toast.makeText(MainActivity.this, "User Account Creation Fail", Toast.LENGTH_LONG).show();
                                Toast.makeText(Registration.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                                startActivity(new Intent(Registration.this, Registration.class));


                            }
                        }
                    });
                }
                else{
                    if (TextUtils.isEmpty(userEmailString)) {
                        userEmailEdit.setError("Required.");

                    } else {
                        userPasswordEdit.setError(null);
                    }
                }



            }
        });

        //MOVE TO LOGIN

        moveToLoginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                startActivity(new Intent(Registration.this, Login.class));



            }
        });



    }




    private void checkUserValidation(DataSnapshot dataSnapshot, String emailForVer) {


        Iterator iterator = dataSnapshot.getChildren().iterator();

        while (iterator.hasNext())
        {

            DataSnapshot dataUser = (DataSnapshot) iterator.next();



            if(String.valueOf(dataUser.child("emailUser").getValue()).equals(emailForVer) &&  dataUser.child("emailUser") != null)
            {


                if(String.valueOf(dataUser.child("isVerified").getValue()).equals("unverified") && dataUser.child("isVerified") != null)
                {

                    Intent in = new Intent(Registration.this, Login.class);
                    in.putExtra("USER_KEY" ,  String.valueOf(dataUser.child("userKey").getValue()));
                    in.putExtra("USER_EMAIL" ,  String.valueOf(dataUser.child("emailUser").getValue()));
                    in.putExtra("USER_EMAIL" ,  String.valueOf(dataUser.child("passWordUser").getValue()));
                    in.putExtra("USER_ID" ,  String.valueOf(dataUser.child("userID").getValue()));
                    startActivity(in);



                }else
                {
                    startActivity(new Intent(Registration.this, Registration.class));
                }

            }

        }

    }











