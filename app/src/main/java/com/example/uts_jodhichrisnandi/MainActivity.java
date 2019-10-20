package com.example.uts_jodhichrisnandi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_1,button_2,button_3,button_4,button_5;
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_1=(Button) findViewById(R.id.button_1);
        button_2=(Button) findViewById(R.id.button_2);
        button_3=(Button) findViewById(R.id.button_3);
        button_4=(Button) findViewById(R.id.button_4);
        button_5=(Button) findViewById(R.id.button_5);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kom1=new Intent(MainActivity.this,komponen1.class);
                startActivity(kom1);
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kom2=new Intent(MainActivity.this,komponen2.class);
                startActivity(kom2);
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kom3=new Intent(MainActivity.this,komponen3.class);
                startActivity(kom3);
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kom4=new Intent(MainActivity.this,komponen4.class);
                startActivity(kom4);
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kom5=new Intent(MainActivity.this,komponen5.class);
                startActivity(kom5);
            }
        });

    }

    public void komponen1(View view) {

        Log.d(LOG_TAG, "Button clicked!");
    }
}
