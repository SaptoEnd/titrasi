package com.go_izzah1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class KoreksiActivity extends AppCompatActivity {
    EditText inputBb,inputK1,inputK2;
    TextView views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koreksi);

        getSupportActionBar().setTitle("Koreksi Elektrolit");

        JustifiedTextView justifiedTextCiew_dopamin = (JustifiedTextView) findViewById(R.id.korek);
        justifiedTextCiew_dopamin.setText(R.string.korek);

        JustifiedTextView justifiedTextCiew_fungsi = (JustifiedTextView) findViewById(R.id.fkorek);
        justifiedTextCiew_fungsi.setText(R.string.fkorek);

        JustifiedTextView justifiedTextCiew_dosis = (JustifiedTextView) findViewById(R.id.dkorek);
        justifiedTextCiew_dosis.setText(R.string.dkorek);

        inputBb = findViewById(R.id.EdtBb);
        inputK1 = findViewById(R.id.Edtk1);
        inputK2 = findViewById(R.id.Edtk2);
        views = findViewById(R.id.view);
    }

    @SuppressLint("DefaultLocale")
    public void cekHasilKor(View view){
        String sK1 = inputK1.getText().toString().trim();
        String sK2 = inputK2.getText().toString().trim();
        String sBb = inputBb.getText().toString().trim();

        if (inputK1.getText().toString().equals("") || inputK2.getText().toString().equals(" ") || inputBb.getText().toString().equals(" ")){
            Toast.makeText(getApplicationContext(),"Mohon Lengkapi Data",Toast.LENGTH_SHORT).show();
        }else {
            String korek = "";
            double K1 = Double.parseDouble(sK1);
            double K2 = Double.parseDouble(sK2);
            double Bb = Double.parseDouble(sBb);

            double korekSi1 = K2-K1;
            double korekSi2 = Bb*6.4;
            double korekSi = korekSi1*korekSi2;

            korek = String.format("%.2f ",korekSi);
            views.setText(korek);


        }

    }
}
