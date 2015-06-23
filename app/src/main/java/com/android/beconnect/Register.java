package com.android.beconnect;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Register extends ActionBarActivity implements View.OnClickListener{

    Button bRegister;
    EditText etFirstname, etLastname, etEmail, etPassword, etConfirmpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        bRegister = (Button) findViewById(R.id.bRegister);

        etFirstname = (EditText) findViewById(R.id.etFirstname);
        etLastname = (EditText) findViewById(R.id.etLastname);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etConfirmpassword = (EditText) findViewById(R.id.etConfirmpassword);

        bRegister.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.bRegister:
                String firstName = etFirstname.getText().toString();
                String lastName = etLastname.getText().toString();
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();

                User user = new User(firstName, lastName, email, password);
                registerUser(user);
                break;
        }
    }

    private void registerUser(User user) {
//        ServerRequests serverRequest = new ServerRequests(this);
//        serverRequest.storeUserDataInBackground(user, new GetUserCallback() {
//            @Override
//            public void done(User returnedUser) {
//                Intent loginIntent = new Intent(Register.this, Login.class);
//                startActivity(loginIntent);
//            }
//        });
    }
}

