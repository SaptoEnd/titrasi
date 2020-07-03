package com.go_izzah1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class MainActivity extends AppCompatActivity {
    Button btnimT, btnTitrasI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JustifiedTextView justifiedTextCiew_dopamin = (JustifiedTextView) findViewById(R.id.mainView);
        justifiedTextCiew_dopamin.setText(R.string.mainviewS);

        btnimT = (Button) findViewById(R.id.btnImt);
        btnTitrasI = (Button) findViewById(R.id.btnTitration);

        btnimT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Imt.class);
                startActivity(intent);
            }
        });

        btnTitrasI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inTitrasi = new Intent(MainActivity.this, TitrasiActivity.class);
                startActivity(inTitrasi);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.setting){
            startActivity(new Intent(this, HelpActivity.class));
        }

        return true;
    }


}
