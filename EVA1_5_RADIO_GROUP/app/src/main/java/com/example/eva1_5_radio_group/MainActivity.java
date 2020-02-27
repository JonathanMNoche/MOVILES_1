package com.example.eva1_5_radio_group;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioGroup rdGrpComida;
    RadioButton rdBtnSel;

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        /* checked */

        rdBtnSel = findViewById(checkedId);
        Toast.makeText(this, rdBtnSel.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrpComida = findViewById(R.id.rdGrpComida);
        rdGrpComida.setOnCheckedChangeListener(this);

    }
}
