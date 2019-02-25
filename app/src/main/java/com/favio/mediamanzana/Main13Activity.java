package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Main13Activity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout ll_mensaje1, ll_mensaje2, ll_mensaje3, ll_mensaje4, ll_mensaje5, ll_mensaje6, ll_mensaje7;
    ImageView iv_guardado, iv_gusta, iv_inicio, iv_mensajes, iv_perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        ll_mensaje1=findViewById(R.id.ll_mensaje1);
        ll_mensaje2=findViewById(R.id.ll_mensaje2);
        ll_mensaje3=findViewById(R.id.ll_mensaje3);
        ll_mensaje4=findViewById(R.id.ll_mensaje4);
        ll_mensaje5=findViewById(R.id.ll_mensaje5);
        ll_mensaje6=findViewById(R.id.ll_mensaje6);
        ll_mensaje7=findViewById(R.id.ll_mensaje7);
        iv_guardado=findViewById(R.id.iv_guardado);
        iv_gusta=findViewById(R.id.iv_gusta);
        iv_inicio=findViewById(R.id.iv_inicio);
        iv_mensajes=findViewById(R.id.iv_mensajes);
        iv_perfil=findViewById(R.id.iv_perfil);

        ll_mensaje1.setOnClickListener(this);
        ll_mensaje2.setOnClickListener(this);
        ll_mensaje3.setOnClickListener(this);
        ll_mensaje4.setOnClickListener(this);
        ll_mensaje5.setOnClickListener(this);
        ll_mensaje6.setOnClickListener(this);
        ll_mensaje7.setOnClickListener(this);
        iv_guardado.setOnClickListener(this);
        iv_gusta.setOnClickListener(this);
        iv_inicio.setOnClickListener(this);
        iv_mensajes.setOnClickListener(this);
        iv_perfil.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.ll_mensaje1:
                irActivity14();
                break;
            case R.id.ll_mensaje2:
                irActivity14();
                break;
            case R.id.ll_mensaje3:
                irActivity14();
                break;
            case R.id.ll_mensaje4:
                irActivity14();
                break;
            case R.id.ll_mensaje5:
                irActivity14();
                break;
            case R.id.ll_mensaje6:
                irActivity14();
                break;
            case R.id.ll_mensaje7:
                irActivity14();
                break;
            case R.id.iv_guardado:
                Intent intent_main19Activity=new Intent(Main13Activity.this, Main19Activity.class);
                startActivity(intent_main19Activity);
                break;
            case R.id.iv_gusta:
                Intent intent_main18Activity=new Intent(Main13Activity.this, Main18Activity.class);
                startActivity(intent_main18Activity);
                break;
            case R.id.iv_inicio:
                Intent intent_main4Activity=new Intent(Main13Activity.this, Main4Activity.class);
                startActivity(intent_main4Activity);
                break;
            case R.id.iv_mensajes:
                Intent intent_main13Activity=new Intent(Main13Activity.this, Main13Activity.class);
                startActivity(intent_main13Activity);
                break;
            case R.id.iv_perfil:
                Intent intent_main10Activity=new Intent(Main13Activity.this, Main10Activity.class);
                startActivity(intent_main10Activity);
                break;
        }

    }

    public void irActivity14(){
        Intent intent_main14Activity=new Intent(Main13Activity.this, Main14Activity.class);
        startActivity(intent_main14Activity);
    }
}
