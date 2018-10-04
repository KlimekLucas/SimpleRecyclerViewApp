package com.example.rottan.simplerecyclerviewapp;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PersonAdapter.ItemClicked{

    EditText etName, etPhone;
    TextView tvName, tvPhone;
    Button btnAdd;
    ListFrag listFrag;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","onCreate");

        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);
        tvName = findViewById(R.id.tvName);
        tvPhone = findViewById(R.id.tvPhone);
        btnAdd = findViewById(R.id.btnAdd);

        fragmentManager = this.getSupportFragmentManager();
        listFrag = (ListFrag) fragmentManager.findFragmentById(R.id.ListFrag);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","onClick");
                if (etName.getText().toString().isEmpty() || etPhone.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"please fill all fields",Toast.LENGTH_SHORT).show();
                }else{
                    ApplicationClass.people.add(new Person(etName.getText().toString().trim(),etPhone.getText().toString().trim()));
                    Toast.makeText(MainActivity.this, "Person succesfully Added", Toast.LENGTH_SHORT).show();
                    etName.setText(null);
                    etPhone.setText(null);
                    listFrag.notifyDataChanged();
                }
            }
        });

    }



    @Override
    public void OnItemClicked(int index) {
        Log.d("MainActivity","OnItemClicked");
        tvName.setText(ApplicationClass.people.get(index).getName());
        tvPhone.setText(ApplicationClass.people.get(index).getPhoneNo());
    }
}
