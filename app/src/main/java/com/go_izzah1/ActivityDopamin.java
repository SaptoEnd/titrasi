package com.go_izzah1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class ActivityDopamin extends AppCompatActivity {
    // create variabel
    EditText inputDosis, inputBb;
    TextView views;
    //private BreakIterator result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dopamin);

        getSupportActionBar().setTitle("Dopamin");

        JustifiedTextView justifiedTextCiew_dopamin = (JustifiedTextView) findViewById(R.id.dosisdop);
        justifiedTextCiew_dopamin.setText(R.string.dopamin);

        JustifiedTextView justifiedTextCiew_fungsi = (JustifiedTextView) findViewById(R.id.fungsi);
        justifiedTextCiew_fungsi.setText(R.string.fdopamin);

        JustifiedTextView justifiedTextCiew_dosis = (JustifiedTextView) findViewById(R.id.dosis);
        justifiedTextCiew_dosis.setText(R.string.ddopamin);

        //inisialisasi variabel
        inputDosis = findViewById(R.id.EdtDosid);
        inputBb = findViewById(R.id.EdtBb);
        views = findViewById(R.id.view);
    }

    @SuppressLint("DefaultLocale")
    public void cekHasilDop(View view){
        String sDosis = inputDosis.getText().toString().trim();
        String sBb = inputBb.getText().toString().trim();
        if (inputDosis.getText().toString().equals("") || inputBb.getText().toString().equals(" ")){
            Toast.makeText(getApplicationContext(),"Mohon Lengkapi Data",Toast.LENGTH_SHORT).show();
        }else {
            String tiTrasi = "";
            double Dosis = Double.parseDouble(sDosis);
            double Bb = Double.parseDouble(sBb);

            double titrasi = (Dosis*Bb*60)/4000;
            //Log.d("tag"+"nama = "+titrasi);
            //System.out.println(titrasi);
            //displayBMI(titrasi);
            tiTrasi = String.format("%.2f ",titrasi);
            views.setText(tiTrasi);


        }

    }
}
