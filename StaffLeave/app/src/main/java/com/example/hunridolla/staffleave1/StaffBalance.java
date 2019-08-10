package com.example.hunridolla.staffleave1;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class StaffBalance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_balance);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Staff Balance");

        String[] staffs = { "Soy Hunridollar", "Sen Chhutra", "Kim ChanSopheavy"};
        Spinner sp_staffs = findViewById(R.id.sp_staffs);
        ArrayAdapter<String> adp_sp_staff = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, staffs);
        adp_sp_staff.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_staffs.setAdapter(adp_sp_staff);

        String[] years = { "2020", "2019", "2018"};
        Spinner sp_years = findViewById(R.id.sp_years);
        ArrayAdapter<String> adp_sp_year= new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, years);
        adp_sp_year.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_years.setAdapter(adp_sp_year);
    }
}
