package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText phone;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone = findViewById(R.id.phone);

        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (phone.getText().toString().equals("01963696329") || phone.getText().toString().equals("01764186880")) {
                    Toast.makeText(MainActivity.this, "Verified Successful! 👌", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Verified Unsuccessful! 😒", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}