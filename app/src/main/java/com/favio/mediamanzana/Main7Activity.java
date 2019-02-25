package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Main7Activity extends AppCompatActivity {

    LinearLayout ll_guardar, ll_cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        ll_guardar=findViewById(R.id.ll_guardar);
        ll_cancelar=findViewById(R.id.ll_cancelar);

        ll_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_main19Activity=new Intent( Main7Activity.this, Main19Activity.class);
                startActivity(intent_main19Activity);
                finish();
            }
        });

        ll_cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_main3Activity=new Intent(Main7Activity.this, Main3Activity.class);
                startActivity(intent_main3Activity);
                finish();
            }
        });
    }
}
