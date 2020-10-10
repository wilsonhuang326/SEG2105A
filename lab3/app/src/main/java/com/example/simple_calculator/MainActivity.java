package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    Button buttonC,button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,
            buttonAdd,buttonSub,buttonMul,buttonDivision,buttonEqual,buttonDot;
    TextView edttext;

    boolean add, sub, mul, div;

    double val_one=0, val_two=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0=(Button)findViewById(R.id.btn0);
        button1=(Button)findViewById(R.id.btn1);
        button2=(Button)findViewById(R.id.btn2);
        button3=(Button)findViewById(R.id.btn3);
        button4=(Button)findViewById(R.id.btn4);
        button5=(Button)findViewById(R.id.btn5);
        button6=(Button)findViewById(R.id.btn6);
        button7=(Button)findViewById(R.id.btn7);
        button8=(Button)findViewById(R.id.btn8);
        button9=(Button)findViewById(R.id.btn9);
        buttonC=(Button)findViewById(R.id.btnClean);
        buttonAdd=(Button)findViewById(R.id.btnAdd);
        buttonSub=(Button)findViewById(R.id.btnSub);
        buttonMul=(Button)findViewById(R.id.btnMul);
        buttonDivision=(Button)findViewById(R.id.btnDivision);
        buttonDot=(Button)findViewById(R.id.btnDot);
        buttonEqual=(Button)findViewById(R.id.btnEuqal);

        edttext=(TextView)findViewById(R.id.screen);

        button0.setOnClickListener((v)-> {
            edttext.setText(edttext.getText()+"0");});
        button1.setOnClickListener((v)-> {
            edttext.setText(edttext.getText()+"1");});
        button2.setOnClickListener((v)-> {
            edttext.setText(edttext.getText()+"2");});
        button3.setOnClickListener((v)-> {
            edttext.setText(edttext.getText()+"3");});
        button4.setOnClickListener((v)-> {
            edttext.setText(edttext.getText()+"4");});
        button5.setOnClickListener((v)-> {
            edttext.setText(edttext.getText()+"5");});
        button6.setOnClickListener((v)-> {
            edttext.setText(edttext.getText()+"6");});
        button7.setOnClickListener((v)-> {
            edttext.setText(edttext.getText()+"7");});
        button8.setOnClickListener((v)-> {
            edttext.setText(edttext.getText()+"8");});
        button9.setOnClickListener((v)-> {
            edttext.setText(edttext.getText()+"9");});


        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                add=true;
                val_one = Double.parseDouble(edttext.getText().toString());
                sub=false;
                mul=false;
                div=false;
                edttext.setText("");
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sub=true;
                val_one = Double.parseDouble(edttext.getText().toString());
                add=false;
                mul=false;
                div=false;
                edttext.setText("");
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mul=true;
                val_one = Double.parseDouble(edttext.getText().toString());
                sub=false;
                add=false;
                div=false;
                edttext.setText("");
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                div=true;
                val_one = Double.parseDouble(edttext.getText().toString());
                sub=false;
                mul=false;
                add=false;
                edttext.setText("");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                val_two= Double.parseDouble(edttext.getText().toString());
                double result=val_two;
                if(add){
                    edttext.setText(Double.toString(val_one+result));
                }else if(sub){
                    edttext.setText(Double.toString(val_one-result));
                }else if(mul){
                    edttext.setText(Double.toString(val_one*result));
                }else if(div){
                    edttext.setText(Double.toString(val_one/result));
                }


            }
        });

        buttonC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edttext.setText("");
                val_one=0;
                val_two=0;
                sub=false;
                mul=false;
                add=false;
                div=false;
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String temp;
                temp=edttext.getText().toString();
                boolean d=false;
                for(int i=0;i<temp.length();i++){
                    if(temp.charAt(i)=='.'){
                        d=true;
                    }
                }
                if(d==false){
                    edttext.setText(edttext.getText()+".");
                }
            }
        });
    }
}