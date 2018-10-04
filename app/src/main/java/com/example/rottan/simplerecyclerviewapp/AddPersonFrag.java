package com.example.rottan.simplerecyclerviewapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddPersonFrag extends Fragment {


    public AddPersonFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("AddPersonFrag","OnCreate");
        return inflater.inflate(R.layout.fragment_add_person, container, false);
    }

}
