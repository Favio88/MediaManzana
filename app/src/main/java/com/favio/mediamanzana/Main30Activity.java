package com.favio.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main30Activity extends AppCompatActivity {

    TextView tv_leGusto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main30);

        tv_leGusto=findViewById(R.id.tv_leGusto);

        tv_leGusto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_main20Activity=new Intent(Main30Activity.this, Main20Activity.class);
                startActivity(intent_main20Activity);
            }
        });
    }
}
