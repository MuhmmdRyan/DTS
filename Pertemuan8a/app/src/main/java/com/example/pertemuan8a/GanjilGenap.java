package com.example.pertemuan8a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GanjilGenap extends AppCompatActivity {

    EditText angka;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganjil_genap);

        angka = findViewById(R.id.ETxt1);
        hasil = findViewById(R.id.Lbl_Txt2);
    }

    public void perbandingan (View v){

        int masuk = Integer.parseInt(angka.getText().toString());

        if((masuk % 2) == 0){
            hasil.setText("Angka " +masuk+ " Adalah genap");
        } else {
            hasil.setText("Angka " +masuk+ " Adalah ganjil");
        }
    }
}
