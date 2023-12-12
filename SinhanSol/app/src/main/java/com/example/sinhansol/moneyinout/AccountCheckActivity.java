package com.example.sinhansol.moneyinout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.sinhansol.R;
import com.example.sinhansol.databinding.ActivityAccountCheckBinding;

public class AccountCheckActivity extends AppCompatActivity {
    ActivityAccountCheckBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAccountCheckBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}