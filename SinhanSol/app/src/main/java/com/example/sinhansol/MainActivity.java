package com.example.sinhansol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.allmenu.AllMenuFragment;
import com.example.sinhansol.databinding.ActivityMainBinding;
import com.example.sinhansol.home.HomeFragment;
import com.example.sinhansol.moneyverse.MoneyverseFragment;
import com.example.sinhansol.moneyverse.SpendFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        changeFragment(new HomeFragment());
        binding.switchEasy.setVisibility(View.VISIBLE);
        binding.topNav.getMenu().getItem(0).setVisible(false);
        binding.topNav.getLayoutParams().width = 300;
        binding.btmNav.setOnItemSelectedListener(item -> {
            if(item.getItemId() == binding.btmNav.getMenu().getItem(0).getItemId()){
                changeFragment(new HomeFragment());
                binding.switchEasy.setVisibility(View.VISIBLE);
                binding.topNav.getMenu().getItem(0).setVisible(false);
                binding.topNav.getLayoutParams().width = 300;
            } else if(item.getItemId() == binding.btmNav.getMenu().getItem(1).getItemId()){
                changeFragment(new MoneyverseFragment());
                binding.switchEasy.setVisibility(View.INVISIBLE);
                binding.topNav.getMenu().getItem(0).setVisible(true);
                binding.topNav.getLayoutParams().width = 400;
            } else if(item.getItemId() == binding.btmNav.getMenu().getItem(2).getItemId()){
                changeFragment(new ProductFragment());
                binding.switchEasy.setVisibility(View.INVISIBLE);
                binding.topNav.getMenu().getItem(0).setVisible(false);
                binding.topNav.getLayoutParams().width = 300;
            } else if(item.getItemId() == binding.btmNav.getMenu().getItem(3).getItemId()){
//                changeFragment(new MoneyverseFragment());
                binding.switchEasy.setVisibility(View.INVISIBLE);
                binding.topNav.getMenu().getItem(0).setVisible(false);
                binding.topNav.getLayoutParams().width = 300;
            } else if(item.getItemId() == binding.btmNav.getMenu().getItem(4).getItemId()){
                changeFragment(new AllMenuFragment());
                binding.switchEasy.setVisibility(View.INVISIBLE);
                binding.topNav.getMenu().getItem(0).setVisible(false);
                binding.topNav.getLayoutParams().width = 300;
            }

            return true;
        });
    }
    public void changeFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }
}