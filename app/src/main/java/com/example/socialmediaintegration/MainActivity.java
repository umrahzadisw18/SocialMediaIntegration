package com.example.socialmediaintegration;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    ImageView imggoogle,imgfb,imginsta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imggoogle=findViewById(R.id.imggoogle);
        imgfb=findViewById(R.id.imgfb);
        imginsta=findViewById(R.id.imginsta);

       imggoogle.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent= new Intent(getApplicationContext(), GoogleActivity.class);
               startActivity(intent);
           }
       });
        imgfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), FacebookActivity.class);
                startActivity(intent);
            }
        });
        imginsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), InstagramActivity.class);
                startActivity(intent);
            }
        });

    }
}