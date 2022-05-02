package com.example.a3_activity_baldor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class tercer_activity extends AppCompatActivity {

    Button regresar,pagina_web,enviar_correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
        regresar = (Button)findViewById(R.id.regresar_boton2);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(tercer_activity.this, MainActivity.class);
                startActivity(i);
            }
        });

        enviar_correo = (Button)findViewById(R.id.boton_correo);
        enviar_correo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent envcorreo = new Intent(Intent.ACTION_SEND);
                envcorreo.setType("message/rfc822");
                envcorreo.putExtra(Intent.EXTRA_EMAIL, new String[]{"mexico@oceana.org"});
                envcorreo.putExtra(Intent.EXTRA_SUBJECT, "Más Información");
                envcorreo.putExtra(Intent.EXTRA_TEXT, "Me gustaría recibir más información sobre proteger a los océanos");
                try {
                    startActivity(Intent.createChooser(envcorreo,"Enviar Email"));
                }catch (android.content.ActivityNotFoundException ex){
                    Toast.makeText(getApplicationContext(),"No hay aplicación de correo instalada",Toast.LENGTH_SHORT).show();
                }
            }
        });

        pagina_web = (Button)findViewById(R.id.boton_web);
        pagina_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrirWeb = new Intent(Intent.ACTION_VIEW);
                abrirWeb.setData(Uri.parse("https://mx.oceana.org"));
                startActivity(abrirWeb);
            }
        });

    }
}