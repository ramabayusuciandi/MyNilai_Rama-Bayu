package com.example.mynilai_ramabayu;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class inputmhs extends AppCompatActivity {
    private EditText nilaiuas, nilaiuts, presentasi, nim, nama, nilaitugas;
    private Button lanjut;
    String nm,nma,na,us,ua,ps,tg;
    int tugas,uas,uts,presensi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputmhs);
        nilaiuas = findViewById(R.id.etNiUas);
        nilaiuts = findViewById(R.id.etUts);
        nim = findViewById(R.id.etnim);
        nama = findViewById(R.id.etnama);
        presentasi = findViewById(R.id.etpresensi);
        nilaitugas = findViewById(R.id.etNitugas);
        lanjut = (Button) findViewById(R.id.Btnsubmit);

        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isinim = nim.getText().toString();
                String isinama = nama.getText().toString();
                Intent intent = new Intent(inputmhs.this,bobotmhs.class);
                intent.putExtra("nm",isinim);
                intent.putExtra("nma",isinama);
                String isitugas = nilaitugas.getText().toString();
                String isiuas = nilaiuas.getText().toString();
                String isiuts = nilaiuts.getText().toString();
                String isipresensi = presentasi.getText().toString();
                intent.putExtra("tg",isitugas);
                intent.putExtra("ua",isiuas);
                intent.putExtra("us",isiuts);
                intent.putExtra("ps",isipresensi);

                startActivity(intent);
                finish();
            }
        });
    }

}



