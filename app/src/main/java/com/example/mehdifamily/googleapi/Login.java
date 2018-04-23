package com.example.mehdifamily.googleapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText mail = (EditText) findViewById(R.id.email);
        final EditText pwd  = (EditText) findViewById(R.id.password);

        Button btnlog = (Button)findViewById(R.id.login);
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!mail.getText().toString().matches("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}")) {
                    mail.requestFocus();
                    mail.setError("Enter Email ID");
                } else if (!pwd.getText().toString().matches("^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$")) {
                    pwd.requestFocus();
                    pwd.setError("Enter Password");
                } else {
                    Intent i = new Intent(Login.this, MapsActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}