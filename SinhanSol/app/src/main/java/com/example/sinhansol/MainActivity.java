package com.example.sinhansol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.sinhansol.databinding.ActivityMainBinding;
import com.example.sinhansol.moneyverse.MoneyverseFragment;
import com.example.sinhansol.moneyverse.SpendFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        changeFragment(new SpendFragment());
        binding.btmNav.setOnItemSelectedListener(item -> {
            if(item.getItemId() == binding.btmNav.getMenu().getItem(0).getItemId()){
                changeFragment(new SpendFragment());
            } else if(item.getItemId() == binding.btmNav.getMenu().getItem(1).getItemId()){
                changeFragment(new MoneyverseFragment());
            } else if(item.getItemId() == binding.btmNav.getMenu().getItem(2).getItemId()){
                changeFragment(new ProductFragment());
            } else if(item.getItemId() == binding.btmNav.getMenu().getItem(3).getItemId()){
//                changeFragment(new MoneyverseFragment());
            } else if(item.getItemId() == binding.btmNav.getMenu().getItem(4).getItemId()){
                changeFragment(new AllMenuFragment());
            }

            return true;
        });
    }
    public void changeFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }
}