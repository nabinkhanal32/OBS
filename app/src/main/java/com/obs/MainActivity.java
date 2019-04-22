package com.obs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import adapter.dashboardAdapter;
import model.dashboard;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.RecyclerView);
        List<dashboard> dashboardList = new ArrayList<>();
        dashboardList.add(new dashboard("Book One", "9860050468", R.drawable.book1));
        dashboardList.add(new dashboard("Book TWo", "9860050468", R.drawable.book2));
        dashboardList.add(new dashboard("Book Three", "9860050468", R.drawable.book3));
        dashboardList.add(new dashboard("Book Four", "9860050468", R.drawable.book4));

        dashboardAdapter dashboardAdapter = new dashboardAdapter(this, dashboardList);
        recyclerView.setAdapter(dashboardAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ;

    }
}
