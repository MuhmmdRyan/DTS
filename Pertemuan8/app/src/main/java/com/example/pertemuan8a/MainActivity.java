package com.example.pertemuan8a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText angka_pertama;
    EditText angka_kedua;
    TextView hasil;
    Button tambah;
    Button kurang;
    Button bagi;
    Button kali;
    Button bersihkan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka_pertama = findViewById(R.id.EText1);
        angka_kedua = findViewById(R.id.EText2);
        hasil = findViewById(R.id.Lbl_Text3);
        tambah = findViewById(R.id.Btn1);
        kurang = findViewById(R.id.Btn2);
        bagi = findViewById(R.id.Btn3);
        kali = findViewById(R.id.Btn4);
        bersihkan = findViewById(R.id.Btn5);
    }

    public void penambahan (View v){
        if (angka_pertama.getText().length()>0 && angka_kedua.getText().length()>0){
            int input1 = Integer.parseInt(angka_pertama.getText().toString());
            int input2 = Integer.parseInt(angka_kedua.getText().toString());
            int hasilnya = input1 + input2;
            hasil.setText(Integer.toString(hasilnya));
        }else{
            Toast toast = Toast.makeText(getApplicationContext(), "Mohon Masukkan",Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void pengurangan (View v){
        if (angka_pertama.getText().length()>0 && angka_kedua.getText().length()>0){
            int input1 = Integer.parseInt(angka_pertama.getText().toString());
            int input2 = Integer.parseInt(angka_kedua.getText().toString());
            int hasilnya = input1 - input2;
            hasil.setText(Integer.toString(hasilnya));
        }else{
            Toast toast = Toast.makeText(getApplicationContext(), "Mohon Masukkan",Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void pembagian (View v){
        if (angka_pertama.getText().length()>0 && angka_kedua.getText().length()>0){
            int input1 = Integer.parseInt(angka_pertama.getText().toString());
            int input2 = Integer.parseInt(angka_kedua.getText().toString());
            int hasilnya = input1 / input2;
            hasil.setText(Integer.toString(hasilnya));
        }else{
            Toast toast = Toast.makeText(getApplicationContext(), "Mohon Masukkan",Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void perkalian (View v){
        if (angka_pertama.getText().length()>0 && angka_kedua.getText().length()>0){
            int input1 = Integer.parseInt(angka_pertama.getText().toString());
            int input2 = Integer.parseInt(angka_kedua.getText().toString());
            int hasilnya = input1 * input2;
            hasil.setText(Integer.toString(hasilnya));
        }else{
            Toast toast = Toast.makeText(getApplicationContext(), "Mohon Masukkan",Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void Kosongkan (View v){
        angka_pertama.setText("");
        angka_kedua.setText("");
        hasil.setText("0");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.menu1){
            startActivity(new Intent(this, GanjilGenap.class));
        }

        return true;
    }
}
