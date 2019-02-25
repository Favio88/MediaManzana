package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Main27Activity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout ll_verme, ll_todos, ll_mujeres, ll_hombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main27);

        ll_verme=findViewById(R.id.ll_verme);
        ll_todos=findViewById(R.id.ll_todos);
        ll_mujeres=findViewById(R.id.ll_mujeres);
        ll_hombres=findViewById(R.id.ll_hombres);

        ll_verme.setOnClickListener(this);
        ll_todos.setOnClickListener(this);
        ll_mujeres.setOnClickListener(this);
        ll_hombres.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.ll_verme:
                irActitivy12();
                break;
            case R.id.ll_todos:
                irActitivy12();
                break;
            case R.id.ll_mujeres:
                irActitivy12();
                break;
            case R.id.ll_hombres:
                irActitivy12();
                break;
        }
    }

    public void irActitivy12(){
        Intent intent_main12Activity=new Intent(Main27Activity.this, Main12Activity.class);
        startActivity(intent_main12Activity);
        finish();
    }
}
