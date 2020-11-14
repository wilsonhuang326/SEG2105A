package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText lastname;
    private EditText EmailID;
    private EditText password;
    private EditText message;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupVariables();
    }

    public void authenticateLogin(View view) {
        if (isValidUsername(username.getText().toString()))
            if (isValidLastname(lastname.getText().toString()))
                if (isValidEmail(EmailID.getText().toString()))
                    if (isValidPassword(password.getText().toString()))
                        message.setText("Login Successful");
                    else
                        message.setText("Invalid Password");
                else
                    message.setText("Invalid Email");
            else
                message.setText("Invalid Last Name");
        else
            message.setText("Invalid First Name");
    }

    public static boolean isValidUsername(String username) {
        return username.equals("user");
    }public static boolean isValidLastname(String lastname) {
        return lastname.equals("test");
    }public static   boolean isValidEmail(String email) {
        return email.equals("email@gmail.com");
    }public static boolean isValidPassword(String password) {
        return password.equals("admin");
    }

    private void setupVariables() {
        username = (EditText) findViewById(R.id.username);
        lastname = (EditText) findViewById(R.id.Lastname);
        EmailID = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.loginBtn);
        message = (EditText) findViewById(R.id.message);

    }

}