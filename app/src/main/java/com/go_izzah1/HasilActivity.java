package com.go_izzah1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView txtNama,txtJk, txtBb, txtTb, txtBmi, txtHasil, txtKet;
    String nama,jk,hasil,ket;
    double bb,tb,bmi;
    double defaultValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        getSupportActionBar().setTitle("Hasil hitung BMI Ideal");
        //txtNama = (TextView)findViewById(R.id.text_view_hasil_nama);
        //txtJk=(TextView)findViewById(R.id.text_view_hasil_jk);
        txtBb=(TextView)findViewById(R.id.text_view_hasil_bb);
        txtTb=(TextView)findViewById(R.id.text_view_hasil_tb);
        txtBmi=(TextView)findViewById(R.id.text_view_hasil_bmi);
        txtHasil=(TextView)findViewById(R.id.text_view_hasil);
        txtKet=(TextView)findViewById(R.id.text_view_hasil_ket);

        //mengambil variabel dari activity lain
        Intent intent = getIntent();
        //String pesan = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
       // nama = intent.getStringExtra("EXTRA_NAMA");
       // jk = intent.getStringExtra("EXTRA_JK");
        bb = intent.getDoubleExtra("EXTRA_BB",defaultValue);
        tb = intent.getDoubleExtra("EXTRA_TB",defaultValue);
        bmi = intent.getDoubleExtra("EXTRA_BMI",defaultValue);
        hasil = intent.getStringExtra("EXTRA_HASIL");
        ket = intent.getStringExtra("EXTRA_KET");

       // txtNama. setText("Nama : "+nama);
        //txtJk.   setText("Jenis Kelamin : "+jk);
        txtBb.   setText("Berat Badan : "+bb+" Kg");
        txtTb.   setText("Tinggi Badan : "+tb+" cm");
        txtBmi.  setText("BMI : "+String.format("%.2f",bmi));
        txtHasil.setText("Hasil : "+hasil);
        //txtKet.  setText(""+ket);
    }
}
