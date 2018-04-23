package com.example.mehdifamily.googleapi;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    Animation uptodown;
    ImageView img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        img1 = (ImageView) findViewById(R.id.img1);

        uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        img1.setAnimation(uptodown);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, Choosetype.class);
                startActivity(i);
                finish();
            }
        }, 5 * 1000);

    }
}
