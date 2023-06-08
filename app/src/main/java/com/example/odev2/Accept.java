package com.example.odev2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.DataOutputStream;
import java.io.IOException;

public class Accept extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accept);

        Button basla = (Button) findViewById(R.id.Devam);
        Button kapat = (Button) findViewById(R.id.kapat);

        basla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), questionPage.class));
            }
        });
        kapat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pid = android.os.Process.myPid();
                android.os.Process.killProcess(pid);
                System.exit(1);
            }
        });
    }


}