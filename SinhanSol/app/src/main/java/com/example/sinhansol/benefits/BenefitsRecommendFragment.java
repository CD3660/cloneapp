package com.example.sinhansol.benefits;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.R;
import com.example.sinhansol.databinding.FragmentBenefitsRecommendBinding;

import java.util.ArrayList;


public class BenefitsRecommendFragment extends Fragment {

    private Handler slideHandler = new Handler();

    FragmentBenefitsRecommendBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentBenefitsRecommendBinding.inflate(inflater, container, false);

       binding.pager2Benefits.setAdapter(new );


        return inflater.inflate(R.layout.fragment_benefits_recommend_, container, false);
    }











    ArrayList<ArrayList<String>> RecommendGetList() {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.get(0).add("연말 전시");
        list.get(0).add("<이경준 사진전>");
        list.get(0).add("초대 이벤트");

        list.add(new ArrayList<>());
        list.get(1).add("신한 슈퍼SOL");
        list.get(1).add("사전예약하면");
        list.get(1).add("100만 포인트의 기회가");

        list.add(new ArrayList<String>());
        list.get(2).add("가입 시 100% 경품");
        list.get(2).add("SOL SOL한");
        list.get(2).add("신탁 이벤트");

        list.add(new ArrayList<String>());
        list.get(3).add("나는 쏠로 연말정산");
        list.get(3).add("연말정산 미리보고");
        list.get(3).add("선물 받기");

        list.add(new ArrayList<String>());
        list.get(4).add("아이행복바우처로");
        list.get(4).add("주택청약/적금");
        list.get(4).add("무료 가입 하자!");


        return list;
    }
}