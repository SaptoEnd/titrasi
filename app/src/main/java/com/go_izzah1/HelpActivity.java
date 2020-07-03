package com.go_izzah1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HelpActivity extends AppCompatActivity {
    Button btig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        btig = findViewById(R.id.btnIg);
        btig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.instagram.com/sapto_end/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

                /*Intent insta_intent = getPackageManager().getLaunchIntentForPackage("com.instagram.android");

                insta_intent.setComponent(new ComponentName("com.instagram.android", "com.instagram.android.activity.UrlHandlerActivity"));

                //use this if you want to open an image
                //insta_intent.setData(Uri.parse("http://instagram.com/p/gjfLqSBQTJ/"));

                //And if you want to open a user's profile use this https://www.instagram.com/sapto_end/
                insta_intent.setData(Uri.parse("https://www.instagram.com/sapto_end/"));

                startActivity(insta_intent);*/

            }
        });
    }

    /*
    *
    *
*/



}
