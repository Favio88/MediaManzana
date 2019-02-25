package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout ll_conversacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ll_conversacion=findViewById(R.id.ll_conversacion);

        ll_conversacion.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent_main14Activity=new Intent(Main5Activity.this, Main14Activity.class);
        startActivity(intent_main14Activity);
        finish();
    }
}
