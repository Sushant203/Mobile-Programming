package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button btn= findViewById(R.id.button10);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity3.this);
                builder.setTitle("Additon");
                builder.setCancelable(true);

                LayoutInflater li= getLayoutInflater();
                View view= li.inflate(R.layout.custom_dialog,null);
                builder.setView(view);
                Button btnadd= view.findViewById(R.id.button9);
                btnadd.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            EditText firstNum= view.findViewById(R.id.editTextText7);
                            EditText secondNum= view.findViewById(R.id.editTextText8);

                            TextView res= view.findViewById(R.id.textView11);

                            int a=Integer.parseInt(firstNum.getText().toString());
                            int b= Integer.parseInt(secondNum.getText().toString());
                            int sum= a+b;
                        res.setText(sum);
                        }
                    });
                AlertDialog alert= builder.create();

                alert.show();
            }
        });
    }
}