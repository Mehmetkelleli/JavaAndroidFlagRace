package com.example.odev2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Description extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Intent intent = getIntent();

        String title = intent.getStringExtra("Title");
        String data = intent.getStringExtra("Answer");

        int image = Integer.parseInt(intent.getStringExtra("Image"));

        if(title != null){
            TextView baslik = (TextView)findViewById(R.id.title);
            baslik.setText(title);
        }
        if(data != null){
            TextView answers = (TextView)findViewById(R.id.answer);
            answers.setText(data);
        }

        ImageView images = (ImageView) findViewById(R.id.imageView);
        images.setImageResource(image);

    }
}