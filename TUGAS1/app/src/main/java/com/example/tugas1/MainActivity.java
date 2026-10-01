package com.example.tugas1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private EditText edPanjang, edLebar,edLuas;
private Button btHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edPanjang = (EditText) findViewById(R.id.edPanjang);
        edLebar = (EditText) findViewById(R.id.edLebar);
        edLuas = (EditText) findViewById(R.id.edLuas);
        btHitung = (Button) findViewById(R.id.btHitung);
    }

    public void hitung(View view){
        double panjang = Double.parseDouble(edPanjang.getText().toString());
        double lebar = Double.parseDouble(edLebar.getText().toString());
        double luas = panjang * lebar;
        edLuas.setText(""+luas);
    }
}