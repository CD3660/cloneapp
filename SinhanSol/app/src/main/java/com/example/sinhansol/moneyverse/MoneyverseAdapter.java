package com.example.sinhansol.moneyverse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.databinding.ItemRecvMeneyverseBinding;

import java.util.ArrayList;

public class MoneyverseAdapter extends RecyclerView.Adapter<MoneyverseAdapter.MoneyverseViewHolder> {
    LayoutInflater inflater;
    Context context;
    ArrayList<MoneyverseDTO> list;

    public MoneyverseAdapter(LayoutInflater inflater, Context context, ArrayList<MoneyverseDTO> list) {
        this.inflater = inflater;
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MoneyverseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvMeneyverseBinding binding = ItemRecvMeneyverseBinding.inflate(inflater, parent, false);
        return new MoneyverseViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MoneyverseViewHolder h, int i) {
        h.binding.tvTitle.setText(list.get(i).getTv_title());
        
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MoneyverseViewHolder extends RecyclerView.ViewHolder {
        ItemRecvMeneyverseBinding binding;
        public MoneyverseViewHolder(@NonNull ItemRecvMeneyverseBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
