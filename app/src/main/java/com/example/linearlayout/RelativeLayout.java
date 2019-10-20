package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RelativeLayout extends AppCompatActivity
{
    Button Click;
    ImageView ImV1, ImV2, ImV3, ImV4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

       Click = (Button) findViewById(R.id.Click);
       ImV1 = findViewById(R.id.imageView2);
       ImV2 = findViewById(R.id.imageView3);
       ImV3 = findViewById(R.id.imageView4);
       ImV4 = findViewById(R.id.imageView5);




    }
}
