package com.favio.mediamanzana;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(5000,1000){

            @Override
            public void onTick(long l) {


            }

            @Override
            public void onFinish() {

                Intent intent_main2Activity=new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent_main2Activity);

                finish();
            }
        }.start();
    }
}
