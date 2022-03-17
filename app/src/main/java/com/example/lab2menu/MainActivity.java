package com.example.lab2menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_inicio:
                Log.i("====>","Click en Inicio!!");
                return true;
            case R.id.menu_productos:
                Log.i("====>","Click en Productos!!");
                startActivity(new Intent(this, ProductosActivity.class));
                return true;
            case R.id.menu_servicios:
                Log.i("====>","Click en Servicios!!");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}