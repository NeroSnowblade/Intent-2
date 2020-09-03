package com.fajarmush.intent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button atas, bawah, kiri, kanan;
    String direksi_awal = "Diam";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                Intent atas = new Intent(MainActivity.this, AtasActivity.class);
                atas.putExtra("direksi_sekarang", "Atas");
                atas.putExtra("direksi_sebelum", direksi_awal);
                startActivity(atas);
                break;
            case R.id.tombol_bawah:
                Intent bawah = new Intent(MainActivity.this, BawahActivity.class);
                bawah.putExtra("direksi_sekarang", "Bawah");
                bawah.putExtra("direksi_sebelum", direksi_awal);
                startActivity(bawah);
                break;
            case R.id.tombol_kiri:
                Intent kiri = new Intent(MainActivity.this, KiriActivity.class);
                kiri.putExtra("direksi_sekarang", "Kiri");
                kiri.putExtra("direksi_sebelum", direksi_awal);
                startActivity(kiri);
                break;
            case R.id.tombol_kanan:
                Intent kanan = new Intent(MainActivity.this, KananActivity.class);
                kanan.putExtra("direksi_sekarang", "Kanan");
                kanan.putExtra("direksi_sebelum", direksi_awal);
                startActivity(kanan);
                break;
        }
    }
}