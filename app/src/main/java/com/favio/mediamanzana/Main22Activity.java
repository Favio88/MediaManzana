package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main22Activity extends AppCompatActivity {

    Button btn_aceptar;
    ImageView iv_atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        btn_aceptar=findViewById(R.id.btn_aceptar);
        iv_atras=findViewById(R.id.iv_atras);

        btn_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_main4Activity=new Intent(Main22Activity.this, Main4Activity.class);
                startActivity(intent_main4Activity);
                finish();
            }
        });

        iv_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_main2Activity=new Intent(Main22Activity.this, Main2Activity.class);
                startActivity(intent_main2Activity);
                finish();
            }
        });
    }
}
