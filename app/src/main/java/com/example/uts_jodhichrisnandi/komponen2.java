package com.example.uts_jodhichrisnandi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class komponen2 extends AppCompatActivity {
    Button cth3;
    TextView isi2;

    public static void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen2);

        cth3=(Button) findViewById(R.id.cth3);

        cth3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contoh3=new Intent(komponen2.this,Syntak2.class);
                startActivity(contoh3);
            }
        });
    }

    public void browser2(View view) {
        Intent brow2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/manifest/service-element.html?hl=id"));
        startActivity(brow2);
    }
}
