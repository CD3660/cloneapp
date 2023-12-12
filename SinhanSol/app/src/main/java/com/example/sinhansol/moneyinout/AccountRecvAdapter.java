package com.example.sinhansol.moneyinout;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.databinding.ItemRecvAccountCheckBinding;

public class AccountRecvAdapter extends RecyclerView.Adapter<Acc> {
    public class AccountViewHolder extends RecyclerView.ViewHolder {
        ItemRecvAccountCheckBinding binding;
        public AccountViewHolder(@NonNull ItemRecvAccountCheckBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }
}
