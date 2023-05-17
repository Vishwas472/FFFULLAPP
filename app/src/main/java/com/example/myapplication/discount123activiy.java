package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class discount123activiy extends AppCompatActivity {
LinearLayout linwish1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount123activiy);
        Initview();
    }

    private void Initview() {
        linwish1=findViewById(R.id.linwish1);
        linwish1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent E =new Intent(discount123activiy.this,wishlistactivity.class);
                    startActivity(E);
            }
        });
    }
}