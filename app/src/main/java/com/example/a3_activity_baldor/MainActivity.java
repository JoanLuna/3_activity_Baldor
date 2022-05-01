package com.example.a3_activity_baldor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button primer_a, segundo_a, tercer_a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        primer_a = (Button)findViewById(R.id.primer_boton);
        primer_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, primer_activity.class);
                startActivity(i);
            }
        });

        segundo_a = (Button)findViewById(R.id.segundo_boton);
        segundo_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, segundo_activity.class);
                startActivity(i);
            }
        });

        tercer_a = (Button)findViewById(R.id.tercer_boton);
        tercer_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, tercer_activity.class);
                startActivity(i);
            }
        });

    }
}