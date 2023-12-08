package com.example.sinhansol.moneyverse;

import android.animation.LayoutTransition;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.R;
import com.example.sinhansol.databinding.FragmentSpendBinding;

import java.util.ArrayList;

public class SpendFragment extends Fragment {
    FragmentSpendBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSpendBinding.inflate(inflater, container, false);

        binding.container.setAdapter(new MoneyverseAdapter(inflater, getContext(), initList()));
        binding.container.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot();
    }

    public ArrayList<MoneyverseDTO> initList() {
        ArrayList<MoneyverseDTO> list = new ArrayList<>();
        list.add(new MoneyverseDTO("12월의 소비", "이번달에 얼마나 썼을까?", "흩어진 소비내역 한눈에 모아보세요", "소비내역", 0, 0));
        list.add(new MoneyverseDTO("카드", "내 모든 카드\n결제 예정 금액은?", null, "카드사용내역", R.drawable.ic_launcher_foreground, 0));
        list.add(new MoneyverseDTO("소비 카테고리", "이번 달\n가장 많이 쓴 곳\n궁금하다면", null, "소비 카테고리", R.drawable.ic_launcher_foreground, 0));
        list.add(new MoneyverseDTO("예산관리", "스쳐가는 내 돈\n이제는 아낄 차례", null, "예산설정하기", R.drawable.ic_launcher_foreground, 0));
        list.add(new MoneyverseDTO("소비분석", null, "또래 중 소비금액", "예산설정하기", R.drawable.ic_launcher_foreground, 0));

        return list;
    }
}