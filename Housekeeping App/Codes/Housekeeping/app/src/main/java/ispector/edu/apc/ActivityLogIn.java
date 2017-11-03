package ispector.edu.apc;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ispector.edu.apc.async.Get_UserData;
import ispector.edu.apc.global.Logs;

public class ActivityLogIn extends AppCompatActivity {

    private Button btn_LogIn;
    private Context c;
    private String TAG = ActivityLogIn.class.getSimpleName()
            , _username
            , _password;
    private EditText et_Username
            , et_Password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        c = this;

        init();
        doThis();


    }

    private void doThis() {

        btn_LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                _username = et_Username.getText().toString();
                _password = et_Password.getText().toString();

                if (_password.equals("") ||_username.equals("")){
                    Toast.makeText(c, "Username or Password can not be empty.", Toast.LENGTH_LONG).show();
                }else{
                    Get_UserData get_User_Data = new Get_UserData(new Get_UserData.MyInterface() {
                        @Override
                        public void myMethod(String result) {
                            Logs.show("v", TAG, "result >> " + result);
                            if (result.startsWith("Invalid")){
                                et_Username.setText("");
                                et_Password.setText("");
                                Toast.makeText(c, result, Toast.LENGTH_LONG).show();
                            }else{
                                et_Username.setText("");
                                et_Password.setText("");
                                Intent in = new Intent(c, ActivityRoomSelection.class);
                                in.putExtra("result", result);
                                startActivity(in);
                                finish();
                            }
                        }
                    }, c, _username, _password);get_User_Data.execute();
                }


            }
        });
    }

    private void init() {

        et_Username = (EditText) findViewById(R.id.et_Username);
        et_Password = (EditText) findViewById(R.id.et_Password);
        btn_LogIn = (Button) findViewById(R.id.btn_LogIn);
    }
}
