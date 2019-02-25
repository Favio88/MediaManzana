package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    Button btn_facebook, btn_google, btn_correo;
    TextView tv_irRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_facebook=findViewById(R.id.btn_facebook);
        btn_google=findViewById(R.id.btn_google);
        btn_correo=findViewById(R.id.btn_correo);
        tv_irRegistro=findViewById(R.id.tv_irRegistro);

        btn_facebook.setOnClickListener(this);
        btn_google.setOnClickListener(this);
        btn_correo.setOnClickListener(this);
        tv_irRegistro.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_facebook:
                irActivity4();
                break;
            case R.id.btn_google:
                irActivity4();
                break;
            case R.id.btn_correo:
                Intent intent_main22Activity=new Intent(Main2Activity.this, Main22Activity.class);
                startActivity(intent_main22Activity);
                break;
            case R.id.tv_irRegistro:
                Intent intent_main21Activity=new Intent(Main2Activity.this, Main21Activity.class);
                startActivity(intent_main21Activity);
                break;
        }

    }

    public void irActivity4(){
        Intent intent_main4Activity=new Intent(Main2Activity.this, Main4Activity.class);
        startActivity(intent_main4Activity);
        finish();
    }

}
