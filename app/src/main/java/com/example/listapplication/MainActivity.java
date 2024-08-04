package com.example.listapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView view = findViewById(R.id.listdetails);
        String[] names = { "manoj", "sushant", "himal", "jivan" };

        ArrayAdapter<String> namesAdapter = new ArrayAdapter<String>(this, R.layout.list_item_layout, R.id.textlistitem, names);
        view.setAdapter(namesAdapter);
    }
}
