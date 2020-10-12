package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonMul,
            buttonDiv, buttonDecimal, buttonC, buttonEql;
    TextView outputTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        buttonAdd = (Button) findViewById(R.id.btnAdd);
        buttonSub = (Button) findViewById(R.id.btnSub);
        buttonMul = (Button) findViewById(R.id.btnMul);
        buttonDiv = (Button) findViewById(R.id.btnDiv);
        buttonDecimal = (Button) findViewById(R.id.btnDecimal);
        buttonC = (Button) findViewById(R.id.btnC);
        buttonEql = (Button) findViewById(R.id.btnEql);
        outputTxt = (TextView) findViewById(R.id.screen);
        button0.setOnClickListener((v)-> {
            outputTxt.setText(outputTxt.getText()+"0");});
        button1.setOnClickListener((v)-> {
            outputTxt.setText(outputTxt.getText()+"1");});
        button2.setOnClickListener((v)-> {
            outputTxt.setText(outputTxt.getText()+"2");});
        button3.setOnClickListener((v)-> {
            outputTxt.setText(outputTxt.getText()+"3");});
        button4.setOnClickListener((v)-> {
            outputTxt.setText(outputTxt.getText()+"4");});
        button5.setOnClickListener((v)-> {
            outputTxt.setText(outputTxt.getText()+"5");});
        button6.setOnClickListener((v)-> {
            outputTxt.setText(outputTxt.getText()+"6");});
        button7.setOnClickListener((v)-> {
            outputTxt.setText(outputTxt.getText()+"7");});
        button8.setOnClickListener((v)-> {
            outputTxt.setText(outputTxt.getText()+"8");});
        button9.setOnClickListener((v)-> {
            outputTxt.setText(outputTxt.getText()+"9");});
        buttonAdd.setOnClickListener((v)-> {
            outputTxt.setText(outputTxt.getText()+"+");});
        buttonSub.setOnClickListener((v)-> {
            outputTxt.setText(outputTxt.getText()+"-");});
        buttonMul.setOnClickListener((v)-> {
            outputTxt.setText(outputTxt.getText()+"*");});
        buttonDiv.setOnClickListener((v)-> {
            outputTxt.setText(outputTxt.getText()+"/");});
        buttonDecimal.setOnClickListener((v)-> {
            outputTxt.setText(outputTxt.getText()+".");});
        buttonC.setOnClickListener((v)-> {
            outputTxt.setText(null);});
        buttonEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x=0;
                String str = (String)outputTxt.getText();
                if(str.contains("*")||str.contains("/")||str.contains("+")||str.contains("-")){
                    if(str.contains("*")){
                        String[] strs = str.split("\\*");
                        x=Double.parseDouble(strs[0])*Double.parseDouble(strs[1]);
                    }else if(str.contains("/")){
                        String[] strs = str.split("\\/");
                        x=Double.parseDouble(strs[0])/Double.parseDouble(strs[1]);
                    }else if (str.contains("+")){
                        String[] strs = str.split("\\+");
                        x=Double.parseDouble(strs[0])+Double.parseDouble(strs[1]);
                    }else if(str.contains("-")){
                        String[] strs = str.split("\\-");
                        x=Double.parseDouble(strs[0])-Double.parseDouble(strs[1]);
                    }
                    outputTxt.setText(Double.toString(x));

                }
            }
        });

    }
}