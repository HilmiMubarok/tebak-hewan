package com.example.kuis.kuis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kucing extends AppCompatActivity {

    EditText edtKucing;
    Button bt_proses;
    TextView hasil;
    String benar = "kucing";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kucing);
        edtKucing = (EditText)findViewById(R.id.edt_kucing);
        bt_proses  = (Button)findViewById(R.id.bt_proses_kucing);
        hasil      = (TextView)findViewById(R.id.hasil_kucing);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtKucing.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Masukkan jawaban terlebih dahulu", Toast.LENGTH_SHORT).show();
                } else {
                    String jawaban = edtKucing.getText().toString();
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
