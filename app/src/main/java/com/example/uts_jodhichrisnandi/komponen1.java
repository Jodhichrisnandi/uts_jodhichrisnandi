package com.example.uts_jodhichrisnandi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class komponen1 extends AppCompatActivity {
    Button cth1;
    TextView isi1;


    public static void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen1);
        cth1 = (Button) findViewById(R.id.cth1);

        cth1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contoh1 = new Intent(komponen1.this, Syntak1.class);
                startActivity(contoh1);
            }
        });
    }

    public void browser1(View view) {
        Intent brow1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/manifest/activity-element.html?hl=id"));
        startActivity(brow1);
    }

}
