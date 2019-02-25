package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main15Activity extends AppCompatActivity {

    ImageView iv_atras, iv_capturar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        iv_atras=findViewById(R.id.iv_atras);
        iv_capturar=findViewById(R.id.iv_capturar);

        iv_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_main16Activity=   new Intent(Main15Activity.this, Main16Activity.class);
                startActivity(intent_main16Activity);
                finish();
            }
        });

        iv_capturar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_main16Activity=new Intent(Main15Activity.this, Main16Activity.class);
                startActivity(intent_main16Activity);
                finish();
            }
        });
    }
}
