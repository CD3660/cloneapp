package com.example.sinhansol.moneyverse;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.R;
import com.example.sinhansol.databinding.FragmentOneEyeBinding;

public class OneEyeFragment extends Fragment {
    FragmentOneEyeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOneEyeBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}