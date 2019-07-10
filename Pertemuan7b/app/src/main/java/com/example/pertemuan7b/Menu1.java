package com.example.pertemuan7b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Menu1 extends AppCompatActivity {
    EditText Input_Nama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        Input_Nama = findViewById(R.id.EText1);
        Hasil = findViewById(R.id.Lbl_Text2);
    }

    public void Hasilnya(View v){
        Hasil.setText("Nama anda adalah : " + Input_Nama.getText());
    }
}
