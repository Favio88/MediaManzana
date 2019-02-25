package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Main28Activity extends AppCompatActivity {

    LinearLayout ll_editar;
    Button btn_aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main28);

        ll_editar=findViewById(R.id.ll_editar);
        btn_aceptar=findViewById(R.id.btn_aceptar);

        ll_editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irActivity11();
            }
        });
        btn_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irActivity11();
            }
        });
    }

    public void irActivity11(){
        Intent intent_main11Activity=new Intent(Main28Activity.this, Main11Activity.class);
        startActivity(intent_main11Activity);
        finish();
    }
}
