package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Main25Activity extends AppCompatActivity {

    LinearLayout ll_politica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);

        ll_politica=findViewById(R.id.ll_politica);

        ll_politica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_main12Activity=new Intent(Main25Activity.this, Main12Activity.class);
                startActivity(intent_main12Activity);
                finish();
            }
        });
    }
}
