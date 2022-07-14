package com.example.mynilai_ramabayu;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;



public class bobotmhs extends AppCompatActivity {

    EditText presentasi,nilai_tugas,nilai_uas,nilai_uts;
    Button btn1;
    int uas,uts,tugas,presensi;
    TextView txtnilai;
    String ua,us,tg,ps;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bobotmhs);

        presentasi=findViewById(R.id.etpresensi);
        nilai_tugas=findViewById(R.id.ettugas);
        nilai_uas=findViewById(R.id.etuas);
        nilai_uts=findViewById(R.id.etUts);
        txtnilai = findViewById(R.id.tvNiakhir);
        btn1=findViewById(R.id.Btnsubmit);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle extras = getIntent().getExtras();
                ua = extras.getString("ua");
                us = extras.getString("us");
                ps= extras.getString("ps");
                tg = extras.getString("tg");

                presentasi.setText(ps);
                nilai_tugas.setText(tg);
                nilai_uts.setText(us);
                nilai_uas.setText(ua);
                //String isitugas = nilai_tugas.getText().toString();
                //String isiuas = nilai_uas.getText().toString();
                //String isiuts = nilai_uts.getText().toString();
                //String isipresensi = presentasi.getText().toString();

                //intent.putExtra("tugas",isitugas);
                //intent.putExtra("uas",isiuas);
                //intent.putExtra("uts",isiuts);
                //intent.putExtra("presensi",isipresensi);

                double nilai_akhir;
                int pr,t,ut,us;
                //Bundle extras = getIntent().getExtras();
                //uas = extras.getInt("uas");
                //uts = extras.getInt("uts");
                //tugas = extras.getInt("tugas");
                //presensi = extras.getInt("presensi");
                //nilai_uas.setText(uas);
                //nilai_uts.setText(uts);
                //nilai_tugas.setText(tugas);
                //presentasi.setText(presensi);

                if(presentasi.getText().toString().isEmpty()){
                    presentasi.setError("harap diisi dahulu");
                    return;
                }
                if(nilai_tugas.getText().toString().isEmpty()){
                    nilai_tugas.setError("harap diisi dahulu");
                    return;
                }
                if(nilai_uts.getText().toString().isEmpty()){
                    nilai_uts.setError("harap diisi dahulu");
                    return;
                }
                if(nilai_uas.getText().toString().isEmpty()){
                    nilai_uas.setError("harap diisi dahulu");
                    return;
                }
                else {
                    pr=Integer.parseInt(presentasi.getText().toString());
                    t=Integer.parseInt(nilai_tugas.getText().toString());
                    ut=Integer.parseInt(nilai_uas.getText().toString());
                    us=Integer.parseInt(nilai_uts.getText().toString());

                    nilai_akhir = ((pr * presensi *0.01) + (t * tugas * 0.01) + (ut * uas *0.01) + (us * uts *0.01));
                    txtnilai.setText(String.valueOf(nilai_akhir));

                }
                Intent intent = new Intent(bobotmhs.this, akhirmhs.class);
                //String isinilai = txtnilai.getText().toString();
                startActivity(intent);
                finish();



            }
        });

    }
}

