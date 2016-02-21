package com.example.wangmengyu.hiraganatest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    Button returntomenu;

    TextView s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String score = bundle.getString("score");
        s = (TextView)findViewById(R.id.score);

        s.setText(score);



        returntomenu = (Button)findViewById(R.id.returnbtn);
        setReturntomenu();


    }

    public void setReturntomenu() {

        returntomenu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setClass(ThirdActivity.this, MainActivity.class);
                        ThirdActivity.this.startActivity(intent);


                    }
                }


        );


    }

}
