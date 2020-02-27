package com.example.eva1_6_idioma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    TextView txtVwSelIdo, txtVwNom, txtVwApe, txtVwEda;
    EditText edtTxtNom, edtTxtApe, edtTxtEda;
    RadioGroup rdGrpIdio;
    RadioButton rdBtnEs, rdBtnEn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwSelIdo = findViewById(R.id.txtVwSelIdio);
        txtVwNom = findViewById(R.id.txtVwNom);
        edtTxtNom = findViewById(R.id.edtTxtNom);
        txtVwApe = findViewById(R.id.txtVwApe);
        edtTxtApe = findViewById(R.id.edtTxtApe);
        txtVwEda = findViewById(R.id.txtVwEda);
        edtTxtEda = findViewById(R.id.edtTxtEda);
        rdGrpIdio = findViewById(R.id.rdGrpIdio);
        rdBtnEs = findViewById(R.id.rdBtnEs);
        rdBtnEn = findViewById(R.id.rdBtnEn);


        rdGrpIdio.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(checkedId == R.id.rdBtnEs){
            txtVwSelIdo.setText(R.string.idioma_es);
            rdBtnEs.setText(R.string.espanol_es);
            rdBtnEn.setText(R.string.ingles_es);
            txtVwNom.setText(R.string.txt_nombre_es);
            edtTxtNom.setHint(R.string.hint_nombre_es);
            txtVwApe.setText(R.string.txt_apellido_es);
            edtTxtApe.setHint(R.string.txt_apellido_es);
            txtVwEda.setText(R.string.txt_edad_es);
            edtTxtEda.setHint(R.string.hint_edad_es);

        }else{
            txtVwSelIdo.setText(R.string.idioma_en);
            rdBtnEs.setText(R.string.espanol_en);
            rdBtnEn.setText(R.string.ingles_en);
            txtVwNom.setText(R.string.txt_nombre_en);
            edtTxtNom.setHint(R.string.hint_nombre_en);
            txtVwApe.setText(R.string.txt_apellido_en);
            edtTxtApe.setHint(R.string.txt_apellido_en);
            txtVwEda.setText(R.string.txt_edad_en);
            edtTxtEda.setHint(R.string.hint_edad_en);
        }
    }
}
