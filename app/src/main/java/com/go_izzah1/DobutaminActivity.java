package com.go_izzah1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class DobutaminActivity extends AppCompatActivity {
    EditText inputDosis,inputBb;
    TextView views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dobutamin);

        getSupportActionBar().setTitle("Dobutamin");

        JustifiedTextView justifiedTextCiew_dopamin = (JustifiedTextView) findViewById(R.id.dobu);
        justifiedTextCiew_dopamin.setText(R.string.dobu);

        JustifiedTextView justifiedTextCiew_fungsi = (JustifiedTextView) findViewById(R.id.fdobu);
        justifiedTextCiew_fungsi.setText(R.string.fdobu);

        JustifiedTextView justifiedTextCiew_dosis = (JustifiedTextView) findViewById(R.id.ddobu);
        justifiedTextCiew_dosis.setText(R.string.ddobu);

        inputBb = findViewById(R.id.EdtBb);
        inputDosis = findViewById(R.id.EdtDosis);
        views = findViewById(R.id.view);
    }

    @SuppressLint("DefaultLocale")
    public void cekHasilDobu(View view){
        String sDosis = inputDosis.getText().toString().trim();
        String sBb = inputBb.getText().toString().trim();

        if (inputDosis.getText().toString().equals("") || inputBb.getText().toString().equals(" ")){
            Toast.makeText(getApplicationContext(),"Mohon Lengkapi Data",Toast.LENGTH_SHORT).show();
        }else {
            String doBu = "";
            double Dosis = Double.parseDouble(sDosis);
            double Bb = Double.parseDouble(sBb);

            double dobu = (Dosis*Bb*60)/5000;

            doBu = String.format("%.2f",dobu);
            views.setText(doBu);


        }

    }
}
