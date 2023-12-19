package com.example.sinhansol.benefits;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.databinding.ItemRecvLifeTagDetailBinding;

import java.util.ArrayList;

public class LifeDetailRecvAdapter extends RecyclerView.Adapter<LifeDetailRecvAdapter.LifeDetailViewHolder> {
    ArrayList<String> list;

    public LifeDetailRecvAdapter(ArrayList<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public LifeDetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvLifeTagDetailBinding binding = ItemRecvLifeTagDetailBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LifeDetailViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull LifeDetailViewHolder h, int i) {
        h.binding.itemTitle.setText(list.get(i+1));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class LifeDetailViewHolder extends RecyclerView.ViewHolder{
        ItemRecvLifeTagDetailBinding binding;
        public LifeDetailViewHolder(@NonNull ItemRecvLifeTagDetailBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
