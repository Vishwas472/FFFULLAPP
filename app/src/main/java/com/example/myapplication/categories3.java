package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class categories3 extends AppCompatActivity {
    LinearLayout Discount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories3);
        initview();
    }

    private void initview() {
        Discount =findViewById(R.id.Discount);
        Discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c= new Intent(categories3.this,discount123activiy.class);
                startActivity(c);
            }
        });
    }
}