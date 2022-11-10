package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TeamListActivity extends AppCompatActivity {

    public ArrayList<String> memberNamesList;
    public ListView namesLv;
    public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);
        getSupportActionBar().setTitle("Team List");
        setData();
        handleAddBtn();
        handleDeleteBtn();
        setUpListView();
    }

    public void handleDeleteBtn() {
        Button deleteBtn = findViewById(R.id.delete_btn);
        deleteBtn.setOnClickListener(view -> {
            EditText memberNameTxt = findViewById(R.id.member_name_txt);
            String memberName = memberNameTxt.getText().toString();
            if(memberName.equals("") == false){
                arrayAdapter.remove(memberName);
                arrayAdapter.notifyDataSetChanged();
            }
            memberNameTxt.setText("");
        });
    }

    public void setData() {
        memberNamesList = new ArrayList<>();
        memberNamesList.add("viswanath");
        memberNamesList.add("Renuka");
    }

    public void handleAddBtn() {
        Button teamListAddBtn = findViewById(R.id.team_list_add_btn);
        teamListAddBtn.setOnClickListener(view -> {
            EditText memberNameTxt = findViewById(R.id.member_name_txt);
            String name = memberNameTxt.getText().toString();
            if(name.equals("") == false){
                arrayAdapter.add(name);
                arrayAdapter.notifyDataSetChanged();
            }
            memberNameTxt.setText("");
        });
    }

    public void setUpListView() {
        namesLv = findViewById(R.id.names_lv);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,memberNamesList);
        namesLv.setAdapter(arrayAdapter);
        namesLv.setOnItemClickListener((adapterView, view, position, l) -> {
            Toast.makeText(this, "Clicked : " + memberNamesList.get(position), Toast.LENGTH_SHORT).show();
            String memberName = memberNamesList.get(position);
            EditText memberNameTxt = findViewById(R.id.member_name_txt);
            memberNameTxt.setText(memberName);

        });
    }
}