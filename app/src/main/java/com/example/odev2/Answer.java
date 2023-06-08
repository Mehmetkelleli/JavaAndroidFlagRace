package com.example.odev2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Locale;

public class Answer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        Intent intent = getIntent();

        String title = intent.getStringExtra("answer");

        EditText answer = (EditText) findViewById(R.id.answerInput);

        Button answerButton = (Button) findViewById(R.id.answer);

        answerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView status = (ImageView) findViewById(R.id.imageView2);
                if(answer.getText().toString().trim().toLowerCase().equals(title.trim().toLowerCase())){
                    System.out.println(answer.getText().toString().trim().toLowerCase());
                    System.out.println(title.trim().toLowerCase());
                    status.setImageResource(R.drawable.win);
                    answer.setText("Afferim Bildin");
                }else{
                    System.out.println(answer.getText().toString().trim().toLowerCase());
                    System.out.println(title.trim().toLowerCase());
                    status.setImageResource(R.drawable.lost);
                    answer.setText("Bilemedin");
                }

            }
        });

    }
}