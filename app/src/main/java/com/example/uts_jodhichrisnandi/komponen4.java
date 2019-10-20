package com.example.uts_jodhichrisnandi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class komponen4 extends AppCompatActivity {
    Button cth7;
    TextView isi4;

    public static void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen4);

        cth7=(Button) findViewById(R.id.cth7);

        cth7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contoh7=new Intent(komponen4.this,Syntak4.class);
                startActivity(contoh7);
            }
        });
    }

    public void browser4(View view) {
        Intent brow4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/manifest/provider-element.html?hl=id"));
        startActivity(brow4);
    }
}
