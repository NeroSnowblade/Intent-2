package com.fajarmush.intent2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BawahActivity extends AppCompatActivity implements View.OnClickListener {
    Button atas, bawah, kiri, kanan;
    String direksi_awal = "Bawah";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bawah);

        Bundle bundle = getIntent().getExtras();
        String d_awal = bundle.getString("direksi_sebelum");
        String d_akhir = bundle.getString("direksi_sekarang");

        TextView sebelum = (TextView) findViewById(R.id.value_posisi_awal);
        sebelum.setText(d_awal);

        TextView sesudah = (TextView) findViewById(R.id.value_posisi_akhir);
        sesudah.setText(d_akhir);

        atas = (Button) findViewById(R.id.tombol_atas);
        atas.setOnClickListener(this);
        bawah = (Button) findViewById(R.id.tombol_bawah);
        bawah.setOnClickListener(this);
        kiri = (Button) findViewById(R.id.tombol_kiri);
        kiri.setOnClickListener(this);
        kanan = (Button) findViewById(R.id.tombol_kanan);
        kanan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tombol_atas:
                Intent atas = new Intent(BawahActivity.this, AtasActivity.class);
                atas.putExtra("direksi_sekarang", "Atas");
                atas.putExtra("direksi_sebelum", direksi_awal);
                startActivity(atas);
                break;
            case R.id.tombol_bawah:
                Intent bawah = new Intent(BawahActivity.this, BawahActivity.class);
                bawah.putExtra("direksi_sekarang", "Bawah");
                bawah.putExtra("direksi_sebelum", direksi_awal);
                startActivity(bawah);
                break;
            case R.id.tombol_kiri:
                Intent kiri = new Intent(BawahActivity.this, KiriActivity.class);
                kiri.putExtra("direksi_sekarang", "Kiri");
                kiri.putExtra("direksi_sebelum", direksi_awal);
                startActivity(kiri);
                break;
            case R.id.tombol_kanan:
                Intent kanan = new Intent(BawahActivity.this, KananActivity.class);
                kanan.putExtra("direksi_sekarang", "Kanan");
                kanan.putExtra("direksi_sebelum", direksi_awal);
                startActivity(kanan);
                break;
        }

    }
}
