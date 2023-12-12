package com.example.sinhansol.moneyinout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.R;
import com.example.sinhansol.databinding.FragmentAccountShowBinding;

public class AccountShowFragment extends Fragment {
    FragmentAccountShowBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAccountShowBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}