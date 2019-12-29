package com.example.fitnessandfood.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.fitnessandfood.Adapters.TakeDietAdapter;
import com.example.fitnessandfood.R;

public class DayWiseDietActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TakeDietAdapter takeDietAdapter;
    private String [] Diet_name={"BreakFast","Snacks","Lunch"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_wise_diet);

        recyclerView = findViewById(R.id.recycler_food_choice);
        takeDietAdapter = new TakeDietAdapter(Diet_name, this, new TakeDietAdapter.Select() {
            @Override
            public void Click(int position) {
                Toast.makeText(DayWiseDietActivity.this, "ok", Toast.LENGTH_SHORT).show();
            }
        });

        recyclerView.setAdapter(takeDietAdapter);
        takeDietAdapter.notifyDataSetChanged();
    }
}
