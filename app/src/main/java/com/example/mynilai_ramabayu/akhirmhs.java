package com.example.mynilai_ramabayu;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class akhirmhs extends AppCompatActivity {
    TextView nim,nama,nilai,grade;
    String nma,nm,na;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akhirmhs);

        nim =findViewById(R.id.tvnim);
        nama =findViewById(R.id.tvnama);
        nilai =findViewById(R.id.tvNiakhir);
        grade =findViewById(R.id.etUts);

        Bundle extras = getIntent().getExtras();
        nma = extras.getString("nma");
        nm = extras.getString("nm");
        na = extras.getString("na");

        nim.setText(nm);
        nama.setText(nma);
        nilai.setText(na);

    }
}