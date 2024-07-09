package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        Button btn1=findViewById(R.id.button3);
        Button btn2= findViewById(R.id.button4);
        Button btn3= findViewById(R.id.button5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager frg= getSupportFragmentManager();
                FragmentTransaction frt= frg.beginTransaction();
                frt.replace(R.id.fragmentContainerView,new BlankFragment());
                frt.commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager frg= getSupportFragmentManager();
                FragmentTransaction frt= frg.beginTransaction();
                frt.replace(R.id.fragmentContainerView,new BlankFragment2());
                frt.commit();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager frg= getSupportFragmentManager();
                FragmentTransaction frt= frg.beginTransaction();
                frt.replace(R.id.fragmentContainerView,new BlankFragment3());
                frt.commit();
            }
        });

    }
}