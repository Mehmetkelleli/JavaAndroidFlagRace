package com.example.odev2;
import android.icu.lang.UProperty;

import java.util.ArrayList;
import java.util.List;

import kotlin.reflect.KProperty;

public class FakeData {
    List<Question> GetData(){
        List<Question> Questions = new ArrayList<Question>();
        Question question1 = new Question();
                question1.name="Türkiye";
                question1.centrelCity="Ankara";
                question1.FaceCount="1000";
                question1.Kita="Avrupa";
                question1.Money="Tl";
                question1.Language="Türkçe";
                question1.flagImage=String.valueOf(R.drawable.bayrak);
                question1.ConumImage = String.valueOf(R.drawable.bayrak);

        Question question2 = new Question();
        question2.name="Almanya";
        question2.centrelCity="Berlin";
        question2.FaceCount="1500";
        question2.Kita="Avrupa";
        question2.Money="Euro";
        question2.Language="Almanca";
        question2.flagImage=String.valueOf(R.drawable.almanya);
        question2.ConumImage = String.valueOf(R.drawable.almanya);

        Questions.add(question1);
        Questions.add(question2);
        return Questions;
    };

}
class Question{
    public String name;
    public String centrelCity;
    public String flagImage;
    public String ConumImage;
    public String FaceCount;
    public String Money;
    public String Language;
    public String Kita;
}
