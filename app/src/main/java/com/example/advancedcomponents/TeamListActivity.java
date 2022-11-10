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

    public ArrayList<String> memberNames;
    public ListView namesLv;
    public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);
        getSupportActionBar().setTitle("Team List");
        setData();
        handleAddBtn();
        setUpListView();
    }

    public void setData() {
        memberNames = new ArrayList<>();
        memberNames.add("viswanath");
        memberNames.add("Renuka");
    }

    public void handleAddBtn() {
        Button teamListAddBtn = findViewById(R.id.team_list_add_btn);
        teamListAddBtn.setOnClickListener(view -> {
            EditText memberNameTxt = findViewById(R.id.member_name_txt);
            String name = memberNameTxt.getText().toString();
            arrayAdapter.add(name);
            arrayAdapter.notifyDataSetChanged();
            memberNameTxt.setText("");
        });
    }

    public void setUpListView() {
        namesLv = findViewById(R.id.names_lv);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,memberNames);
        namesLv.setAdapter(arrayAdapter);
        namesLv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(TeamListActivity.this, "name : " + memberNames.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}