package com.arora.kapil.question11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String username = editText.getText().toString();
        Intent intent = new Intent(this, Logout.class);
        intent.putExtra("message", username);
        startActivity(intent);
    }
}