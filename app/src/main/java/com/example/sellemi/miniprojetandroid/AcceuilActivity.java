package com.example.sellemi.miniprojetandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class AcceuilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_Appel:
                Intent intent = new Intent(this, AppelEtudiantActivity.class);
                startActivity(intent);
                return true;
            case R.id.menu_note:
                /*Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                */return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
