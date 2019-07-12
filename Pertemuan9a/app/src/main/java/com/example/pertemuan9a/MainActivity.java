package com.example.pertemuan9a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Edit1;
    EditText Edit2;
    EditText Edit3;
    TextView Text1;
    TextView Text2;
    TextView Text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Edit1 = findViewById(R.id.ETxt1);
        Edit2 = findViewById(R.id.ETxt2);
        Edit3 = findViewById(R.id.ETxt3);
        Text1 = findViewById(R.id.Txt1);
        Text2 = findViewById(R.id.Txt2);
        Text3 = findViewById(R.id.Txt3);
    }

    public void Hasil1 (View V){
        Text1.setText("NIM : " + Edit1.getText());
        Text2.setText("Nama : " + Edit2.getText());
        Text3.setText("Kampus : " + Edit3.getText());
    }
}
