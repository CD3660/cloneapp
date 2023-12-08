package com.example.sinhansol;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

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
        binding.viewpager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        binding.viewpager2.setClipToPadding(false);
        binding.viewpager2.setClipChildren(false);
        binding.viewpager2.setOffscreenPageLimit(1);
        binding.viewpager2.setPadding(50, 0, 50, 0);
        binding.viewpager2.setPageTransformer(new MarginPageTransformer(25));
        binding.viewpager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int i) {
                super.onPageSelected(i);

            }
        });


        return binding.getRoot();
    }
}