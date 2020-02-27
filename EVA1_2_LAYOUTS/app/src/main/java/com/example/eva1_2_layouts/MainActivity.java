package com.example.eva1_2_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtTextNom, edtTextApe, edtTextEda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        edtTextNom = findViewById(R.id.edtTextNom);
        edtTextApe = findViewById(R.id.edtTxtApe);
        edtTextEda = findViewById(R.id.edtTextEda);

    }
}
