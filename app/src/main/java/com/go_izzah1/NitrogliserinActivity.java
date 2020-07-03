package com.go_izzah1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class NitrogliserinActivity extends AppCompatActivity {
    EditText inputDosis;
    TextView views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nitrogliserin);

        getSupportActionBar().setTitle("Nitrogliserin");

        JustifiedTextView justifiedTextCiew_dopamin = (JustifiedTextView) findViewById(R.id.nitro);
        justifiedTextCiew_dopamin.setText(R.string.nitro);

        JustifiedTextView justifiedTextCiew_fungsi = (JustifiedTextView) findViewById(R.id.fnitro);
        justifiedTextCiew_fungsi.setText(R.string.fnitro);

        JustifiedTextView justifiedTextCiew_dosis = (JustifiedTextView) findViewById(R.id.dnitro);
        justifiedTextCiew_dosis.setText(R.string.dnitro);

        inputDosis = findViewById(R.id.EdtDosis);
        views = findViewById(R.id.view);
    }

    @SuppressLint("DefaultLocale")
    public  void cekHasilNitro(View view){
        String sDosis = inputDosis.getText().toString().trim();

        if (inputDosis.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"Mohon Lengkapi Data",Toast.LENGTH_SHORT).show();
        }else {
            String niTro = "";
            double Dosis = Double.parseDouble(sDosis);

            double nitro = (Dosis*60)/1000;

            niTro = String.format("%.2f",nitro);
            views.setText(niTro);


        }

    }
}
