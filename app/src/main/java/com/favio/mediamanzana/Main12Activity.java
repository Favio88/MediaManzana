package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Main12Activity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout ll_privacidad, ll_verme, ll_bloqueados, ll_politica;
    ImageView iv_guardado, iv_gusta, iv_inicio, iv_mensajes, iv_perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        ll_privacidad=findViewById(R.id.ll_privacidad);
        iv_guardado=findViewById(R.id.iv_guardado);
        iv_gusta=findViewById(R.id.iv_gusta);
        iv_inicio=findViewById(R.id.iv_inicio);
        iv_mensajes=findViewById(R.id.iv_mensajes);
        iv_perfil=findViewById(R.id.iv_perfil);
        ll_verme=findViewById(R.id.ll_verme);
        ll_bloqueados=findViewById(R.id.ll_bloqueados);
        ll_politica=findViewById(R.id.ll_politica);

        ll_privacidad.setOnClickListener(this);
        iv_guardado.setOnClickListener(this);
        iv_gusta.setOnClickListener(this);
        iv_inicio.setOnClickListener(this);
        iv_mensajes.setOnClickListener(this);
        iv_perfil.setOnClickListener(this);
        ll_verme.setOnClickListener(this);
        ll_bloqueados.setOnClickListener(this);
        ll_politica.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.ll_privacidad:
                irActivity10();
                break;
            case R.id.iv_guardado:
                Intent intent_main19Activity=new Intent(Main12Activity.this, Main19Activity.class);
                startActivity(intent_main19Activity);
                break;
            case R.id.iv_gusta:
                Intent intent_main18Activity=new Intent(Main12Activity.this, Main18Activity.class);
                startActivity(intent_main18Activity);
                break;
            case R.id.iv_inicio:
                Intent intent_main4Activity=new Intent(Main12Activity.this, Main4Activity.class);
                startActivity(intent_main4Activity);
                break;
            case R.id.iv_mensajes:
                Intent intent_main13Activity=new Intent(Main12Activity.this, Main13Activity.class);
                startActivity(intent_main13Activity);
                break;
            case R.id.iv_perfil:
                irActivity10();
                break;
            case R.id.ll_verme:
                Intent intent_main27Activity=new Intent(Main12Activity.this, Main27Activity.class);
                startActivity(intent_main27Activity);
                break;
            case R.id.ll_bloqueados:
                Intent intent_main26Activity=new Intent(Main12Activity.this, Main26Activity.class);
                startActivity(intent_main26Activity);
                break;
            case R.id.ll_politica:
                Intent intent_main25Activity=new Intent(Main12Activity.this, Main25Activity.class);
                startActivity(intent_main25Activity);
                break;
        }
    }

    public void irActivity10(){
        Intent intent_main10Activity=new Intent(Main12Activity.this, Main10Activity.class);
        startActivity(intent_main10Activity);
    }
}
