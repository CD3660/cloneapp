package com.example.sinhansol.allmenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.R;
import com.example.sinhansol.databinding.FragmentAllMenuBinding;

import java.util.ArrayList;


public class AllMenuFragment extends Fragment {
    FragmentAllMenuBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAllMenuBinding.inflate(inflater, container, false);

        binding.menuRecv.setAdapter(new AllMenuAdapter1(inflater, getData1(), getContext()));
        binding.menuRecv.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot();
    }

    public ArrayList<String> getData1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("자주쓰는 메뉴");
        list.add("조회/관리");
        list.add("이체");
        list.add("공과금");
        list.add("상품가입");
        list.add("상품관리");
        list.add("외환");
        list.add("혜택");
        list.add("생활편의");
        list.add("모바일창구");
        list.add("특화라운지");
        list.add("참여마당");
        list.add("머니버스");
        list.add("자산");
        list.add("소비");
        list.add("신한플러스");
        list.add("고객센터");
        list.add("설정/인증");

        return list;

    }
}
