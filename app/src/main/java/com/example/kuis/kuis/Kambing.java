package com.example.kuis.kuis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kambing extends AppCompatActivity {

    EditText edtKambing;
    Button bt_proses;
    TextView hasil;
    String benar = "kambing";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kambing);

        edtKambing = (EditText)findViewById(R.id.edt_kambing);
        bt_proses  = (Button)findViewById(R.id.bt_proses_kambing);
        hasil      = (TextView)findViewById(R.id.hasil_kambing);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtKambing.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Masukkan jawaban terlebih dahulu", Toast.LENGTH_SHORT).show();
                } else {
                    String jawaban = edtKambing.getText().toString();
                    if (jawaban.equals(benar)){
                        String keterangan = "Benar";
                        hasil.setText(keterangan);
                    } else {
                        String keterangan = "Salah";
                        hasil.setText(keterangan);
                    }
                }
            }
        });
    }

}
