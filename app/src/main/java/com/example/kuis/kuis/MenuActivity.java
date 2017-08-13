package com.example.kuis.kuis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.kuis.kuis.R.layout.activity_menu;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_menu);
    }

    public void bt_burung(View view) {
        Intent i = new Intent(MenuActivity.this, Burung.class);
        startActivity(i);
    }

    public void bt_kambing(View view) {
        Intent i = new Intent(MenuActivity.this, Kambing.class);
        startActivity(i);
    }

    public void bt_gajah(View view) {
        Intent i = new Intent(MenuActivity.this, Gajah.class);
        startActivity(i);
    }

    public void bt_ular(View view) {
        Intent i = new Intent(MenuActivity.this, Ular.class);
        startActivity(i);
    }

    public void bt_kucing(View view) {
        Intent i = new Intent(MenuActivity.this, Kucing.class);
        startActivity(i);
    }

    public void bt_sapi(View view) {
        Intent i = new Intent(MenuActivity.this, Sapi.class);
        startActivity(i);
    }
}
