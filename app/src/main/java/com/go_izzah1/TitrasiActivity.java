package com.go_izzah1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TitrasiActivity extends AppCompatActivity {
    Button btnDop, btnMrfin, btndobu
            ,btnvascon, btnnitro,btnnicar
            ,btnfuros,btnkorek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titrasi);
        getSupportActionBar().setTitle("Titrasi");

        btnDop = findViewById(R.id.btnDopamin);
        btnMrfin = findViewById(R.id.btnMorfin);
        btndobu = findViewById(R.id.btnDobu);
        btnvascon = findViewById(R.id.btnVascon);
        btnnitro = findViewById(R.id.btnNitro);
        btnnicar = findViewById(R.id.btnNicar);
        btnfuros = findViewById(R.id.btnFuros);
        btnkorek = findViewById(R.id.btnKorek);
        
        btnkorek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TitrasiActivity.this, KoreksiActivity.class);
                startActivity(intent);
            }
        });
        btnfuros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TitrasiActivity.this, FurosemidActivity.class);
                startActivity(intent);
            }
        });
        btnnicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TitrasiActivity.this, NicardipinActivity.class);
                startActivity(intent);
            }
        });
        btnnitro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TitrasiActivity.this, NitrogliserinActivity.class);
                startActivity(intent);
            }
        });

        btnvascon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TitrasiActivity.this, VasconActivity.class);
                startActivity(intent);
            }
        });

        btnDop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TitrasiActivity.this,ActivityDopamin.class);
                startActivity(intent);
            }
        });

        btnMrfin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TitrasiActivity.this, MorfinActivity.class);
                startActivity(intent);
            }
        });

        btndobu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TitrasiActivity.this,DobutaminActivity.class);
                startActivity(intent);
            }
        });

    }
}
