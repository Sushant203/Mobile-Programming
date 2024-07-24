package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu_activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button btn= findViewById(R.id.button6);
        registerForContextMenu(btn);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int selectedId = item.getItemId();
          if(selectedId==R.id.item1){
              gotoActivity();
              return  true;
          }

        return super.onOptionsItemSelected(item);


    }
    public void gotoActivity(){
        Intent i = new Intent(getApplicationContext(), FragmentActivity.class);
        startActivity(i);
    }

    //context menu


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater mi= getMenuInflater();
        mi.inflate(R.menu.mymenu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int selectedId = item.getItemId();
        if (selectedId == R.id.item1) {
            gotoActivity();
            return true;
        }
        return super.onContextItemSelected(item);
    }

    //popup menu
    public void showMenu(View v){
        PopupMenu popup= new PopupMenu(this,v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.mymenu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        int selectedId = item.getItemId();
        if (selectedId == R.id.item1) {
            gotoActivity();
            return true;
        }

        return true;
    }
}