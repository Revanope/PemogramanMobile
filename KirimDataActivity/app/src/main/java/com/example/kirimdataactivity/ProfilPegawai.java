package com.example.kirimdataactivity;

import android.os.Bundle;
import android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProfilPegawai extends AppCompatActivity {
EditText edNamaPegawai, edAlamat, edUmur;
Button btKirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_pegawai);
        edNamaPegawai = findViewById(R.id.edNamaPegawai);
        edAlamat = findViewById(R.id.edAlamat);
        edUmur = findViewById(R.id.edUmur);
        btKirim = findViewById(R.id.btKirim);

        btKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(ProfilPegawai.this, ProfilPegawaiKirim.class);
                x.putExtra("nama", edNamaPegawai.getText().toString());
                x.putExtra("alamat", edAlamat.getText().toString());
                x.putExtra("umur", Float.parseFloat(edUmur.getText().toString()));
                startActivity(x);
                }
            });
        }

        }