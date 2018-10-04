package com.example.rottan.simplerecyclerviewapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    private ArrayList<Person> people;

    ItemClicked activity;


    public interface ItemClicked
    {
        void OnItemClicked(int index);
    }
    public PersonAdapter (Context context, ArrayList<Person> list){

        people = list; // lista ludzi
        activity = (ItemClicked) context; //Main Activ




        }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Log.d("PersonAdapter","onCreateViewHolder");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Log.d("PersonAdapter","onBindViewHolder");
        viewHolder.itemView.setTag(people.get(i));
        viewHolder.tvName.setText(people.get(i).getName());

    }

    @Override
    public int getItemCount() {
        Log.d("PersonAdapter","getItemCount");
        return people.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            Log.d("PersonAdapter","ViewHolder");
            tvName = itemView.findViewById(R.id.tvName);

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        activity.OnItemClicked(people.indexOf((Person)view.getTag()));
                    }
                });
                }
            }
        }

