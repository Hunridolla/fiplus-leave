package com.example.hunridolla.staffleave1;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StaffInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_information);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Staff Information");
    }
}
