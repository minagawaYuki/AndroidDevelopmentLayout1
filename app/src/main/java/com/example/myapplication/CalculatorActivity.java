package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class CalculatorActivity extends AppCompatActivity {

    Button btnZero, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot, btnPlus, btnDivide,
            btnMultiply, btnSubtract, btnEquals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Calculator calculator = new Calculator();

        StringBuilder sb = new StringBuilder();

        btnZero = (Button) findViewById(R.id.btnZero);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnDot = (Button)  findViewById(R.id.btnDot);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnEquals = (Button) findViewById(R.id.btnEquals);
        TextView inputField = (TextView) findViewById(R.id.inputField);
        TextView answerField = (TextView) findViewById(R.id.answerField);

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append('0');
                answerField.setText(calculator.getInfixResult());
                inputField.setText(calculator.getString());
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append('1');
                answerField.setText(calculator.getInfixResult());
                inputField.setText(calculator.getString());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append('2');
                answerField.setText(calculator.getInfixResult());
                inputField.setText(calculator.getString());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append('3');
                answerField.setText(calculator.getInfixResult());
                inputField.setText(calculator.getString());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append('4');
                answerField.setText(calculator.getInfixResult());
                inputField.setText(calculator.getString());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append('5');
                answerField.setText(calculator.getInfixResult());
                inputField.setText(calculator.getString());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append('6');
                answerField.setText(calculator.getInfixResult());
                inputField.setText(calculator.getString());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append('7');
                answerField.setText(calculator.getInfixResult());
                inputField.setText(calculator.getString());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append('8');
                answerField.setText(calculator.getInfixResult());
                inputField.setText(calculator.getString());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.append('9');
                answerField.setText(calculator.getInfixResult());
                inputField.setText(calculator.getString());
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Calculator.isOperator(calculator.getLastIndex()) || Calculator.isDecimal(calculator.getLastIndex())) {
                    return;
                }
                calculator.append('.');
                inputField.setText(calculator.getString());
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Calculator.isOperator(calculator.getLastIndex()) || Calculator.isDecimal(calculator.getLastIndex())) {
                    return;
                }
                calculator.append('+');
                inputField.setText(calculator.getString());
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Calculator.isOperator(calculator.getLastIndex()) || Calculator.isDecimal(calculator.getLastIndex())) {
                    return;
                }
                calculator.append('/');
                inputField.setText(calculator.getString());
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Calculator.isOperator(calculator.getLastIndex()) || Calculator.isDecimal(calculator.getLastIndex())) {
                    return;
                }
                calculator.append('*');
                inputField.setText(calculator.getString());
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Calculator.isOperator(calculator.getLastIndex()) || Calculator.isDecimal(calculator.getLastIndex())) {
                    return;
                }
                calculator.append('-');
                inputField.setText(calculator.getString());
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Calculator.isOperator(calculator.getLastIndex()) || Calculator.isDecimal(calculator.getLastIndex())) {
                    return;
                }
                calculator.solve();
                answerField.setText(calculator.getString());
                inputField.setText("");
            }
        });
    }
}