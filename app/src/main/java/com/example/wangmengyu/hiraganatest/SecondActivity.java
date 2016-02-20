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
        JapaneseChar.setText("あ");

        inputf = (EditText)findViewById(R.id.editText);
        txt = inputf.getText().toString();

        submit = (Button)findViewById(R.id.submitbtn);
        submitbtn();







    }

    public void submitbtn() {

        submit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (txt.equals("a")) {
                            Toast.makeText(SecondActivity.this, "Correct!", Toast.LENGTH_LONG);

                        } else {
                            Toast.makeText(SecondActivity.this, "Woops! Try again\n", Toast.LENGTH_LONG);
                        }


                    }
                }


        );


    }

}
