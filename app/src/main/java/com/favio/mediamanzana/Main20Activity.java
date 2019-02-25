package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main20Activity extends AppCompatActivity implements View.OnClickListener{

    ImageView iv_fotoPerfil, iv_guardado, iv_gusta, iv_inicio, iv_mensajes, iv_perfil, iv_ver1, iv_ver2, iv_ver3, iv_ver4, iv_mensaje1,
            iv_mensaje2, iv_mensaje3, iv_mensaje4, iv_corazon1, iv_corazon2, iv_notificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);

        iv_fotoPerfil=findViewById(R.id.iv_fotoPerfil);
        iv_ver1=findViewById(R.id.iv_ver1);
        iv_ver2=findViewById(R.id.iv_ver2);
        iv_ver3=findViewById(R.id.iv_ver3);
        iv_ver4=findViewById(R.id.iv_ver4);
        iv_mensaje1=findViewById(R.id.iv_mensaje1);
        iv_mensaje2=findViewById(R.id.iv_mensaje2);
        iv_mensaje3=findViewById(R.id.iv_mensaje3);
        iv_mensaje4=findViewById(R.id.iv_mensaje4);
        iv_corazon1=findViewById(R.id.iv_corazon1);
        iv_corazon2=findViewById(R.id.iv_corazon2);
        iv_guardado=findViewById(R.id.iv_guardado);
        iv_gusta=findViewById(R.id.iv_gusta);
        iv_inicio=findViewById(R.id.iv_inicio);
        iv_mensajes=findViewById(R.id.iv_mensajes);
        iv_perfil=findViewById(R.id.iv_perfil);

        iv_fotoPerfil.setOnClickListener(this);
        iv_ver1.setOnClickListener(this);
        iv_ver2.setOnClickListener(this);
        iv_ver3.setOnClickListener(this);
        iv_ver4.setOnClickListener(this);
        iv_mensaje1.setOnClickListener(this);
        iv_mensaje2.setOnClickListener(this);
        iv_mensaje3.setOnClickListener(this);
        iv_mensaje4.setOnClickListener(this);
        iv_corazon1.setOnClickListener(this);
        iv_corazon2.setOnClickListener(this);
        iv_guardado.setOnClickListener(this);
        iv_gusta.setOnClickListener(this);
        iv_inicio.setOnClickListener(this);
        iv_mensajes.setOnClickListener(this);
        iv_perfil.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.iv_fotoPerfil:
                irActivity10();
                break;
            case R.id.iv_ver1:
                irActivity3();
                break;
            case R.id.iv_ver2:
                irActivity3();
                break;
            case R.id.iv_ver3:
                irActivity3();
                break;
            case R.id.iv_ver4:
                irActivity3();
                break;
            case R.id.iv_mensaje1:
                irActivity5();
                break;
            case R.id.iv_mensaje2:
                irActivity5();
                break;
            case R.id.iv_mensaje3:
                irActivity5();
                break;
            case R.id.iv_mensaje4:
                irActivity5();
                break;
            case R.id.iv_corazon1:
                irActivity5();
                break;
            case R.id.iv_corazon2:
                irActivity5();
                break;
            case R.id.iv_guardado:
                Intent intent_main19Activity=new Intent(Main20Activity.this, Main20Activity.class);
                startActivity(intent_main19Activity);
                break;
            case R.id.iv_gusta:
                Intent intent_main18Activity=new Intent(Main20Activity.this, Main18Activity.class);
                startActivity(intent_main18Activity);
                break;
            case R.id.iv_inicio:
                Intent intent_main4Activity=new Intent(Main20Activity.this, Main4Activity.class);
                startActivity(intent_main4Activity);
                break;
            case R.id.iv_mensajes:
                Intent intent_main13Activity=new Intent(Main20Activity.this, Main13Activity.class);
                startActivity(intent_main13Activity);
                break;
            case R.id.iv_perfil:
                irActivity10();
                break;
        }
    }

    public void irActivity10(){
        Intent intent_main10Activity=new Intent(Main20Activity.this, Main10Activity.class);
        startActivity(intent_main10Activity);
    }

    public void irActivity5(){
        Intent intent_main5Activity=new Intent(Main20Activity.this, Main5Activity.class);
        startActivity(intent_main5Activity);
    }

    public void irActivity3(){
        Intent intent_main3Activity=new Intent(Main20Activity.this, Main3Activity.class);
        startActivity(intent_main3Activity);
    }

    public void irActivity18(){
        Intent intent_main18Activity=new Intent(Main20Activity.this, Main18Activity.class);
        startActivity(intent_main18Activity);
    }

}