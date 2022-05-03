package com.example.a3_activity_baldor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.material.chip.Chip;

public class primer_activity extends AppCompatActivity {

    Button regresar;
    TextView alerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer);
        regresar = (Button)findViewById(R.id.regresar);


        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(primer_activity.this, MainActivity.class);
                startActivity(i);
            }
        });



    }
}