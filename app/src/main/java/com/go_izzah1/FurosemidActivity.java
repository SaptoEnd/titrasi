package com.go_izzah1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class FurosemidActivity extends AppCompatActivity {
    EditText inputDosis;
    TextView views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furosemid);

        getSupportActionBar().setTitle("Furosemid");

        JustifiedTextView justifiedTextCiew_dopamin = (JustifiedTextView) findViewById(R.id.furo);
        justifiedTextCiew_dopamin.setText(R.string.furo);

        JustifiedTextView justifiedTextCiew_fungsi = (JustifiedTextView) findViewById(R.id.ffuro);
        justifiedTextCiew_fungsi.setText(R.string.ffuro);

        JustifiedTextView justifiedTextCiew_dosis = (JustifiedTextView) findViewById(R.id.dfuro);
        justifiedTextCiew_dosis.setText(R.string.dfuro);

        inputDosis = findViewById(R.id.EdtDosis);
        views = findViewById(R.id.view);
    }

    @SuppressLint("DefaultLocale")
    public void cekHasilFur(View view){
        String sDosis = inputDosis.getText().toString().trim();

        if (inputDosis.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"Mohon Lengkapi Data",Toast.LENGTH_SHORT).show();
        }else {
            String fuRos = "";
            double Dosis = Double.parseDouble(sDosis);

            double furos = (Dosis*1)/10;

            fuRos = String.format("%.2f",furos);
            views.setText(fuRos);


        }

    }
}
