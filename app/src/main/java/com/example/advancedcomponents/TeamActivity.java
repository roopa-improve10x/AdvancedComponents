package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class TeamActivity extends AppCompatActivity {

    public Spinner teamSp;
    public ArrayAdapter<String> arrayAdapter;
    public ArrayList<String> names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        getSupportActionBar().setTitle("Team");
        setUpData();
        addData();
        setUpSpinner();
    }

    public void setUpData() {
        names = new ArrayList<>();
        names.add("Viswanath");
        names.add("Renuka");
    }

    public void addData() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText nameTxt = findViewById(R.id.name_txt);
            String name = nameTxt.getText().toString();
            if(name.equals("") == false){
                arrayAdapter.add(name);
                arrayAdapter.notifyDataSetChanged();
            }
            nameTxt.setText("");
        });
    }

    public void setUpSpinner() {
        teamSp = findViewById(R.id.team_sp);
         arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, names);
        teamSp.setAdapter(arrayAdapter);
    }
}