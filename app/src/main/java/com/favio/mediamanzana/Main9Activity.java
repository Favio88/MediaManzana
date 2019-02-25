package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main9Activity extends AppCompatActivity {

    Button btn_filtrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        btn_filtrar=findViewById(R.id.btn_filtrar);

        btn_filtrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_main4Activity=new Intent(Main9Activity.this, Main4Activity.class);
                startActivity(intent_main4Activity);
                finish();
            }
        });
    }
}
