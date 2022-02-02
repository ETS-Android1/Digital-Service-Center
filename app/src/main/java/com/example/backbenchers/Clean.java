package com.example.backbenchers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Clean extends AppCompatActivity {

    Button S1,S2,S3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//for full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_clean);


        S1 = findViewById(R.id.s1);
        S2 = findViewById(R.id.s2);
        S3 = findViewById(R.id.s3);
        String ST1="House Areas";
        String ST2="Clean House";
        String ST3="Pest Control";
        String PT1="1000";
        String PT2="1000";
        String PT3="700";
        String MS="Cleaning Services";

        S1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),OrderCook.class);
                intent.putExtra("stname",ST1);
                intent.putExtra("price",PT1);
                intent.putExtra("servicename",MS);
                finish();
                startActivity(intent);

            }
        });
        S2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),OrderCook.class);
                intent.putExtra("stname",ST2);
                intent.putExtra("price",PT2);
                intent.putExtra("servicename",MS);
                finish();
                startActivity(intent);
            }
        });
        S3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),OrderCook.class);
                intent.putExtra("stname",ST3);
                intent.putExtra("price",PT3);
                intent.putExtra("servicename",MS);
                finish();
                startActivity(intent);
            }
        });

    }
}