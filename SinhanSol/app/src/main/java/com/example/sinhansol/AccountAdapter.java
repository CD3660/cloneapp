package com.example.sinhansol;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.databinding.ItemRecvAccountBinding;
import com.example.sinhansol.transactionhistory.TransactionHistoryActivity;
import com.example.sinhansol.transfer.TransferToActivity;

import java.util.ArrayList;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.AccountViewHolder> {
    LayoutInflater inflater;
    Context context;

    public AccountAdapter(LayoutInflater inflater, Context context) {
        this.inflater = inflater;
        this.context = context;
    }

    @NonNull
    @Override
    public AccountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvAccountBinding binding = ItemRecvAccountBinding.inflate(inflater, parent, false);
        return new AccountViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountViewHolder h, int i) {
        h.binding.history.setOnClickListener(v -> {
            Intent intent = new Intent(context, TransactionHistoryActivity.class);
            intent.putExtra("account_num", h.binding.accountNum.getText().toString());
            context.startActivity(intent);
        });
        h.binding.transfer.setOnClickListener(v -> {
            Intent intent = new Intent(context, TransferToActivity.class);
            
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class AccountViewHolder extends RecyclerView.ViewHolder {
        ItemRecvAccountBinding binding;
        public AccountViewHolder(@NonNull ItemRecvAccountBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
