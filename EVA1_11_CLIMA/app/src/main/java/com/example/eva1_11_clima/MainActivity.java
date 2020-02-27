package com.example.eva1_11_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lstVwClima;
    Weather[] cities = {
            new Weather("Chihuahua",20, "Nublado", R.drawable.cloudy),
            new Weather("Delicias",-5, "Despejado", R.drawable.sunny),
            new Weather("Ciudad Juárez",-3, "Nevadas Intensas", R.drawable.snow),
            new Weather("Jiménez",23, "Lluvias Intensas", R.drawable.thunderstorm),
            new Weather("Camargo",30, "Vientos Intensos", R.drawable.atmospher),
            new Weather("Parral",8, "Lluvias Fuertes", R.drawable.rainy),
            new Weather("Aldama",-2, "Niebla", R.drawable.cloudy),
            new Weather("Batopilas",10, "Lluvia Ligera", R.drawable.rainy),
            new Weather("Creel",11, "Despejado", R.drawable.sunny),
            new Weather("Casas Grandes",23, "Lluvias Intensas", R.drawable.light_rain),


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwClima = findViewById(R.id.lstVwClima);
        lstVwClima.setAdapter(new WeatherAdapter(this, R.layout.mi_layout, cities));
    }
}
