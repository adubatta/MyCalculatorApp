package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.Math;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        try {
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 + num2;
            numberSumTV.setText("" + sum);

        }
        catch(Exception e) {
            numberSumTV.setText("Sorry, please enter number!!");
        }
    }
    public void findSub(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        try {
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 - num2;
            numberSumTV.setText("" + sum);
        }
        catch (Exception e){
            numberSumTV.setText("Sorry, please enter number!!");

        }

    }
    public void findMult(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        try {
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 * num2;
            numberSumTV.setText("" + sum);
        }
        catch (Exception e){
            numberSumTV.setText("Sorry, please enter number!!");
        }

    }
    public void findDiv(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        try {
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 / num2;

            numberSumTV.setText("" + sum);
        }
        catch(Exception e){
            numberSumTV.setText("Sorry, please enter number!!");
        }
    }
    public void findPower(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        try {
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = (int) Math.pow(num1, num2);
            numberSumTV.setText("" + sum);
        }
        catch (Exception e){
            numberSumTV.setText("Sorry, please enter number!!");
        }
    }
    public void clearAll(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        numberSumTV.setText("");
        number1ET.setText("");
        number2ET.setText("");
    }
//    public void closeKeyboard()
//    {
//        // this will give us the view
//        // which is currently focus
//        // in this layout
//        View view = this.getCurrentFocus();
//
//        // if nothing is currently
//        // focus then this will protect
//        // the app from crash
//        if (view != null) {
//
//            // now assign the system
//            // service to InputMethodManager
//            InputMethodManager manager
//                    = (InputMethodManager)
//                    getSystemService(
//                            Context.INPUT_METHOD_SERVICE);
//            manager
//                    .hideSoftInputFromWindow(
//                            view.getWindowToken(), 0);
//        }
//    }

}