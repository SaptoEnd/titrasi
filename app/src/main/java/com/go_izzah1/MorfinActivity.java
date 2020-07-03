package com.go_izzah1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class MorfinActivity extends AppCompatActivity {
    EditText inputMor;
    TextView viewsmor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morfin);

        getSupportActionBar().setTitle("Morfin");

        JustifiedTextView justifiedTextCiew_dopamin = (JustifiedTextView) findViewById(R.id.morfin);
        justifiedTextCiew_dopamin.setText(R.string.morfin);

        JustifiedTextView justifiedTextCiew_fungsi = (JustifiedTextView) findViewById(R.id.fmorfin);
        justifiedTextCiew_fungsi.setText(R.string.fmorfin);

        JustifiedTextView justifiedTextCiew_dosis = (JustifiedTextView) findViewById(R.id.dmorfin);
        justifiedTextCiew_dosis.setText(R.string.dmorfin);

        inputMor = findViewById(R.id.EdtDosisMor);
        viewsmor = findViewById(R.id.viewMor);
    }

    @SuppressLint("DefaultLocale")
    public void cekHasilMor(View view){

        String sDosisMor = inputMor.getText().toString().trim();
        if (inputMor.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"Mohon Lengkapi Data",Toast.LENGTH_SHORT).show();
        }else {
            String morFin="";
            double doSis = Double.parseDouble(sDosisMor);

            double moRfin = (doSis*1)/1;
            morFin = String.format("%.2f",moRfin);
            viewsmor.setText(morFin);



        }

    }
}
