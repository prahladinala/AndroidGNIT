package com.prahlad.gnit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread xyz = new Thread(){
            public void run()
            {
                try{
                    sleep(2000);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(Splash.this, MainActivity.class);
                    startActivity(intent);
                }
            }

        };
        xyz.start();
    }


    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}