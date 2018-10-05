package com.example.rottan.simplerecyclerviewapp;

import android.app.Application;
import android.util.Log;

import java.util.ArrayList;

public class ApplicationClass extends Application {

    public static ArrayList<Person> people;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("ApplicationClass", "OnCreate");
        Log.d("ApplicationClass", "creating list");
        people = new ArrayList<Person>();
        people.add(new Person("jan Kowalski","99999"));
        people.add(new Person("Tadzio Nowak","666999"));
        people.add(new Person("Anna Kowalska","993337"));
        people.add(new Person("Vukko","912398"));
        people.add(new Person("Zaan","99921"));
        people.add(new Person("Mordimer Madderin","99999"));
        people.add(new Person("Krzysztof Tomaszewski","567657"));
        people.add(new Person("Blaifra","234222"));
        people.add(new Person("Zaknafein","345344"));


    }
}
