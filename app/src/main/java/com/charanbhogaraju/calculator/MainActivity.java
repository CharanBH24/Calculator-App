package com.charanbhogaraju.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double in1=0,in2=0;
    TextView textView;
    boolean Add,Sub,Multiply,Divide,Remainder,Decimal=true;
    Button button_0,button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9,button_Add,button_Sub,
    button_Mul,button_Div,button_Ans,button_Del,button_Dot,button_Remainder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_0=(Button)findViewById(R.id.button11);
        button_1=(Button)findViewById(R.id.button1);
        button_2=(Button)findViewById(R.id.button2);
        button_3=(Button)findViewById(R.id.button3);
        button_4=(Button)findViewById(R.id.button4);
        button_5=(Button)findViewById(R.id.button5);
        button_6=(Button)findViewById(R.id.button6);
        button_7=(Button)findViewById(R.id.button7);
        button_8=(Button)findViewById(R.id.button8);
        button_9=(Button)findViewById(R.id.button9);
        button_Dot=(Button)findViewById(R.id.button10);
        button_Remainder=(Button)findViewById(R.id.button12);
        button_Div=(Button)findViewById(R.id.button13);
        button_Sub=(Button)findViewById(R.id.button14);
        button_Mul=(Button)findViewById(R.id.button15);
        button_Add=(Button)findViewById(R.id.button16);
        button_Del=(Button)findViewById(R.id.button17);
        button_Ans=(Button)findViewById(R.id.button18);

        textView=findViewById(R.id.textView);
        button_1.setOnClickListener(v -> {
            textView.setText(String.format("%s1", textView.getText()));

        });
        button_2.setOnClickListener(v -> {
            textView.setText(String.format("%s2", textView.getText()));
        });
        button_3.setOnClickListener(v -> {
            textView.setText(String.format("%s3", textView.getText()));
        });
        button_4.setOnClickListener(v -> {
            textView.setText(String.format("%s3", textView.getText()));
        });
        button_5.setOnClickListener(v->{
            textView.setText(String.format("%s5", textView.getText()));
        });
        button_6.setOnClickListener(v->{
            textView.setText(String.format("%s6", textView.getText()));
        });
        button_7.setOnClickListener(v->{
            textView.setText(String.format("%s7", textView.getText()));
        });
        button_8.setOnClickListener(v->{
            textView.setText(String.format("%s8", textView.getText()));
        });
        button_9.setOnClickListener(v->{
            textView.setText(String.format("%s9", textView.getText()));
        });
        button_0.setOnClickListener(v->{
            textView.setText(String.format("%s0", textView.getText()));
        });
        button_Add.setOnClickListener(v -> {
            if(textView.getText().length()!=0){
                in1=Float.parseFloat(textView.getText()+"");
                Toast.makeText(this,"ADDITION OPERATION INTIATED",Toast.LENGTH_LONG).show();
                Add=true;
                Decimal=false;
                textView.setText(null);

            }
        });
        button_Sub.setOnClickListener(v->{
            if(textView.getText().length()!=0){
                in1=Float.parseFloat(textView.getText()+"");
                Toast.makeText(this,"SUBTRACTION OPERATION INTIATED",Toast.LENGTH_LONG).show();
                Sub=true;
                Decimal=false;
                textView.setText(null);
            }
        });
        button_Mul.setOnClickListener((View v) ->{
            if(textView.getText().length()!=0){
                in1=Float.parseFloat(textView.getText()+"");
                Toast.makeText(this,"MULTIPLICATION OPERATION INTIATED",Toast.LENGTH_LONG).show();
                Multiply=true;
                Decimal=false;
                textView.setText(null);
            }
        });
        button_Div.setOnClickListener(v->{
            if(textView.getText().length()!=0){
                in1=Float.parseFloat(textView.getText()+"");
                Toast.makeText(this,"DIVISION OPERATION INTIATED",Toast.LENGTH_LONG).show();
                Divide=true;
                Decimal=false;
                textView.setText(null);
            }
        });
        button_Remainder.setOnClickListener(v->{
            if(textView.getText().length()!=0){
                in1=Float.parseFloat(textView.getText()+"");
                Toast.makeText(this,"REMAINDER OPERATION INTIATED",Toast.LENGTH_LONG).show();
                Remainder=true;
                Decimal=false;
                textView.setText(null);

            }
        });
        button_Ans.setOnClickListener(v->{
            if(Add||Sub||Multiply||Divide||Remainder){
                in2=Float.parseFloat(textView.getText()+"");
            }
            if(Add){
                textView.setText(in1+in2+"");
                Toast.makeText(this,"ADDITION OPERATION COMPLETED SUCESSFULLY",Toast.LENGTH_SHORT).show();
                Add=false;
            }
            if(Sub){
                textView.setText(in1-in2+"");
                Toast.makeText(this,"SUBTRACTION OPERATION COMPLETED SUCESSFULLY",Toast.LENGTH_SHORT).show();
                Sub=false;
            }
            if(Multiply){
                textView.setText(in1*in2+"");
                Toast.makeText(this,"MULTIPLICATION OPERATION COMPLETED SUCESSFULLY",Toast.LENGTH_SHORT).show();
                Multiply=false;

            }
            if(Divide){
                textView.setText(in1/in2+"");
                Toast.makeText(this,"DIVISION OPERATION COMPLETED SUCESSFULLY",Toast.LENGTH_SHORT).show();
                Divide=false;

            }
            if(Remainder){
                textView.setText(in1%in2+"");
                Toast.makeText(this,"REMAINDER OPERATION COMPLETED SUCESSFULLY",Toast.LENGTH_SHORT).show();
                Remainder=false;

            }

        });
        button_Del.setOnClickListener(v -> {
            textView.setText("");
            in1=0.0;
            in2=0.0;
        });
        button_Dot.setOnClickListener(v->{
            Decimal=true;
            if(Decimal){
                textView.setText(textView.getText()+".");
                Decimal=true;

            }

        });



    }
}