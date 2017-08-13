package com.example.kuis.kuis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Gajah extends AppCompatActivity {

    EditText edtGajah;
    Button bt_proses;
    TextView hasil;
    String benar = "gajah";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gajah);

        edtGajah = (EditText)findViewById(R.id.edt_gajah);
        bt_proses  = (Button)findViewById(R.id.bt_proses_gajah);
        hasil      = (TextView)findViewById(R.id.hasil_gajah);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtGajah.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Masukkan jawaban terlebih dahulu", Toast.LENGTH_SHORT).show();
                } else {
                    String jawaban = edtGajah.getText().toString();
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
