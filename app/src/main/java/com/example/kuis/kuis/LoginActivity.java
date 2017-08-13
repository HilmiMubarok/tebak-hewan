package com.example.kuis.kuis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edt1, edt2;
    String text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void loginMasuk(View view){
        edt1  = (EditText)findViewById(R.id.edt_username);
        edt2  = (EditText)findViewById(R.id.edt_password);
        text1 = edt1.getText().toString();
        text2 = edt2.getText().toString();

        if ( (text1.contains("hilmi")) && ((text2.contains("hilmi"))) ){
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_LONG).show();

            Intent i = new Intent(LoginActivity.this, MenuActivity.class);
            startActivity(i);

        } else if ( (text1.matches("")|| text2.matches("") ) ) {
            Toast.makeText(this, "Username dan Password Harus Di isi", Toast.LENGTH_SHORT).show();
        }  else {
            Toast.makeText(this, "Username atau Password Salah", Toast.LENGTH_SHORT).show();
        }


    }

}
