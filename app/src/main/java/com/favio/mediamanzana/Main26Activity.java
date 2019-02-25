package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Main26Activity extends AppCompatActivity {

    LinearLayout ll_bloqueados, ll_bloquear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main26);

        ll_bloqueados=findViewById(R.id.ll_bloqueados);
        ll_bloquear=findViewById(R.id.ll_bloquear);

        ll_bloqueados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irActivity12();
            }
        });
        ll_bloquear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irActivity12();
            }
        });
    }

    public void irActivity12(){
        Intent intent_main12Activity=new Intent(Main26Activity.this, Main12Activity.class);
        startActivity(intent_main12Activity);
        finish();
    }
}
