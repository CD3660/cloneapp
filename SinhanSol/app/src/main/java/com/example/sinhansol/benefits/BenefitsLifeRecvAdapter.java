package com.example.sinhansol.benefits;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.databinding.ItemRecvLifeBinding;

public class BenefitsLifeRecvAdapter extends RecyclerView.Adapter<BenefitsLifeRecvAdapter.LifeRecvViewHolder> {

    @NonNull
    @Override
    public LifeRecvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvLifeBinding binding = ItemRecvLifeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new LifeRecvViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull LifeRecvViewHolder h, int i) {

    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    public class LifeRecvViewHolder extends RecyclerView.ViewHolder {
        ItemRecvLifeBinding binding;
        public LifeRecvViewHolder(@NonNull ItemRecvLifeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
