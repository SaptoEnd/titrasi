package com.go_izzah1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class NicardipinActivity extends AppCompatActivity {
   protected EditText inputDosis,inputBb;
   protected TextView views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nicardipin);
        getSupportActionBar().setTitle("Nicardipin");

        JustifiedTextView justifiedTextCiew_dopamin = (JustifiedTextView) findViewById(R.id.nicar);
        justifiedTextCiew_dopamin.setText(R.string.niicar);

        JustifiedTextView justifiedTextCiew_fungsi = (JustifiedTextView) findViewById(R.id.fnicar);
        justifiedTextCiew_fungsi.setText(R.string.fniicar);

        JustifiedTextView justifiedTextCiew_dosis = (JustifiedTextView) findViewById(R.id.dnicar);
        justifiedTextCiew_dosis.setText(R.string.dniicar);

        inputBb = findViewById(R.id.EdtBb);
        inputDosis = findViewById(R.id.EdtDosis);
        views = findViewById(R.id.view);
    }

    @SuppressLint("DefaultLocale")
    public void cekHasilNicar(View view){
        String sDosis = inputDosis.getText().toString().trim();
        String sBb = inputBb.getText().toString().trim();

        if (inputDosis.getText().toString().equals("") || inputBb.getText().toString().equals(" ")){
            Toast.makeText(getApplicationContext(),"Mohon Lengkapi Data",Toast.LENGTH_SHORT).show();
        }else {
            String nicar = "";
            double Dosis = Double.parseDouble(sDosis);
            double Bb = Double.parseDouble(sBb);

            double niCardipin = (Dosis*Bb*60)/200;

            nicar = String.format("%.2f",niCardipin);
            views.setText(nicar);


        }

    }
}
