package com.example.program2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public EditText num1,num2;
public TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Add(View view){
        try {
            num1=findViewById(R.id.num1);
            num2=findViewById(R.id.num2);
            txt=findViewById(R.id.textView);
            String s=num1.getText().toString();
            String s1=num2.getText().toString();
            Double d=Double.parseDouble(s);
            Double d1=Double.parseDouble(s1);
            Double d2=d+d1;
            String s2=String.valueOf(d2);
            String s3="The sum is "+s2;
            txt.setText(s3);
            Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();

        }
        catch (Exception e){
            String ss="please enter the input";
            txt.setText(ss);
            Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
        }

    }

    }