package com.example.numbers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Number2 extends AppCompatActivity {

    EditText et_n1;
    EditText et_n2;
    TextView tv_n;

    //global veriables
    String number1;
    String number2;

    int n1;
    int n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number2);

        et_n1 = findViewById(R.id.et_n1);
        et_n2 = findViewById(R.id.et_n2);
        tv_n = findViewById(R.id.tv_n);

        Intent intent = getIntent();
        number1 = intent.getStringExtra("n1"); //store value // reference for the 1st number
        number2 = intent.getStringExtra("n2");

        et_n1.setText(number1);
        et_n2.setText(number2);

        //turing string values to integer
        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);

    }
    public void add(View view){
        tv_n.setText(number1 +"+"+number2+"=" +(n1+n2));
    }
    public void subs(View view){
        tv_n.setText(number1+"-"+number2+"="+(n1-n2));
    }
    public void division(View view){
        tv_n.setText(number1+"/"+number2+"="+(n1/n2));
    }
    public void multi(View view){
        tv_n.setText(number1+"*"+number2+"="+(n1*n2));
    }
}