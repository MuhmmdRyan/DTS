package com.example.pertemuan10a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MenuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.menu1){
            startActivity(new Intent(this, Internal.class));
        } else if (item.getItemId()==R.id.menu2){
            startActivity(new Intent(this, Eksternal.class));
        }

        return true;
    }

    public void internal (View v){
        startActivity(new Intent(this, Internal.class));
    }

    public void eksternal (View v){
        startActivity(new Intent(this, Eksternal.class));
    }
}
