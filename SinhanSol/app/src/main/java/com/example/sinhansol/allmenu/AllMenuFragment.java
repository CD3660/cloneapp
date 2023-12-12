package com.example.sinhansol.allmenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.R;
import com.example.sinhansol.databinding.FragmentAllMenuBinding;


public class AllMenuFragment extends Fragment {

    FragmentAllMenuBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAllMenuBinding.inflate(inflater, container, false);

        binding.menu_recv.setAdapter










        return binding.getRoot();
    }
}