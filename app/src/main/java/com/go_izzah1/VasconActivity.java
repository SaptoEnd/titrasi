package com.go_izzah1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class VasconActivity extends AppCompatActivity {
    EditText inputDosis, inputBb;
    TextView views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vascon);
        getSupportActionBar().setTitle("Vascon");

        JustifiedTextView justifiedTextCiew_dopamin = (JustifiedTextView) findViewById(R.id.vas);
        justifiedTextCiew_dopamin.setText(R.string.vascon);

        JustifiedTextView justifiedTextCiew_fungsi = (JustifiedTextView) findViewById(R.id.fvas);
        justifiedTextCiew_fungsi.setText(R.string.fvascon);

        JustifiedTextView justifiedTextCiew_dosis = (JustifiedTextView) findViewById(R.id.dvas);
        justifiedTextCiew_dosis.setText(R.string.dvascon);

        inputBb = findViewById(R.id.EdtBb);
        inputDosis = findViewById(R.id.EdtDosis);
        views = findViewById(R.id.view);
    }

    @SuppressLint("DefaultLocale")
    public void cekHasilVas(View view){
        String sDosis = inputDosis.getText().toString().trim();
        String sBb = inputBb.getText().toString().trim();

        if (inputDosis.getText().toString().equals("") || inputBb.getText().toString().equals(" ")){
            Toast.makeText(getApplicationContext(),"Mohon Lengkapi Data",Toast.LENGTH_SHORT).show();
        }else {
            String Vas = "";
            double Dosis = Double.parseDouble(sDosis);
            double Bb = Double.parseDouble(sBb);

            double vascon = (Dosis*Bb*60)/80;

            Vas = String.format("%.2f",vascon);
            views.setText(Vas);
        }

    }
}
