package com.example.fitnessandfood.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fitnessandfood.R;

public class WorkoutDetailsActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mNext;
    private Activity activity = WorkoutDetailsActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_details);

        mNext = findViewById(R.id.btn_next);
        mNext.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_next:
                startActivity(new Intent(activity,MealActivity.class));
            break;
        }
    }
}
