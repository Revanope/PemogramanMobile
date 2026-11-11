package com.example.uts_revano_rassya_islamy;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GajiActivityRevano extends AppCompatActivity {
    private Button btnHitung;
    private EditText etNik, etNama, etGajiPokok, etTunjJabatan, etHariKerja;
    private TextView tvTunjMakan, tvTunjTransport, tvGajiKotor, tvGajiBersih;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaji_revano);
        btnHitung = findViewById(R.id.btnHitung);

        etNik = findViewById(R.id.etNik);
        etNama = findViewById(R.id.etNama);
        etGajiPokok = findViewById(R.id.etGajiPokok);
        etTunjJabatan = findViewById(R.id.etTunjJabatan);
        etHariKerja = findViewById(R.id.etHariKerja);

        tvTunjMakan = findViewById(R.id.tvTunjMakan);
        tvTunjTransport = findViewById(R.id.tvTunjTransport);
        tvGajiKotor = findViewById(R.id.tvGajiKotor);
        tvGajiBersih = findViewById(R.id.tvGajiBersih);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strGajiPokok = etGajiPokok.getText().toString();
                String strTunjJabatan = etTunjJabatan.getText().toString();
                String strHariKerja = etHariKerja.getText().toString();

                if(strGajiPokok.isEmpty() || strTunjJabatan.isEmpty() || strHariKerja.isEmpty()) {
                    Toast.makeText(GajiActivityRevano.this, "Harap isi Gaji Pokok, Tunjangan Jabatan, dan Jumlah Hari Kerja", Toast.LENGTH_SHORT).show();
                    return;
                }
                double gajiPokok = Double.parseDouble(strGajiPokok);
                double tunjJabatan = Double.parseDouble(strTunjJabatan);
                int hariKerja = Integer.parseInt(strHariKerja);

                double tunjanganMakan = hariKerja * 10000.0; // Dikali Rp.10.000[cite: 1]
                double tunjanganTransport = hariKerja * 5000.0; // Dikali Rp.5.000[cite: 1]
                double gajiKotor = gajiPokok + tunjJabatan + tunjanganMakan + tunjanganTransport; // Total gaji kotor[cite: 1]

                double pajak = 0.10 * gajiKotor; // Pajak 10% dari gaji kotor[cite: 1]
                double gajiBersih = gajiKotor - pajak;

                tvTunjMakan.setText("Tunjangan Makan: Rp " + String.format("%.0f", tunjanganMakan));
                tvTunjTransport.setText("Tunjangan Transportasi: Rp " + String.format("%.0f", tunjanganTransport));
                tvGajiKotor.setText("Gaji Kotor: Rp " + String.format("%.0f", gajiKotor));
                tvGajiBersih.setText("Gaji Bersih: Rp " + String.format("%.0f", gajiBersih));

            }
        });
    }
}