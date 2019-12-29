package com.example.fitnessandfood.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitnessandfood.R;

public class MealDaysAdapter extends RecyclerView.Adapter<MealDaysAdapter.MyViewHolder> {

    private String [] Days_name;
    private Context context;
    private Select select;

    public interface Select{
        void Click(int position);
    }

    public MealDaysAdapter(String[] days_name, Context context, Select select) {
        Days_name = days_name;
        this.context = context;
        this.select = select;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_days_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.DaysName.setText(Days_name[position]);
    }

    @Override
    public int getItemCount() {
        return Days_name.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView DaysName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            DaysName = itemView.findViewById(R.id.tv_days_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    select.Click(getLayoutPosition());
                }
            });
        }
    }
}
