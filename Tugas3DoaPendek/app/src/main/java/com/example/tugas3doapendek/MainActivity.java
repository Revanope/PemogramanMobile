package com.example.tugas3doapendek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btDoaMakan,btDoaTidur,btDoaKeluarRumah,btDoaKeluarMesjid,btDoaMasukMesjid,btDoaSetelahAdzan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btDoaMakan = findViewById(R.id.btDoaMakan);
        btDoaTidur = findViewById(R.id.btDoaTidur);
        btDoaKeluarRumah = findViewById(R.id.btDoaKeluarRumah);
        btDoaKeluarMesjid = findViewById(R.id.btDoaKeluarMesjid);
        btDoaMasukMesjid = findViewById(R.id.btDoaMasukMesjid);
        btDoaSetelahAdzan = findViewById(R.id.btDoaSetelahAdzan);

        btDoaMakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        Intent i = new Intent(MainActivity.this, MakanActivity.class);
        startActivity(i);


            }
        });

        btDoaTidur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,TidurActivity.class);
                startActivity(i);
            }
        });
        btDoaKeluarRumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MainActivity.this, KRumahActivity.class);
                startActivity(i);
            }
        });

        btDoaMasukMesjid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MainActivity.this, MMesjidActivity.class);
                startActivity(i);
            }
        });

        btDoaKeluarMesjid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MainActivity.this, KKeluarMesjid.class);
                startActivity(i);
            }
        });
        btDoaKeluarMesjid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, KKeluarMesjid.class);
                startActivity(i);
            }
        });
        btDoaSetelahAdzan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AdzanActivity.class);
                startActivity(i);
            }
        });
    }
}