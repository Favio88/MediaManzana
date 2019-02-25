package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView iv_fotoPerfil, iv_playChico, iv_opciones, iv_guardado, iv_gusta, iv_inicio, iv_mensajes, iv_perfil, iv_notificacion;
    LinearLayout ll_fotos1, ll_fotos2, ll_playGrande;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        iv_fotoPerfil=findViewById(R.id.iv_fotoPerfil);
        iv_playChico=findViewById(R.id.iv_playChico);
        iv_opciones=findViewById(R.id.iv_opciones);
        iv_guardado=findViewById(R.id.iv_guardado);
        iv_gusta=findViewById(R.id.iv_gusta);
        iv_inicio=findViewById(R.id.iv_inicio);
        iv_mensajes=findViewById(R.id.iv_mensajes);
        iv_perfil=findViewById(R.id.iv_perfil);
        ll_fotos1=findViewById(R.id.ll_fotos1);
        ll_fotos2=findViewById(R.id.ll_fotos2);
        ll_playGrande=findViewById(R.id.ll_playGrande);
        iv_notificacion=findViewById(R.id.iv_notificacion);

        iv_fotoPerfil.setOnClickListener(this);
        iv_playChico.setOnClickListener(this);
        iv_opciones.setOnClickListener(this);
        iv_guardado.setOnClickListener(this);
        iv_gusta.setOnClickListener(this);
        iv_inicio.setOnClickListener(this);
        iv_mensajes.setOnClickListener(this);
        iv_perfil.setOnClickListener(this);
        ll_fotos1.setOnClickListener(this);
        ll_fotos2.setOnClickListener(this);
        ll_playGrande.setOnClickListener(this);
        iv_notificacion.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.iv_fotoPerfil:
                irActivity10();
                break;
            case R.id.iv_playChico:
                Intent intent_main16Activity=new Intent(Main4Activity.this, Main16Activity.class);
                startActivity(intent_main16Activity);
                break;
            case R.id.iv_opciones:
                Intent intent_main9Activity=new Intent(Main4Activity.this, Main9Activity.class);
                startActivity(intent_main9Activity);
                break;
            case R.id.iv_guardado:
                Intent intent_main19Activity=new Intent(Main4Activity.this, Main19Activity.class);
                startActivity(intent_main19Activity);
                break;
            case R.id.iv_gusta:
                Intent intent_main18Activity=new Intent(Main4Activity.this, Main18Activity.class);
                startActivity(intent_main18Activity);
                break;
            case R.id.iv_mensajes:
                Intent intent_main13Activity=new Intent(Main4Activity.this, Main13Activity.class);
                startActivity(intent_main13Activity);
                break;
            case R.id.iv_perfil:
                irActivity10();
                break;
            case R.id.ll_fotos1:
                irActivity3();
                break;
            case R.id.ll_fotos2:
                irActivity3();
                break;
            case R.id.ll_playGrande:
                Intent intent_main17Activity=new Intent(Main4Activity.this, Main17Activity.class);
                startActivity(intent_main17Activity);
                finish();
                break;
            case R.id.iv_notificacion:
                Intent intent_main30Activity=new Intent(Main4Activity.this, Main30Activity.class);
                startActivity(intent_main30Activity);
                break;
        }
    }

    public void irActivity10(){
        Intent intent_main10Activity=new Intent(Main4Activity.this, Main10Activity.class);
        startActivity(intent_main10Activity);
    }

    public void irActivity3(){
        Intent intent_main3Activity=new Intent(Main4Activity.this, Main3Activity.class);
        startActivity(intent_main3Activity);
    }
}
