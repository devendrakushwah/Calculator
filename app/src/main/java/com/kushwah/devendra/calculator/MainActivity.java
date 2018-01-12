package com.kushwah.devendra.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mult,div,undo,clear,equal,info;
    EditText text;
    int n1,n2,ans;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(EditText)findViewById(R.id.text);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        zero=(Button)findViewById(R.id.zero);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mult=(Button)findViewById(R.id.mult);
        div=(Button)findViewById(R.id.div);
        undo=(Button)findViewById(R.id.undo);
        clear=(Button)findViewById(R.id.clear);
        equal=(Button)findViewById(R.id.equal);
        info=(Button)findViewById(R.id.info);
        //all the action listeners
        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp=text.getText().toString();
                text.setText(temp+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp=text.getText().toString();
                text.setText(temp+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp=text.getText().toString();
                text.setText(temp+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp=text.getText().toString();
                text.setText(temp+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp=text.getText().toString();
                text.setText(temp+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp=text.getText().toString();
                text.setText(temp+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp=text.getText().toString();
                text.setText(temp+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp=text.getText().toString();
                text.setText(temp+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp=text.getText().toString();
                text.setText(temp+"9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp=text.getText().toString();
                text.setText(temp+"0");
            }
        });

        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                text.setText("");
            }
        });

        undo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp=text.getText().toString();
                if(temp.length()!=0)
                {
                    text.setText(temp.substring(0,temp.length()-1));
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(flag==0) {
                    n1 = Integer.parseInt(text.getText().toString());
                    flag = 1;
                    text.setText("");
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(flag==0) {
                    n1 = Integer.parseInt(text.getText().toString());
                    flag = 2;
                    text.setText("");
                }
            }
        });

        mult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(flag==0) {
                    n1 = Integer.parseInt(text.getText().toString());
                    flag = 3;
                    text.setText("");
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(flag==0) {
                    n1 = Integer.parseInt(text.getText().toString());
                    flag = 4;
                    text.setText("");
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                n2=Integer.parseInt(text.getText().toString());
                if(flag==1)
                {
                    text.setText(Integer.toString(add(n1,n2)));
                    flag=0;
                }
                else if(flag==2)
                {
                    text.setText(Integer.toString(sub(n1,n2)));
                    flag=0;
                }
                else if(flag==3)
                {
                    text.setText(Integer.toString(mult(n1,n2)));
                    flag=0;
                }
                else if(flag==4)
                {
                    text.setText(Integer.toString(div(n1,n2)));
                    flag=0;
                }
                else
                {
                    text.setText(Integer.toString(n2));
                    flag=0;
                }
            }
        });

        info.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this, "App Created By Devendra Kushwah", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public int mult(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        return a/b;
    }
}
