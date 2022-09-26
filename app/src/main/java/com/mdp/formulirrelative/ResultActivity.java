package com.mdp.formulirrelative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView tvNpm, tvNama, tvProdi, tvJK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvNama = findViewById(R.id.tv_nama);
        tvNpm = findViewById(R.id.tv_npm);
        tvProdi = findViewById(R.id.tv_prodi);
        tvJK = findViewById(R.id.tv_jk);

        Intent intent = getIntent();
        tvNpm.setText(intent.getStringExtra("varNPM"));
        tvNama.setText(intent.getStringExtra("varNama"));
        tvJK.setText(intent.getStringExtra("varJK"));
        tvProdi.setText(intent.getStringExtra("varProdi"));
    }
}