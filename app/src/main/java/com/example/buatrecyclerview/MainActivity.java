package com.example.buatrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_mhs;
    private AdapterRV adapterRV;
    private RecyclerView.LayoutManager layoutManager;
    private List<String> nama_mhs = new ArrayList<>();
    private List<Integer> umur_mhs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_mhs = findViewById(R.id.rv_mhs);

        String[] nama = getResources().getStringArray(R.array.nama_mahasiswa);
        int[] umur = getResources().getIntArray(R.array.umur_mahasiswa);

        for (int i = 0; i < nama.length; i++) {
            nama_mhs.add(nama[i]);
            umur_mhs.add(umur[i]);
        }

        adapterRV = new AdapterRV(getApplicationContext(), nama_mhs, umur_mhs);
        layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);

        rv_mhs.setAdapter(adapterRV);
        rv_mhs.setLayoutManager(layoutManager);

    }
}