package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Main11Activity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout ll_informacion;
    ImageView iv_guardado, iv_gusta, iv_inicio, iv_mensajes, iv_perfil, iv_editar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        ll_informacion=findViewById(R.id.ll_infomacion);
        iv_guardado=findViewById(R.id.iv_guardado);
        iv_gusta=findViewById(R.id.iv_gusta);
        iv_inicio=findViewById(R.id.iv_inicio);
        iv_mensajes=findViewById(R.id.iv_mensajes);
        iv_perfil=findViewById(R.id.iv_perfil);
        iv_editar=findViewById(R.id.iv_editar);

        ll_informacion.setOnClickListener(this);
        iv_guardado.setOnClickListener(this);
        iv_gusta.setOnClickListener(this);
        iv_inicio.setOnClickListener(this);
        iv_mensajes.setOnClickListener(this);
        iv_perfil.setOnClickListener(this);
        iv_editar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.ll_infomacion:
                irActivity10();
                break;
            case R.id.iv_editar:
                Intent intent_main28Activity=new Intent(Main11Activity.this, Main28Activity.class);
                startActivity(intent_main28Activity);
                break;
            case R.id.iv_guardado:
                Intent intent_main19Activity=new Intent(Main11Activity.this, Main19Activity.class);
                startActivity(intent_main19Activity);
                break;
            case R.id.iv_gusta:
                Intent intent_main18Activity=new Intent(Main11Activity.this, Main18Activity.class);
                startActivity(intent_main18Activity);
                break;
            case R.id.iv_inicio:
                Intent intent_main4Activity=new Intent(Main11Activity.this, Main4Activity.class);
                startActivity(intent_main4Activity);
                break;
            case R.id.iv_mensajes:
                Intent intent_main13Activity=new Intent(Main11Activity.this, Main13Activity.class);
                startActivity(intent_main13Activity);
                break;
            case R.id.iv_perfil:
                irActivity10();
                break;
        }

    }

    public void irActivity10(){
        Intent intent_main10Activity=new Intent(Main11Activity.this, Main10Activity.class);
        startActivity(intent_main10Activity);
    }
}
