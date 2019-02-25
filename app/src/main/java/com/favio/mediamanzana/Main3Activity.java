package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{

    ImageView iv_fotoPerfil, iv_opciones, iv_corazon, iv_mensajes, iv_galeria, iv_notificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        iv_fotoPerfil=findViewById(R.id.iv_fotoPerfil);
        iv_opciones=findViewById(R.id.iv_opciones);
        iv_corazon=findViewById(R.id.iv_corazon);
        iv_mensajes=findViewById(R.id.iv_mensajes);
        iv_galeria=findViewById(R.id.iv_galeria);
        iv_notificacion=findViewById(R.id.iv_notificacion);

        iv_fotoPerfil.setOnClickListener(this);
        iv_opciones.setOnClickListener(this);
        iv_corazon.setOnClickListener(this);
        iv_mensajes.setOnClickListener(this);
        iv_galeria.setOnClickListener(this);
        iv_notificacion.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.iv_fotoPerfil:
                Intent intent_main10Activity=new Intent(Main3Activity.this, Main10Activity.class);
                startActivity(intent_main10Activity);
                break;
            case R.id.iv_opciones:
                Intent intent_main7Activity=new Intent(Main3Activity.this, Main7Activity.class);
                startActivity(intent_main7Activity);
                break;
            case R.id.iv_corazon:
                Intent intent_main18Activity=new Intent(Main3Activity.this, Main18Activity.class);
                startActivity(intent_main18Activity);
                break;
            case R.id.iv_mensajes:
                Intent intent_main5Activity=new Intent(Main3Activity.this, Main5Activity.class);
                startActivity(intent_main5Activity);
                break;
            case R.id.iv_galeria:
                Intent intent_main6Activity=new Intent(Main3Activity.this, Main6Activity.class);
                startActivity(intent_main6Activity);
                break;
            case R.id.iv_notificacion:
                Intent intent_main30Activity=new Intent(Main3Activity.this, Main30Activity.class);
                startActivity(intent_main30Activity);
                break;
        }
    }
}
