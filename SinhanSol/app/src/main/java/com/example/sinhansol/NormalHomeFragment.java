package com.example.sinhansol;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.databinding.FragmentNormalHomeBinding;


public class NormalHomeFragment extends Fragment {
    FragmentNormalHomeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNormalHomeBinding.inflate(inflater, container, false);
        binding.viewpager2.setAdapter(new AccountAdapter(inflater, getContext()));




        return binding.getRoot();
    }
}