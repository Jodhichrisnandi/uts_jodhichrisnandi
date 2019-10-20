package com.example.uts_jodhichrisnandi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class komponen5 extends AppCompatActivity {
    Button cth9;
    TextView isi5;

    public static void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen5);

        cth9=(Button) findViewById(R.id.cth9);

        cth9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contoh9=new Intent(komponen5.this,Syntak5.class);
                startActivity(contoh9);
            }
        });
    }

    public void browser5(View view) {
        Intent bro5=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/intents-filters?hl=id"));
        startActivity(bro5);
    }
}