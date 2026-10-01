package com.example.tugas2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private EditText EdNilaiAngka, EdHasil;
    private Button btProses;
    Double vNilaiAngka;
    String vHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        setContentView(R.layout.activity_main);
        EdNilaiAngka = (EditText) findViewById(R.id.edNilaiAngka);
        EdHasil = (EditText) findViewById(R.id.edHasil);
        btProses = (Button) findViewById(R.id.btProses);
    }
    public void proses(View view){
        vNilaiAngka = Double.parseDouble(EdNilaiAngka.getText().toString());
        if(vNilaiAngka >= 60){
            vHasil="Lulus";
        }else{
            vHasil="Gagal";
        }
        EdHasil.setText("" + vHasil);
    }
}