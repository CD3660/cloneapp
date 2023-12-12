package com.example.sinhansol.transfer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.R;
import com.example.sinhansol.databinding.FragmentTransferPhoneBookBinding;


public class TransferPhoneBookFragment extends Fragment {
    FragmentTransferPhoneBookBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTransferPhoneBookBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}