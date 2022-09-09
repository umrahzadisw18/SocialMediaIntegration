package com.example.socialmediaintegration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InstagramActivity extends AppCompatActivity {
    EditText username;
    EditText password,email;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insta);

        username= (EditText) findViewById(R.id.username);
        password= (EditText) findViewById(R.id.password);
        email= (EditText) findViewById(R.id.email);
        btn= (Button) findViewById(R.id.loginbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = username.getText().toString().trim();
                String text2 = password.getText().toString().trim();
                String text3 = email.getText().toString().trim();
                Bundle bundle = new Bundle();
                bundle.putString("key1", text);
                bundle.putString("key2", text2);
                bundle.putString("key3", text3);
                Intent intent = new Intent(InstagramActivity.this, SecondActivity.class);
                intent.putExtras(bundle);
                if (text.trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "plz Enter username", Toast.LENGTH_SHORT).show();
                }else if (text2.trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "plz Enter password", Toast.LENGTH_SHORT).show();
                } else if (text3.trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "plz Enter email", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "login successfully", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            }

        });
    }

}
