package com.example.sinhansol.benefits;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.R;
import com.example.sinhansol.databinding.FragmentBenefitsLifeBinding;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


public class BenefitsLifeFragment extends Fragment {
    private Handler slideHandler = new Handler();
    FragmentBenefitsLifeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBenefitsLifeBinding.inflate(inflater, container, false);

        binding.pager2.setAdapter(new BenefitsLifeRecvAdapter());
        binding.pager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        binding.pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int i) {
                super.onPageSelected(i);
                binding.pager2PageNow.setText((i%5+1)+"");
            }
        });
        /*binding.pager2.setScroll*/
        binding.pager2.setCurrentItem(1000);

        binding.recv.setAdapter(new LifeRecvAdapter(getContext(), getList()));
        binding.recv.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot();
    }

    public void startAutoScrolling(){

    }

    ArrayList<ArrayList<String>> getList(){
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add(new ArrayList<String>());
        list.get(0).add("#쉽고 편하고 쏠쏠한 결제");
        list.get(0).add("쏠편한 결제");
        list.get(0).add("제로페이 상품권");
        list.get(0).add("서울페이+ 상품권");
        list.get(0).add("쏠지갑");
        list.get(0).add("My링크");
        list.add(new ArrayList<String>());
        list.get(1).add("#재미있게 즐기자!");
        list.get(1).add("한정판 신발 정보");
        list.get(1).add("운세");
        list.get(1).add("쏠퀴즈");
        list.get(1).add("쏠팁스");
        list.add(new ArrayList<String>());
        list.get(2).add("#즐거운 취미 생활 라이프");
        list.get(2).add("해외골프 예약");
        list.get(2).add("자동차 매거진");
        list.get(2).add("스토리뱅크");
        list.get(2).add("내 차 리포트");
        list.get(2).add("쏠야구");
        list.add(new ArrayList<String>());
        list.get(3).add("#아는 것이 힘! 실속 라이프");
        list.get(3).add("쏠 생활정보");
        list.get(3).add("여행자 보험");
        list.get(3).add("정부보조금 찾기");
        list.get(3).add("자동차보험");
        list.get(3).add("쿠폰마켓");
        list.get(3).add("의료비청구");
        list.get(3).add("WM레터");
        list.add(new ArrayList<String>());
        list.get(4).add("#앱테크로 소확행 라이프");
        list.get(4).add("쏠퀴즈");
        list.get(4).add("쏠테크");
        list.get(4).add("급여클럽");
        list.get(4).add("광고보고 포인트받기");
        list.get(4).add("콘텐츠 소액투자");

        return list;
    }
}