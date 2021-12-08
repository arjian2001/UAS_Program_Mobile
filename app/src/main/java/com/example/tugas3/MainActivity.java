package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKambing,btnKuda,btnAyam;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnKambing = findViewById(R.id.btn_buka_ras_kambing);
        btnKuda = findViewById(R.id.btn_buka_ras_kuda);
        btnAyam=findViewById(R.id.btn_buka_ras_ayam);
        btnKambing.setOnClickListener(view -> bukaGaleri("Kambing"));
        btnKuda.setOnClickListener(view -> bukaGaleri("Kuda"));
        btnAyam.setOnClickListener(view -> bukaGaleri("Ayam"));

    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }
    public void biodata(View view) {
        Intent intent = new Intent(MainActivity.this, biodataActivity.class);
        startActivity(intent);
    }
}