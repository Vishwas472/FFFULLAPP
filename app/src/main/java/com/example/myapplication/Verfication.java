package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Verfication extends AppCompatActivity {
    Button verficatio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verfication);
        initview();
    }

    private void initview() {
        verficatio=findViewById(R.id.verficatio);
        verficatio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent E=new Intent(Verfication.this,homepage.class);
                startActivity(E);
            }
        });
    }
}