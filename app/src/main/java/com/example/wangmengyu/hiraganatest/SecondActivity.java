package com.example.wangmengyu.hiraganatest;

import android.content.res.Resources;
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

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import android.util.Log;
import java.util.ArrayList;

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

    //Get the data stored in the strings.xml

    Resources res;
    String[] characters;
    String[] sound;

    ArrayList charlist;
    ArrayList soundList;


    int ran;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_1);

        JapaneseChar = (TextView)findViewById(R.id.Japanesecharr);

        res = getResources();
        characters = res.getStringArray(R.array.hiraganaChar);
        sound = res.getStringArray(R.array.hiraganaSound);

        // convert array to arraylist
        charlist = new ArrayList(Arrays.asList(characters));
        soundList = new ArrayList(Arrays.asList(sound));



        //achieving key,value pairs from the hashtable
        start = (Button)findViewById(R.id.startbtn);
        startbtn();




        //JapaneseChar.setText((characters[1].toString()));

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

                        if(soundList.get(ran).toString().equals(txt)) {

                            Toast.makeText(SecondActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                            charlist.remove(ran);


                            JapaneseChar.setText("Try more?");
                            startbtn();

                        } else {
                            Toast.makeText(SecondActivity.this, "Woops! Try again\n", Toast.LENGTH_LONG).show();
                        }

                       // iterator = ht.entrySet().iterator();


                       /* while (iterator.hasNext()) {
                            entry = (Map.Entry)iterator.next();
                            if(entry.getValue().equals(vl)) {

                                key = entry.getKey().toString();

                            }

                        }*/

                       /*if (ht.get(txt) != null && (ht.get(txt)).toString().equals(vl)) {


                       /* if (txt.equals(key)) {
                            Toast.makeText(SecondActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                            counter++;

                           // per = 100;
                            ht.remove(txt);
                            JapaneseChar.setText("Try more?");
                            startbtn();


                        } else {
                            Toast.makeText(SecondActivity.this, "Woops! Try again\n", Toast.LENGTH_LONG).show();
                        }*/



                    }
                }


        );


    }

    public void setTextview() {

        if (charlist.size() > 0) {
            //for (int i = 0; i < charlist.size(); i++) {

            //random selected from the list
            Random rand = new Random();
            int i = rand.nextInt(charlist.size());

                JapaneseChar.setText(charlist.get(i).toString());
                ran = i;
            //}
        } else {

            JapaneseChar.setText("Good job! Click NEXT to see your score!");

        }

       /* if (ht.size() > 0) {

            for (Object value : ht.values()) {
                vl = value.toString();
                JapaneseChar.setText(value.toString());

            }
        } else {
            JapaneseChar.setText("Good job! Click NEXT to see your score!");

        }
        */
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
