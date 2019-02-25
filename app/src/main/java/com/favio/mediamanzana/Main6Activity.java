package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Main6Activity extends AppCompatActivity implements View.OnClickListener{

    ImageView iv_cerrar;
    LinearLayout ll_foto1, ll_foto2, ll_foto3, ll_foto4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        iv_cerrar=findViewById(R.id.iv_cerrar);
        ll_foto1=findViewById(R.id.ll_foto1);
        ll_foto2=findViewById(R.id.ll_foto2);
        ll_foto3=findViewById(R.id.ll_foto3);
        ll_foto4=findViewById(R.id.ll_foto4);

        iv_cerrar.setOnClickListener(this);
        ll_foto1.setOnClickListener(this);
        ll_foto2.setOnClickListener(this);
        ll_foto3.setOnClickListener(this);
        ll_foto4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.iv_cerrar:
                irActivity3();
                break;
            case R.id.ll_foto1:
                irActivity3();
                break;
            case R.id.ll_foto2:
                irActivity3();
                break;
            case R.id.ll_foto3:
                irActivity3();
                break;
            case R.id.ll_foto4:
                irActivity3();
                break;
        }
    }

    public void irActivity3(){
        Intent intent_main3Activity=new Intent(Main6Activity.this, Main3Activity.class);
        startActivity(intent_main3Activity);
    }
}
