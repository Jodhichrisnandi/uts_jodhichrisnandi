package com.example.uts_jodhichrisnandi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class komponen3 extends AppCompatActivity {
    Button cth5;
    TextView isi3;


    public static void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen3);

        cth5=(Button) findViewById(R.id.cth5);

        cth5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contoh5=new Intent(komponen3.this,Syntak3.class);
                startActivity(contoh5);
            }
        });
    }

    public void browser3(View view) {
        Intent brow3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/manifest/receiver-element.html?hl=id"));
        startActivity(brow3);
    }
}
