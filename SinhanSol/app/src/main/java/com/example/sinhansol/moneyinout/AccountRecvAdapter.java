package com.example.sinhansol.moneyinout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.databinding.ItemRecvAccountCheckBinding;

public class AccountRecvAdapter extends RecyclerView.Adapter<AccountRecvAdapter.AccountViewHolder> {

    @NonNull
    @Override
    public AccountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvAccountCheckBinding binding = ItemRecvAccountCheckBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false);
        return new AccountViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class AccountViewHolder extends RecyclerView.ViewHolder {
        ItemRecvAccountCheckBinding binding;
        public AccountViewHolder(@NonNull ItemRecvAccountCheckBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }
}
