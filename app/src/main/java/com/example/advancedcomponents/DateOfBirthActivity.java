package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class DateOfBirthActivity extends AppCompatActivity {
    public ArrayList<Integer> dates = new ArrayList<>();
    public ArrayList<String> months = new ArrayList<>();
    public ArrayList<Integer> year = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_of_birth);
        getSupportActionBar().setTitle("Date of Birth");
        setUpDateData();
        setUpMonthData();
        setUpYearData();
        setUpDateSp();
        setUpMonthSp();
        setUpYearSp();
    }


    public void setUpDateData() {
        dates = new ArrayList<>();
        dates.add(1);
        dates.add(2);
        dates.add(3);
        dates.add(4);
        dates.add(5);
        dates.add(6);
        dates.add(7);
        dates.add(8);
        dates.add(9);
        dates.add(10);
        dates.add(11);
        dates.add(12);
        dates.add(13);
        dates.add(14);
        dates.add(15);
        dates.add(16);
        dates.add(17);
        dates.add(18);
        dates.add(19);
        dates.add(20);
        dates.add(21);
        dates.add(22);
        dates.add(23);
        dates.add(24);
        dates.add(25);
        dates.add(26);
        dates.add(27);
        dates.add(28);
        dates.add(29);
        dates.add(30);
        dates.add(31);
    }

    public void setUpMonthData() {
        months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
    }

    public void setUpYearData(){
        year = new ArrayList<>();
        year.add(1990);
        year.add(1991);
        year.add(1992);
        year.add(1993);
        year.add(1994);
        year.add(1995);
        year.add(1996);
        year.add(1997);
        year.add(1998);
        year.add(1999);
        year.add(2000);
    }
    public void setUpDateSp(){
        Spinner dateSp = findViewById(R.id.date_sp);
        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, dates);
            dateSp.setAdapter(arrayAdapter);
            dateSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                    Toast.makeText(DateOfBirthActivity.this, "date : "+ dates.get(position), Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }

        public void setUpMonthSp(){
            Spinner monthsSp = findViewById(R.id.month_sp);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                    R.layout.dropdown_upper_case, months);
            monthsSp.setAdapter(arrayAdapter);
            monthsSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                    Toast.makeText(DateOfBirthActivity.this,
                            "month : "+months.get(position), Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }

        public void setUpYearSp(){
            Spinner yearSp = findViewById(R.id.year_sp);
            ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(
                    this, android.R.layout.simple_list_item_1, year);
            yearSp.setAdapter(arrayAdapter);
            yearSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                    Toast.makeText(DateOfBirthActivity.this,
                            "year : "+ year.get(position), Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        }

}