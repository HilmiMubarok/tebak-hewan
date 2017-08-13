package com.example.kuis.kuis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Burung extends AppCompatActivity {

    EditText edtBurung;
    Button bt_proses;
    TextView hasil;
    String benar = "burung";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burung);

        edtBurung = (EditText)findViewById(R.id.edt_burung);
        bt_proses = (Button)findViewById(R.id.bt_proses_burung);
        hasil     = (TextView)findViewById(R.id.hasil_burung);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtBurung.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Masukkan jawaban terlebih dahulu", Toast.LENGTH_SHORT).show();
                } else {
                    String jawaban = edtBurung.getText().toString();
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
