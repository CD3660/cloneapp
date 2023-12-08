package com.example.sinhansol.moneyverse;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.databinding.FragmentMoneyverseBinding;

public class MoneyverseFragment extends Fragment {
    FragmentMoneyverseBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMoneyverseBinding.inflate(inflater, container, false);


        return binding.getRoot();
    }
}