package com.example.fitnessandfood.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitnessandfood.R;

public class TakeDietAdapter extends RecyclerView.Adapter<TakeDietAdapter.MyViewHolder> {

    private String [] Diet_name;
    private Context context;
    private Select select;

    public interface Select{
        void Click(int position);
    }

    public TakeDietAdapter(String[] diet_name, Context context, Select select) {
        Diet_name = diet_name;
        this.context = context;
        this.select = select;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_diet_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.DietName.setText(Diet_name[position]);
    }

    @Override
    public int getItemCount() {
        return Diet_name.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView DietName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
           DietName = itemView.findViewById(R.id.diet_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    select.Click(getLayoutPosition());
                }
            });
        }
    }
}
