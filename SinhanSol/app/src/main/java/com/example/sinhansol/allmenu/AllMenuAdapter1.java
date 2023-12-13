package com.example.sinhansol.allmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.databinding.ItemMenuRecv1Binding;

import java.util.ArrayList;

public class AllMenuAdapter1 extends RecyclerView.Adapter<AllMenuAdapter1.ViewHolder>{



    LayoutInflater inflater;

    ArrayList<String> list;

    Context context;

    public AllMenuAdapter1(LayoutInflater inflater, ArrayList<String> list, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMenuRecv1Binding binding = ItemMenuRecv1Binding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.menuRecv1Title.setText(list.get(i));



        AllMenuAdapter2 apt2 = new AllMenuAdapter2();
        h.binding.menuRecv1List.setAdapter(apt2);
        h.binding.menuRecv1List.setLayoutManager(new LinearLayoutManager(context));







    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemMenuRecv1Binding binding;

        public ViewHolder(@NonNull ItemMenuRecv1Binding binding) {
            super(binding.getRoot());
            this.binding = binding;        }
    }
}
