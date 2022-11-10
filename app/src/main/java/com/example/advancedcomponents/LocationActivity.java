package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class LocationActivity extends AppCompatActivity {

    public Spinner locationSp;
    public ArrayAdapter<String> arrayAdapter;
    public ArrayList<String> statesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        getSupportActionBar().setTitle("Location");
        setUpData();
        setUpLocationSp();
        }

        public void setUpData(){
        statesList = new ArrayList<>();
        statesList.add("Andhra Pradesh");
        statesList.add("Arunachal Pradesh");
        statesList.add("Assam");
        statesList.add("Bihar");
        statesList.add("Chhattisgarh");
        statesList.add("Goa");
        statesList.add("Gujarat");
        statesList.add("Haryana");
        statesList.add("Himachal Pradesh");
        statesList.add("Jammu & Kashmir");
        statesList.add("Jharkhand");
        statesList.add("Karnataka");
        statesList.add("Kerala");
        statesList.add("Madhya Pradesh");
        statesList.add("Maharashtra");
        statesList.add("Manipur");
        statesList.add("Meghalaya");
        statesList.add("Mizoram");
        statesList.add("Nagaland");
        statesList.add("Odisha");
        statesList.add("Punjab");
        statesList.add("Rajasthan");
        statesList.add("Sikkim");
        statesList.add("Tamil Nadu");
        statesList.add("Telangana");
        statesList.add("Tripura");
        statesList.add("Uttar Pradesh");
        statesList.add("Uttarakhand");
        statesList.add("West Bengal");
        }

        public void setUpLocationSp(){
            locationSp = findViewById(R.id.spinner_sp);
            arrayAdapter = new ArrayAdapter<String>(
                    this, R.layout.uppercase, statesList);
            locationSp.setAdapter(arrayAdapter);
        }
}