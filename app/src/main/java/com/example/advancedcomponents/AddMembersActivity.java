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

public class AddMembersActivity extends AppCompatActivity {

    public ArrayList<String> teams;
    public ArrayList<String> members;
    public ArrayList<String> teamA;
    public ArrayList<String> teamB;
    public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_members);
        getSupportActionBar().setTitle("Add Members");
        addTeamList();
        addAllMembersList();
        addpTeamAList();
        addTeamBList();
        setUpTeam();
        setUpAllMembers();
        setUpTeamA();
        setUpTeamB();
    }

    public void addTeamList() {
        teams = new ArrayList<>();
        teams.add("Team A");
        teams.add("Team B");
    }

    public void addAllMembersList() {
        members = new ArrayList<>();
        members.add("viswanath");
        members.add("Renuka");
    }

    public void addpTeamAList() {
        teamA = new ArrayList<>();
        teamA.add("Viswanath");
        teamA.add("Renuka");
    }

    public void addTeamBList() {
        teamB = new ArrayList<>();
        teamB.add("viswanath");
        teamB.add("Renuka");
    }

    public void setUpTeam() {
        Spinner selectTeamSp = findViewById(R.id.select_team_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, teams);
        selectTeamSp.setAdapter(arrayAdapter);
        selectTeamSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(AddMembersActivity.this,
                        "Team: " + teams.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

        public void setUpAllMembers() {
            Spinner allMembersSp = findViewById(R.id.all_members_sp);
            ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(
                    this, android.R.layout.simple_list_item_1, members);
            allMembersSp.setAdapter(arrayAdapter1);
            allMembersSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                    Toast.makeText(AddMembersActivity.this,
                            "Member :" + members.get(position), Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }

        public void setUpTeamA(){
        Spinner teamASp = findViewById(R.id.team_a_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, teamA);
        teamASp.setAdapter(arrayAdapter);
        teamASp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(AddMembersActivity.this,
                        "Team A : "+ teamA.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        }

        public void setUpTeamB() {
            Spinner teamBSp = findViewById(R.id.team_b_sp);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                    this, android.R.layout.simple_list_item_1, teamA);
            teamBSp.setAdapter(arrayAdapter);
            teamBSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                    Toast.makeText(AddMembersActivity.this,
                            "Team B : "+ teamB.get(position), Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        }

}
