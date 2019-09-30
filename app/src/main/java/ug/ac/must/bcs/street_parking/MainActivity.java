package ug.ac.must.bcs.street_parking;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText password;
    private Button Login;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.id_name);
        password = findViewById(R.id.id_pwd);
        Login = findViewById(R.id.btn_login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(),password.getText().toString());
            }
        });

    }
    private void validate(String username , String password){
        if((username == "Admin") && (password =="1234")){
             Intent intent = new Intent(MainActivity.this,SecondActivity.class);
             startActivity(intent);
        }

    }
}
