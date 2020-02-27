package com.example.eva1_4_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnListener;
    Button btnClaseAnonima;
    Button btnClase;
    Button btnXML;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListener = findViewById(R.id.btnListener);
        btnClaseAnonima = findViewById(R.id.btnClaseAnonima);
        btnClase = findViewById(R.id.btnClase);
        btnXML = findViewById(R.id.btnXML);

        btnListener.setOnClickListener(this);
        btnClaseAnonima.setOnClickListener(new MiClickListener(getApplicationContext()) {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Clase anónima", Toast.LENGTH_LONG).show();
            }
        });
        btnClase.setOnClickListener(new MiClickListener(getApplicationContext()));
    }

    public void miClick(View v){
        Toast.makeText(this, "EVENTO POR XML", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "EVENTO LISTENER", Toast.LENGTH_LONG).show();
    }
}
