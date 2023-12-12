package com.example.sinhansol.transactionhistory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.sinhansol.R;
import com.example.sinhansol.databinding.ActivityTransactionHistoryBinding;

import java.util.ArrayList;

public class TransactionHistoryActivity extends AppCompatActivity {
    ActivityTransactionHistoryBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTransactionHistoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        HistoryRecvAdapter adapter = new HistoryRecvAdapter(getDate(), this);
        binding.historyRecv.setAdapter(adapter);
        binding.historyRecv.setLayoutManager(new LinearLayoutManager(this));


    }
    public ArrayList<String> getDate(){
        ArrayList<String> list = new ArrayList<>();
        list.add("2023.12.04");
        list.add("2023.12.03");
        list.add("2023.12.01");
        return list;
    }
}