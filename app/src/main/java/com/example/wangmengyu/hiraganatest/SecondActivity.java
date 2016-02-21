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

public class SecondActivity extends AppCompatActivity {

    TextView JapaneseChar;
    EditText inputf;
    String txt;

    Button submit;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_1);

        JapaneseChar = (TextView)findViewById(R.id.Japanesecharr);

        //achieving key,value pairs from the hashtable

        TestHashTable hashTable = new TestHashTable();
        Hashtable ht = hashTable.TestHashTable();
        for (Object value : ht.values()) {
            JapaneseChar.setText(value.toString());

        }

        //JapaneseChar.setText("あ");

        inputf = (EditText)findViewById(R.id.editText);


        submit = (Button)findViewById(R.id.submitbtn);
        submitbtn();







    }

    public void submitbtn() {

        submit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        txt = inputf.getText().toString();


                        if (txt.equals("a")) {
                            Toast.makeText(SecondActivity.this, "Correct!", Toast.LENGTH_LONG).show();

                        } else {
                            Toast.makeText(SecondActivity.this, "Woops! Try again\n", Toast.LENGTH_LONG).show();
                        }


                    }
                }


        );


    }

}
