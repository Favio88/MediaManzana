package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Main10Activity extends AppCompatActivity implements View.OnClickListener{

    Button btn_cerrarSesion;
    FrameLayout fl_informacion, fl_privacidad, fl_leGustoA, fl_desactivar;
    ImageView iv_guardado, iv_gusta, iv_inicio, iv_mensajes, iv_perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        fl_informacion=findViewById(R.id.fl_informacion);
        fl_privacidad=findViewById(R.id.fl_privacidad);
        fl_leGustoA=findViewById(R.id.fl_leGustoA);
        btn_cerrarSesion=findViewById(R.id.btn_cerrarSesion);
        iv_guardado=findViewById(R.id.iv_guardado);
        iv_gusta=findViewById(R.id.iv_gusta);
        iv_inicio=findViewById(R.id.iv_inicio);
        iv_mensajes=findViewById(R.id.iv_mensajes);
        iv_perfil=findViewById(R.id.iv_perfil);
        fl_desactivar=findViewById(R.id.fl_desactivar);

        fl_informacion.setOnClickListener(this);
        fl_privacidad.setOnClickListener(this);
        fl_leGustoA.setOnClickListener(this);
        btn_cerrarSesion.setOnClickListener(this);
        iv_guardado.setOnClickListener(this);
        iv_gusta.setOnClickListener(this);
        iv_inicio.setOnClickListener(this);
        iv_mensajes.setOnClickListener(this);
        iv_perfil.setOnClickListener(this);
        fl_desactivar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.fl_informacion:
                Intent intent_main11Activity=new Intent(Main10Activity.this, Main11Activity.class);
                startActivity(intent_main11Activity);
                break;
            case R.id.fl_privacidad:
                Intent intent_main12Activity=new Intent(Main10Activity.this, Main12Activity.class);
                startActivity(intent_main12Activity);
                break;
            case R.id.fl_desactivar:
                Intent intent_main23Activity=new Intent(Main10Activity.this, Main23Activity.class);
                startActivity(intent_main23Activity);
                break;
            case R.id.fl_leGustoA:
                Intent intent_main20Activity=new Intent(Main10Activity.this, Main20Activity.class);
                startActivity(intent_main20Activity);
                break;
            case R.id.btn_cerrarSesion:
                Intent intent_main2Activity=new Intent(Main10Activity.this, Main2Activity.class);
                startActivity(intent_main2Activity);
                finish();
                break;
            case R.id.iv_guardado:
                Intent intent_main19Activity=new Intent(Main10Activity.this, Main19Activity.class);
                startActivity(intent_main19Activity);
                break;
            case R.id.iv_gusta:
                Intent intent_main18Activity=new Intent(Main10Activity.this, Main18Activity.class);
                startActivity(intent_main18Activity);
                break;
            case R.id.iv_inicio:
                Intent intent_main4Activity=new Intent(Main10Activity.this, Main4Activity.class);
                startActivity(intent_main4Activity);
                break;
            case R.id.iv_mensajes:
                Intent intent_main13Activity=new Intent(Main10Activity.this, Main13Activity.class);
                startActivity(intent_main13Activity);
                break;
            case R.id.iv_perfil:
                Intent intent_main10Activity=new Intent(Main10Activity.this, Main10Activity.class);
                startActivity(intent_main10Activity);
                break;
        }
    }

}
