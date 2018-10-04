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
        people.add(new Person("Pan szatan","666"));
        people.add(new Person("arch michas","997"));
        people.add(new Person("arch rafał","998"));
        people.add(new Person("arch raziel","999"));
        people.add(new Person("abaddon","99999"));


    }
}
