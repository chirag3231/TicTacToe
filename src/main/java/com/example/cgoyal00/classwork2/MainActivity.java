package com.example.cgoyal00.classwork2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    int chance;
    TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7= (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn10 = (Button)findViewById(R.id.btn10);
        textview = (TextView)findViewById(R.id.text1);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {
       switch(v.getId()) {
           case R.id.btn1:

               if (btn1.getText().equals("")) {
                   if (chance == 0) {
                       chance =1;
                       btn1.setText("O");
                       results();
                   } else {
                       chance = 0;
                       btn1.setText("X");
                       results();
                   }

               }
               break;
           case R.id.btn2:

               if(btn2.getText().equals(""))
               {
                   if(chance==0){
                       chance =1;
                       btn2.setText("O");
                       results();
                   }
                   else {
                       chance = 0;
                       btn2.setText("X");
                       results();
                   }

               }
               break;
           case R.id.btn3:

               if(btn3.getText().equals(""))
               {
                   if(chance==0){
                       chance =1;
                       btn3.setText("O");
                       results();
                   }
                   else {
                       chance = 0;
                       btn3.setText("X");
                       results();
                   }

               }
               break;
           case R.id.btn4:

               if(btn4.getText().equals(""))
               {
                   if(chance==0){
                       chance =1;
                       btn4.setText("O");
                       results();
                   }
                   else {
                       chance = 0;
                       btn4.setText("X");
                       results();
                   }

               }
               break;
               case R.id.btn5:

               if(btn5.getText().equals(""))
               {
                   if(chance==0){
                       chance =1;
                       btn5.setText("O");
                       results();
                   }
                   else {
                       chance = 0;
                       btn5.setText("X");
                       results();
                   }

               }
                   break;
               case R.id.btn6:

               if(btn6.getText().equals(""))
               {
                   if(chance==0){
                       chance = 1;
                       btn6.setText("O");
                       results();
                   }
                   else {
                       chance = 0;
                       btn6.setText("X");
                       results();
                   }

               }break;
           case R.id.btn7:

               if(btn7.getText().equals(""))
               {
                   if(chance==0){
                       chance=1;
                       btn7.setText("O");
                       results();
                   }
                   else {
                       chance = 0;
                       btn7.setText("X");
                       results();
                   }

               }break;
           case R.id.btn8:

               if(btn8.getText().equals(""))
               {
                   if(chance==0){
                       chance =1;
                       btn8.setText("O");
                       results();
                   }
                   else {
                       chance = 0;
                       btn8.setText("X");
                       results();
                   }

               }
               break;
           case R.id.btn9:

               if(btn9.getText().equals(""))
               {
                   if(chance==0){
                       chance =1;
                       btn9.setText("O");
                       results();
                   }
                   else {
                       chance = 0;
                       btn9.setText("X");
                       results();
                   }

               }
               break;

           case R.id.btn10:
               btn1.setText("");
               btn2.setText("");
               btn3.setText("");
               btn4.setText("");
               btn5.setText("");
               btn6.setText("");
               btn7.setText("");
               btn8.setText("");
               btn9.setText("");
               textview.setText("");
               break;

       }




    }


    public void results()
    {
        if (btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X"))
        {
            textview.setText("Player 1 Won" .toString());
        }
        else  if (btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X"))
        {
            textview.setText("Player 1 Won".toString());
        }
        else  if (btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
        {
            textview.setText("Player 1 Won".toString());
        }
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        else if (btn1.getText().toString().equals("O") && btn2.getText().toString().equals("O") && btn3.getText().toString().equals("O"))
        {
            textview.setText("Player 2 Won".toString());
        }
        else  if (btn4.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn6.getText().toString().equals("O"))
        {
            textview.setText("Player 2 Won".toString());
        }
        else  if (btn7.getText().toString().equals("O") && btn8.getText().toString().equals("O") && btn9.getText().toString().equals("O"))
        {
            textview.setText("Player 2 Won".toString());
        }
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        else if (btn1.getText().toString().equals("X") && btn4.getText().toString().equals("X") && btn7.getText().toString().equals("X"))
        {
            textview.setText("Player 1 Won".toString());
        }
        else  if (btn2.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn8.getText().toString().equals("X"))
        {
            textview.setText("Player 1 Won".toString());
        }
        else  if (btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
        {
            textview.setText("Player 1 Won".toString());
        }
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        else if (btn1.getText().toString().equals("O") && btn4.getText().toString().equals("O") && btn7.getText().toString().equals("O"))
        {
            textview.setText("Player 2 Won".toString());
        }
        else  if (btn2.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn8.getText().toString().equals("O"))
        {
            textview.setText("Player 2 Won".toString());
        }
        else  if (btn3.getText().toString().equals("O") && btn6.getText().toString().equals("O") && btn9.getText().toString().equals("O"))
        {
            textview.setText("Player 2 Won".toString());
        }
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        else if (btn1.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn9.getText().toString().equals("O"))
        {
            textview.setText("Player 2 Won".toString());
        }
        else  if (btn3.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn7.getText().toString().equals("O"))
        {
            textview.setText("Player 2 Won".toString());
        }
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        else  if (btn3.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn7.getText().toString().equals("X"))
        {
            textview.setText("Player 1 Won".toString());
        }
        else  if (btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
        {
            textview.setText("Player 1 Won".toString());
        }

    }
}
