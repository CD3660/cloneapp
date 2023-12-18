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

public class AllMenuAdapter1 extends RecyclerView.Adapter<AllMenuAdapter1.ViewHolder> {


    LayoutInflater inflater;

    ArrayList<ArrayList<String>> list;
    ArrayList<String> titleList;

    Context context;

    public AllMenuAdapter1(LayoutInflater inflater, ArrayList<ArrayList<String>> list, ArrayList<String> titleList, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.titleList = titleList;
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
        h.binding.menuRecv1Title.setText(titleList.get(i));

        h.binding.menuRecv1List.setAdapter(new AllMenuAdapter2(inflater, list.get(i), context));
        h.binding.menuRecv1List.setLayoutManager(new LinearLayoutManager(context));
        if(i == (list.size()-1)){
            h.binding.menuRecv1View.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemMenuRecv1Binding binding;
        public ViewHolder(@NonNull ItemMenuRecv1Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


}