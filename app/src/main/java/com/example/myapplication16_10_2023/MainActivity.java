package com.example.myapplication16_10_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email= findViewById(R.id.email);
        password= findViewById(R.id.password);
        //email.setText("albert");
        //password.setText("1234");

    }

    public void login(View view) {
        String str=password.getText().toString();
        email.setText(str);
    }
}