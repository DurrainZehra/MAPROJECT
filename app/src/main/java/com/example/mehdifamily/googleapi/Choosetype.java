package com.example.mehdifamily.googleapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Choosetype extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosetype);

        Button ordbtn = (Button)findViewById(R.id.btncus);
        ordbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Choosetype.this, Login.class);
                startActivity(intent);
            }
        });

        Button ordbtn2 = (Button)findViewById(R.id.btnown);
        ordbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Choosetype.this, Login.class);
                startActivity(intent);
            }

        });

        TextView txtr = (TextView)findViewById(R.id.reg);
        txtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Choosetype.this, RegisterActivity.class);
                startActivity(i);
            }
        });

    }
}
