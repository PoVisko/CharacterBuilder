package com.example.registracija;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by PC on 2018.01.24.
 */

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button btnConfirmRegister = (Button) findViewById(R.id.confirm_register);
        final EditText etUsername = (EditText) findViewById(R.id.username);
        final EditText etEmail = (EditText) findViewById(R.id.email);
        final EditText etPassword = (EditText) findViewById(R.id.password);

        btnConfirmRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //cia vykdomas kodas, kai paspaudziamas mygtukas
                if (!Validation.isValidCredentials(etUsername.getText().toString())) {
                    Toast.makeText(RegisterActivity.this, getResources().getString(R.string.login_invalid_username),
                            Toast.LENGTH_SHORT).show();
                } else if (!Validation.isValidEmail(etEmail.getText().toString())){
                    Toast.makeText(RegisterActivity.this, getResources().getString(R.string.login_invalid_email),
                            Toast.LENGTH_SHORT).show();
                } else if (!Validation.isValidCredentials(etPassword.getText().toString())) {
                    Toast.makeText(RegisterActivity.this, getResources().getString(R.string.login_invalid_password),
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(RegisterActivity.this,
                            "Sveikiname užsiregistravus, " + etUsername.getText().toString(), Toast.LENGTH_SHORT).show();
                    Intent goToLoginActivity = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(goToLoginActivity);
                }
            }
        });
    }
}
