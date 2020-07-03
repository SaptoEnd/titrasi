package com.go_izzah1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class Imt extends AppCompatActivity {
    EditText edtNama, edtBB, edtTB;
    RadioButton radioButtonL;
    RadioButton radioButtonP;
    String jeniskelamin;
    String hasil;
    String ket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imt);

        getSupportActionBar().setTitle("Hitung IMT/BMI Ideal");

        JustifiedTextView justifiedTextCiew_dopamin = (JustifiedTextView) findViewById(R.id.imtview);
        justifiedTextCiew_dopamin.setText(R.string.imtviewS);

        //edtNama = (EditText)findViewById(R.id.edit_text_nama);
        edtBB = (EditText)findViewById(R.id.edit_text_bb);
        edtTB = (EditText)findViewById(R.id.edit_text_tb);
       /* radioButtonL = (RadioButton)findViewById(R.id.radio_btn_lk);
        radioButtonP=(RadioButton)findViewById(R.id.radio_btn_p);*/
    }

    public void cekHasil(View view) {
        //String nama = edtNama.getText().toString().trim();
        String sBeratBadan = edtBB.getText().toString().trim();
        String sTinggiBadan = edtTB.getText().toString().trim();

        if(edtBB.getText().toString().equals("")||edtTB.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"Mohon untuk melengkapi data",Toast.LENGTH_SHORT).show();
        }
        else{
            double beratBadan = Double.parseDouble(sBeratBadan);
            double tinggiBadan = Double.parseDouble(sTinggiBadan);

            //rumus
            //BMI = Berat Badan kg/ (Tinggi Badan m * Tinggi Badan m)
            double bmi = beratBadan/(tinggiBadan*tinggiBadan*0.0001);


            //Log.d("tag","Nama = "+nama+"\nbmi = "+bmi+"\n jenis kelamin : "+jeniskelamin);
           // if(jeniskelamin.equals("Perempuan") || jeniskelamin.equals("Laki-laki") ){
                if (bmi<18.5){
                    //Log.d("keterangan Perempuan", "Under Weight/Kurus – Sebaiknya mulai menambah berat badan dan mengkonsumsi makanan berkarbohidrat di imbangi dengan olah raga");
                    hasil="Berat Badan Kurang";
                    ket = "Sebaiknya mulai menambah berat badan dan mengkonsumsi makanan berkarbohidrat di imbangi dengan olah raga";
                }
                else if(bmi>=18.5&&bmi<=22.99){
                    //Log.d("keterangan Perempuan","Normal Weight/Normal – Bagus, berat badan anda termasuk kategori ideal");
                    hasil="Berat Badan Normal";
                    ket = "Bagus, berat badan anda termasuk kategori ideal";
                }
                else if (bmi >= 22.9 && bmi <=23.0){
                    //Log.d("keterangan Perempuan","Over Weight/Kegemukan – anda sudah masuk kategori gemuk. sebaiknya hindari makanan berlemak dan mulailah meningkatkan olahraga seminggu minimal 2 kali");
                    hasil = "Berat Badan Lebih";
                    ket = "Anda sudah masuk kategori gemuk. sebaiknya hindari makanan berlemak dan mulailah meningkatkan olahraga seminggu minimal 2 kali";
                }
                else if (bmi>=23.0&&bmi<=24.9){
                    //Log.d("keterangan Perempuan","Over Weight/Kegemukan – anda sudah masuk kategori gemuk. sebaiknya hindari makanan berlemak dan mulailah meningkatkan olahraga seminggu minimal 2 kali");
                    hasil = "Resiko Obesitas";
                    ket = "Anda sudah masuk kategori gemuk. sebaiknya hindari makanan berlemak dan mulailah meningkatkan olahraga seminggu minimal 2 kali";
                }
                else if (bmi>=25.0&&bmi<=29.9){
                    //Log.d("keterangan Perempuan","Over Weight/Kegemukan – anda sudah masuk kategori gemuk. sebaiknya hindari makanan berlemak dan mulailah meningkatkan olahraga seminggu minimal 2 kali");
                    hasil = "Obesitas tingkat I";
                    ket = "Anda sudah masuk kategori gemuk. sebaiknya hindari makanan berlemak dan mulailah meningkatkan olahraga seminggu minimal 2 kali";
                }
                else{
                    //Log.d("keterangan Perempuan","\tObesitas – Sebaiknya segera membuat program menurunkan berat badan karena anda termasuk kategori obesitas/ terlalu gemuk dan tidak baik bagi kesehatan");
                    hasil="Obesitas tingkat II";
                    ket = "Sebaiknya segera membuat program menurunkan berat badan karena anda termasuk kategori obesitas/ terlalu gemuk dan tidak baik bagi kesehatan";
                }


            Intent intent = new Intent(Imt.this,HasilActivity.class);
            //intent.putExtra("EXTRA_NAMA", nama);
            intent.putExtra("EXTRA_BB",beratBadan);
            intent.putExtra("EXTRA_TB",tinggiBadan);
           // intent.putExtra("EXTRA_JK",jeniskelamin);
            intent.putExtra("EXTRA_BMI",bmi);
            intent.putExtra("EXTRA_HASIL",hasil);
            intent.putExtra("EXTRA_KET",ket);
            startActivity(intent);
            //Log.d("jeniskelamin",jeniskelamin);
        }
    }


}
