package com.example.sinhansol.allmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.databinding.ItemMenuRecv1Binding;
import com.google.android.material.chip.Chip;

import java.util.ArrayList;

public class AllMenuAdapter1 extends RecyclerView.Adapter<AllMenuAdapter1.ViewHolder> {


    LayoutInflater inflater;

    ArrayList<ArrayList<String>> list;
    ArrayList<String> titleList;

    Context context;
    AllMenuFragment fragment;

    public AllMenuAdapter1(LayoutInflater inflater, ArrayList<ArrayList<String>> list, ArrayList<String> titleList, Context context, AllMenuFragment fragment) {
        this.inflater = inflater;
        this.list = list;
        this.titleList = titleList;
        this.context = context;
        this.fragment = fragment;
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
        Chip chip = fragment.binding.menuChip1;
        switch (i){
            case 0:
                chip = fragment.binding.menuChip1;
                break;
            case 1:
                chip = fragment.binding.menuChip2;
                break;
            case 2:
                chip = fragment.binding.menuChip3;
                break;
            case 3:
                chip = fragment.binding.menuChip4;
                break;
            case 4:
                chip = fragment.binding.menuChip5;
                break;
            case 5:
                chip = fragment.binding.menuChip6;
                break;
            case 6:
                chip = fragment.binding.menuChip7;
                break;
            case 7:
                chip = fragment.binding.menuChip8;
                break;
            case 8:
                chip = fragment.binding.menuChip9;
                break;
            case 9:
                chip = fragment.binding.menuChip10;
                break;
            case 10:
                chip = fragment.binding.menuChip11;
                break;
            case 11:
                chip = fragment.binding.menuChip12;
                break;
            case 12:
                chip = fragment.binding.menuChip13;
                break;
            case 13:
                chip = fragment.binding.menuChip14;
                break;
            case 14:
                chip = fragment.binding.menuChip15;
                break;
        }
        chip.setOnCheckedChangeListener((buttonView, isChecked) -> {
            fragment.binding.scrollView.scrollTo(0,buttonView.getScrollY());
        });
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