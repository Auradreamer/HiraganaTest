package com.example.wangmengyu.hiraganatest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    TextView JapaneseChar;
    EditText inputf;
    String txt;

    Button submit;
    Button start;
    Button next;

    TestHashTable hashTable = new TestHashTable();
    Hashtable  ht = hashTable.TestHashTable();

    String vl;
    String key;

    Iterator iterator;
    Map.Entry entry;

    int counter = 0;
    double per;

    Intent intent = new Intent();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_1);

        JapaneseChar = (TextView)findViewById(R.id.Japanesecharr);

        //achieving key,value pairs from the hashtable
        start = (Button)findViewById(R.id.startbtn);
        startbtn();

        //JapaneseChar.setText("あ");

        inputf = (EditText)findViewById(R.id.editText);


        submit = (Button)findViewById(R.id.submitbtn);
        submitbtn();


        next = (Button)findViewById(R.id.nextbtn);
        next();

        per = (counter/ht.size());

        String perc = String.valueOf(per);


        intent.putExtra("score",perc);



    }

    public void startbtn() {

        start.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        setTextview();

                    }
                }


        );


    }

    public void submitbtn() {

        submit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        txt = inputf.getText().toString();

                        iterator = ht.entrySet().iterator();


                        while (iterator.hasNext()) {
                            entry = (Map.Entry)iterator.next();
                            if(entry.getValue().equals(vl)) {

                                key = entry.getKey().toString();

                            }

                        }

                        if (txt.equals(key)) {
                            Toast.makeText(SecondActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                            counter++;

                           // per = 100;
                            ht.remove(key);
                            JapaneseChar.setText("Try more?");
                            startbtn();


                        } else {
                            Toast.makeText(SecondActivity.this, "Woops! Try again\n", Toast.LENGTH_LONG).show();
                        }


                    }
                }


        );


    }

    public void setTextview() {

        if (ht.size() > 0) {

            for (Object value : ht.values()) {
                vl = value.toString();
                JapaneseChar.setText(value.toString());

            }
        } else {
            JapaneseChar.setText("Good job! Click NEXT to see your score!");

        }
    }

    public void next() {

        next.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        intent.setClass(SecondActivity.this, ThirdActivity.class);
                        SecondActivity.this.startActivity(intent);




                    }
                }


        );


    }




}
