package com.example.odev2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class questionPage extends AppCompatActivity {

    public ListView liste;
    public FakeData data = new FakeData();
    public  Question SelectedQuestion;
    public ArrayList<String> secenek1= new ArrayList<>();

    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        secenek1.add("Konum");

        super.onCreate(savedInstanceState);
        Random rand = new Random();
        SelectedQuestion = data.GetData().get(rand.nextInt(data.GetData().size()));

        setContentView(R.layout.activity_question_page);

        liste = (ListView) findViewById(R.id.secenek);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, secenek1);

        liste.setAdapter(adapter);

        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedFromList = (String) liste.getItemAtPosition(i);
                Intent intent_list =new Intent(getApplicationContext(),Description.class);
                if(selectedFromList == "Bayrak"){

                    secenek1.add("Başkent");
                    adapter.notifyDataSetChanged();



                    intent_list.putExtra("Title",selectedFromList);
                    intent_list.putExtra("Answer","");
                    intent_list.putExtra("Image",SelectedQuestion.flagImage);
                }
                if(selectedFromList == "Başkent"){

                    intent_list.putExtra("Title",selectedFromList);
                    intent_list.putExtra("Answer",SelectedQuestion.centrelCity);
                    intent_list.putExtra("Image","0");
                }
                if(selectedFromList == "Konum"){


                    secenek1.add("Yüz Ölçümü");
                    adapter.notifyDataSetChanged();

                    intent_list.putExtra("Title",selectedFromList);
                    intent_list.putExtra("Answer","");
                    intent_list.putExtra("Image",SelectedQuestion.ConumImage);
                }
                if(selectedFromList == "Para Birimi"){
                    secenek1.add("Dil");
                    adapter.notifyDataSetChanged();

                    intent_list.putExtra("Title",selectedFromList);
                    intent_list.putExtra("Answer",SelectedQuestion.Money);
                    intent_list.putExtra("Image","0");
                }
                if(selectedFromList == "Yüz Ölçümü"){

                    secenek1.add("Para Birimi");
                    adapter.notifyDataSetChanged();

                    intent_list.putExtra("Title",selectedFromList);
                    intent_list.putExtra("Answer",SelectedQuestion.FaceCount);
                    intent_list.putExtra("Image","0");
                }
                if(selectedFromList == "Dil"){

                    secenek1.add("Bayrak");
                    adapter.notifyDataSetChanged();

                    intent_list.putExtra("Title",selectedFromList);
                    intent_list.putExtra("Answer",SelectedQuestion.Language);
                    intent_list.putExtra("Image","0");
                }

                System.out.println("Resiiiiiiimmm");
                System.out.println(SelectedQuestion.flagImage);
                startActivity(intent_list);
            }
        });

        Button Answer = (Button) findViewById(R.id.answer);
        Answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_list =new Intent(getApplicationContext(),Answer.class);
                intent_list.putExtra("answer",SelectedQuestion.name);
                startActivity(intent_list);
            }
        });

    }
}