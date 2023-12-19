package com.example.sinhansol.allmenu;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.R;
import com.example.sinhansol.ReadyActivity;
import com.example.sinhansol.databinding.FragmentAllMenuBinding;

import java.util.ArrayList;


public class AllMenuFragment extends Fragment implements View.OnClickListener{
    FragmentAllMenuBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAllMenuBinding.inflate(inflater, container, false);

        binding.menuRecv.setAdapter(new AllMenuAdapter1(inflater, getList(), getData1(), getContext()));
        binding.menuRecv.setLayoutManager(new LinearLayoutManager(getContext()));

        binding.ready1.setOnClickListener(this);
        binding.ready2.setOnClickListener(this);
        binding.ready3.setOnClickListener(this);

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

    public ArrayList<ArrayList<String>> getList(){
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add(getListData1());
        list.add(getListData2());
        list.add(getListData3());
        list.add(getListData4());
        list.add(getListData5());
        list.add(getListData6());
        list.add(getListData7());
        list.add(getListData8());
        list.add(getListData9());
        list.add(getListData10());
        list.add(getListData11());
        list.add(getListData12());
        list.add(getListData13());
        list.add(getListData14());
        list.add(getListData15());
        list.add(getListData16());
        list.add(getListData17());
        list.add(getListData18());
        return list;
    }

    public ArrayList<String> getListData1() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("자동이체");
        subList.add("설정/인증");
        subList.add("전화상담");
        subList.add("보안게시판");
        subList.add("참여마당");
        subList.add("칭찬/불만/제안 아이디어");

        return subList;

    }

    public ArrayList<String> getListData2() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("전체계좌 조회");
        subList.add("입출금 거래내역");
        subList.add("계좌 비밀번호 설정");
        subList.add("계좌 통합관리");
        subList.add("휴먼예금 및 숨은 보험금 찾기");

        return subList;
    }


    public ArrayList<String> getListData3() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("계좌이체");
        subList.add("다건이체");
        subList.add("이체결과 조회");
        subList.add("자동이체");
        subList.add("간편앱출금");
        subList.add("이체관리");
        subList.add("계좌이동 서비스");
        subList.add("MY급여이체");

        return subList;
    }




    public ArrayList<String> getListData4() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("납부하기");
        subList.add("자동납부");
        subList.add("납부내역 조회");
        subList.add("공공기관 채권");
        subList.add("법원업무");
        subList.add("대학등록금");

        return subList;
    }




    public ArrayList<String> getListData5() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("상품");


        return subList;
    }



    public ArrayList<String> getListData6() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("입출금");
        subList.add("예적금/청약");
        subList.add("외화예적금");
        subList.add("대출");
        subList.add("퇴직연금");
        subList.add("펀드");
        subList.add("신탁");
        subList.add("개인종합자산관리(ISA)");
        subList.add("포트폴리오");
        subList.add("골드/실버");
        subList.add("카드");
        subList.add("보험");

        return subList;
    }




    public ArrayList<String> getListData7() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("환율");
        subList.add("환전");
        subList.add("국내 외화이체");
        subList.add("해외송금");
        subList.add("글로벌 멀티카드 충전/환불");
        subList.add("체인지업 체크카드 신청");
        subList.add("거래외국환은행 지정");
        subList.add("원격거래 서비스(해외고객전용)");
        subList.add("외국환거래약정 동의");

        return subList ;
    }



    public ArrayList<String> getListData8() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("이벤트");
        subList.add("내쿠폰함");
        subList.add("급여클럽");
        subList.add("쏠야구");
        subList.add("쏠쏠한 공모주");
        subList.add("헤이영놀이터");
        subList.add("운세");
        subList.add("우리동네 구경하기");
        subList.add("정부보조금 찾기");

        return subList;
    }




    public ArrayList<String> getListData9() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("땡겨요");
        subList.add("쏠지갑");
        subList.add("쏠 생활정보");
        subList.add("쏠/제로페이");
        subList.add("신한Meme(밈)");
        subList.add("스토리뱅크");
        subList.add("컵 반환");
        subList.add("MYCAR ZONE");
        subList.add("해외골프 예약");
        subList.add("실손보험 청구");
        subList.add("기부하기");
        subList.add("증여풀이(FREE)서비스");
        subList.add("MY링크");

        return subList;
    }




    public ArrayList<String> getListData10() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("화상상담서비스");
        subList.add("모바일번호표");
        subList.add("서식작성");
        subList.add("영업점 상담예약");


        return subList;
    }




    public ArrayList<String> getListData11() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("소호메이트(개인사업자)");
        subList.add("SOL PB");
        subList.add("프리미어");
        subList.add("리틀 신한 케어");
        subList.add("디딤씨앗 정보조회");
        subList.add("연금라운지");

        return subList;
    }



    public ArrayList<String> getListData12() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("참여마당");
        subList.add("쏠 사용팁");


        return subList;
    }



    public ArrayList<String> getListData13() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("한 눈에");
        subList.add("머니버스 알림");
        subList.add("캘린더");
        subList.add("자산연결");
        subList.add("연결관리");
        subList.add("서비스 해지");

        return subList;
    }



    public ArrayList<String> getListData14() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("금융상품비교");
        subList.add("자산현황");
        subList.add("투자지표");
        subList.add("트렌드 테마 PICK");
        subList.add("절세");
        subList.add("목표관리");
        subList.add("신용관리");

        return subList;
    }




    public ArrayList<String> getListData15() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("소비현황");
        subList.add("가계부");
        subList.add("예산관리");


        return subList;
    }


    public ArrayList<String> getListData16() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("신한플러스");
        subList.add("나의 멤버쉽 현황");
        subList.add("신한플러스 스탬프쿠폰");
        subList.add("신한카드 타사 포인트전환");
        subList.add("신한투자증권 투자정보");
        subList.add("신한투자증권 국내주식");
        subList.add("신한라이프 디지털보험");
        subList.add("신한라이프 보험계약조회");

        return subList;
    }



    public ArrayList<String> getListData17() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("새소식");
        subList.add("이용안내");
        subList.add("영업점 안내");
        subList.add("전화상담");
        subList.add("고객지원");
        subList.add("상생금융");
        subList.add("금융소비자보호");
        subList.add("내정보");
        subList.add("지켜요");

        return subList;
    }



    public ArrayList<String> getListData18() {
        ArrayList<String> subList = new ArrayList<>();
        subList.add("설정/인증");


        return subList;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), ReadyActivity.class);
        startActivity(intent);
    }
}
