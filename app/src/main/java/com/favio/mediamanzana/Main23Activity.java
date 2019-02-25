package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main23Activity extends AppCompatActivity implements View.OnClickListener{

    Button btn_aceptar, btn_cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);

        btn_aceptar=findViewById(R.id.btn_aceptar);
        btn_cancelar=findViewById(R.id.btn_cancelar);

        btn_aceptar.setOnClickListener(this);
        btn_cancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_aceptar:
                Intent intent_main2Activity=new Intent(Main23Activity.this, Main2Activity.class);
                startActivity(intent_main2Activity);
                finish();
                break;
            case R.id.btn_cancelar:
                Intent intent_main10Activity=new Intent(Main23Activity.this, Main10Activity.class);
                startActivity(intent_main10Activity);
                finish();
                break;
        }
    }

}
