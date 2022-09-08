package com.example.socialmediaintegration;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity  extends AppCompatActivity {
     TextView user,paswrd,useremail;
     ImageView img;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle = getIntent().getExtras();
         user=(TextView) findViewById(R.id.user);
         img=(ImageView) findViewById(R.id.img);
         useremail=(TextView) findViewById(R.id.useremail);
         paswrd=(TextView) findViewById(R.id.paswrd);

        String message1=bundle.getString("key1");
        user.setText(message1);

       String message2=bundle.getString("key2");
       paswrd.setText(message2);

        String message3=bundle.getString("key3");
        useremail.setText(message3);

    }

}
