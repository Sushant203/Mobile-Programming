package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Calculation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

        EditText firstnum= findViewById(R.id.editTextText);
        EditText secondnum= findViewById(R.id.editTextText2);
        EditText result=findViewById(R.id.editTextText3);
        Button add= findViewById(R.id.add);
        Button sub= findViewById(R.id.subtract);
        Button product= findViewById(R.id.multiply);
        Button division= findViewById(R.id.division);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstnumber=Integer.parseInt(firstnum.getText().toString());
                int secondnumber= Integer.parseInt(secondnum.getText().toString());
                int sum= firstnumber+secondnumber;
                result.setText(String.valueOf(sum));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstnumber=Integer.parseInt(firstnum.getText().toString());
                int secondnumber= Integer.parseInt(secondnum.getText().toString());
                int subtract= firstnumber+secondnumber;
                result.setText(String.valueOf(subtract));
            }
        });

        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstnumber=Integer.parseInt(firstnum.getText().toString());
                int secondnumber= Integer.parseInt(secondnum.getText().toString());
                int product= firstnumber*secondnumber;
                result.setText(String.valueOf(product));
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstnumber=Integer.parseInt(firstnum.getText().toString());
                int secondnumber= Integer.parseInt(secondnum.getText().toString());
                int divide= firstnumber/secondnumber;
                result.setText(String.valueOf(divide));
            }
        });
        };
    }
