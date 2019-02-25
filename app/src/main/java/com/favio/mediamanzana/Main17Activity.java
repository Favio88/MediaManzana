package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main17Activity extends AppCompatActivity {

    ImageView iv_atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        iv_atras=findViewById(R.id.iv_atras);

        iv_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_main16Activity=new Intent(Main17Activity.this, Main16Activity.class);
                startActivity(intent_main16Activity);
                finish();
            }
        });
    }
}
