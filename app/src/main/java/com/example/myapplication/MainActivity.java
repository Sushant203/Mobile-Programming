package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.button);
        EditText name=findViewById(R.id.txtName);
        EditText rollno=findViewById(R.id.txtRollNo);
        EditText txtClass=findViewById(R.id.txtClass);
        EditText address=findViewById(R.id.txtAddress);
        TextView txtShowDetails=findViewById(R.id.txtShowDetails);
        RadioGroup radiogrp= findViewById(R.id.radiogrp);
        CheckBox chk= findViewById(R.id.checkBox);
        CheckBox chk1=findViewById(R.id.checkBox2);

        ArrayAdapter<CharSequence> semArray= ArrayAdapter.createFromResource(this,R.array.semester,R.layout.spinner_layout);
            semArray.setDropDownViewResource(R.layout.spinner_layout);
        Spinner sem=findViewById(R.id.spinsem);
        sem.setAdapter(semArray);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hobbies="";
                if(chk.isChecked()){
                   hobbies+=chk.getText().toString();
                }

                if(chk1.isChecked()){
                    hobbies+=chk1.getText().toString();
                }
//                txtShowDetails.setText(hobbies);

                int id= radiogrp.getCheckedRadioButtonId();
                RadioButton SelectedRadioButton= findViewById(id);
                String student_details="Name: "+name.getText()+"\nRollno :"+rollno.getText()+"\nClass :"+txtClass.getText()+"\nAddress :"+address.getText()+"\ngender:"+SelectedRadioButton.getText().toString()+"\nhobbies:"+hobbies;
                Intent i=new Intent(getApplicationContext(), MainActivity2.class);
                i.putExtra("students_details",student_details);
                startActivity(i);
            }
        });


    }
}