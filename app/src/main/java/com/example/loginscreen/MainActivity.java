package com.example.loginscreen;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    EditText phone;
    Button loginButton;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth= FirebaseAuth.getInstance();
        phone = findViewById(R.id.phone);
        loginButton = findViewById(R.id.loginButton);
        if(auth.getCurrentUser()!=null){
            Intent intent = new Intent(MainActivity.this, welcome.class);
            startActivity(intent);
            finish();
        }
        phone.requestFocus();
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, otp.class);
                intent.putExtra("phoneNumber", phone.getText().toString());
                startActivity(intent);
            }
        });
    }
}