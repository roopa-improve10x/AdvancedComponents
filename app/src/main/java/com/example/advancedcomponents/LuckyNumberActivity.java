package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class LuckyNumberActivity extends AppCompatActivity {

    public ArrayList<Integer> luckyNumbersList = new ArrayList<>();
    public Spinner luckyNumberSp;
    public ArrayAdapter<Integer> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_number);
        setUpData();
        setUpLuckyNumberSp();
      }

      public void setUpData() {
        luckyNumbersList = new ArrayList<>();
        luckyNumbersList.add(1);
        luckyNumbersList.add(2);
        luckyNumbersList.add(3);
        luckyNumbersList.add(4);
        luckyNumbersList.add(5);
        luckyNumbersList.add(6);
        luckyNumbersList.add(7);
        luckyNumbersList.add(8);
        luckyNumbersList.add(9);
        luckyNumbersList.add(10);
      }
    public void setUpLuckyNumberSp(){
        luckyNumberSp = findViewById(R.id.lucky_number_sp);
        arrayAdapter = new ArrayAdapter<Integer>(this, R.layout.dropdown_item, luckyNumbersList);
        luckyNumberSp.setAdapter(arrayAdapter);
        }
}