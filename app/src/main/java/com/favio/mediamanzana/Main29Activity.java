package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main29Activity extends AppCompatActivity implements View.OnClickListener{

    Button btn_aceptar, btn_cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main29);

        btn_aceptar=findViewById(R.id.btn_aceptar);
        btn_cancelar=findViewById(R.id.btn_cancelar);

        btn_aceptar.setOnClickListener(this);
        btn_cancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_aceptar:
                irActivity19();
                break;
            case R.id.btn_cancelar:
                irActivity19();
                break;
        }
    }

    public void irActivity19(){
        Intent intent_main19Activity=new Intent(Main29Activity.this, Main19Activity.class);
        startActivity(intent_main19Activity);
        finish();
    }
}
