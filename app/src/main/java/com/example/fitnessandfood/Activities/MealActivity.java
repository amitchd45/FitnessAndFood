package com.example.fitnessandfood.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.fitnessandfood.Adapters.MealDaysAdapter;
import com.example.fitnessandfood.R;

public class MealActivity extends AppCompatActivity {
    private RecyclerView recyclerViewMeal;
    private MealDaysAdapter mealDaysAdapter;
    private Activity activity =MealActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal);

        String [] Days_name ={"Day 1","Day 2","Day 3","Day 4","Day5",
                        "Day 6","Day 7","Day 8","Day 9","Day 10",
                        "Day 11","Day 12","Day 13","Day 14","Day 15",
                        "Day 16","Day 17","Day 18","Day 19","Day 20",
                        "Day 21","Day 22","Day 23","Day 24","Day 25",
                        "Day 26","Day 27","Day 28","Day 29","Day 30",
        };

        recyclerViewMeal = findViewById(R.id.recycler_meal);
        mealDaysAdapter = new MealDaysAdapter(Days_name, MealActivity.this, new MealDaysAdapter.Select() {
            @Override
            public void Click(int position) {

                startActivity(new Intent(activity,DayWiseDietActivity.class));

            }
        });

        recyclerViewMeal.setAdapter(mealDaysAdapter);
        mealDaysAdapter.notifyDataSetChanged();
    }
}
