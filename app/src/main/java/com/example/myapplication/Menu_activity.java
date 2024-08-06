package com.example.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu_activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button btn= findViewById(R.id.button6);
        registerForContextMenu(btn);
        Button alertbtn= findViewById(R.id.button7);

        builder= new AlertDialog.Builder(this);
        alertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("are you sure you want to leave this site?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                        Toast.makeText(Menu_activity.this, "you choose yes action for alertbox", Toast.LENGTH_SHORT).show();
                    }
                })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        //action for No button
                        dialog.cancel();
                        Toast.makeText(Menu_activity.this, "you choose no action for alertbox", Toast.LENGTH_SHORT).show();
                    }
                });
                //creating dailog box
                AlertDialog alert= builder.create();
                //setting title manually
                alert.setTitle("AlertDialogExample");
                alert.show();
            }
        });
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