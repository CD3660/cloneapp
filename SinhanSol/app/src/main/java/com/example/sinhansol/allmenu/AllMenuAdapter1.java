package com.example.sinhansol.allmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.databinding.ItemMenuRecv1Binding;

import java.util.ArrayList;

public class AllMenuAdapter1 extends RecyclerView.Adapter<AllMenuAdapter1.ViewHolder> {


    LayoutInflater inflater;

    ArrayList<String> list;

    Context context;

    public AllMenuAdapter1(LayoutInflater inflater, ArrayList<String> list, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMenuRecv1Binding binding = ItemMenuRecv1Binding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.menuRecv1Title.setText(list.get(i));


        h.binding.menuRecv1List.setAdapter(new AllMenuAdapter2(inflater, , context));
        h.binding.menuRecv1List.setLayoutManager(new LinearLayoutManager(context));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemMenuRecv1Binding binding;

        public ViewHolder(@NonNull ItemMenuRecv1Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }










        public ArrayList<String> getListData1() {
            ArrayList<String> list = new ArrayList<>();
            list.add("자동이체");
            list.add("설정/인증");
            list.add("전화상담");
            list.add("보안게시판");
            list.add("참여마당");
            list.add("칭찬/불만/제안 아이디어");

            return list;

        }

        public ArrayList<String> getListData2() {
            ArrayList<String> list = new ArrayList<>();
            list.add("전체계좌 조회");
            list.add("입출금 거래내역");
            list.add("계좌 비밀번호 설정");
            list.add("계좌 통합관리");
            list.add("휴먼예금 및 숨은 보험금 찾기");

            return list;
        }


        public ArrayList<String> getListData3() {
            ArrayList<String> list = new ArrayList<>();
            list.add("계좌이체");
            list.add("다건이체");
            list.add("이체결과 조회");
            list.add("자동이체");
            list.add("간편앱출금");
            list.add("이체관리");
            list.add("계좌이동 서비스");
            list.add("MY급여이체");

            return list;
        }




    public ArrayList<String> getListData4() {
        ArrayList<String> list = new ArrayList<>();
        list.add("납부하기");
        list.add("자동납부");
        list.add("납부내역 조회");
        list.add("공공기관 채권");
        list.add("법원업무");
        list.add("대학등록금");

        return list;
    }




    public ArrayList<String> getListData5() {
        ArrayList<String> list = new ArrayList<>();
        list.add("상품");


        return list;
    }



    public ArrayList<String> getListData6() {
        ArrayList<String> list = new ArrayList<>();
        list.add("입출금");
        list.add("예적금/청약");
        list.add("외화예적금");
        list.add("대출");
        list.add("퇴직연금");
        list.add("펀드");
        list.add("신탁");
        list.add("개인종합자산관리(ISA)");
        list.add("포트폴리오");
        list.add("골드/실버");
        list.add("카드");
        list.add("보험");

        return list;
    }




    public ArrayList<String> getListData7() {
        ArrayList<String> list = new ArrayList<>();
        list.add("환율");
        list.add("환전");
        list.add("국내 외화이체");
        list.add("해외송금");
        list.add("글로벌 멀티카드 충전/환불");
        list.add("체인지업 체크카드 신청");
        list.add("거래외국환은행 지정");
        list.add("원격거래 서비스(해외고객전용)");
        list.add("외국환거래약정 동의");

        return list;
    }



    public ArrayList<String> getListData8() {
        ArrayList<String> list = new ArrayList<>();
        list.add("이벤트");
        list.add("내쿠폰함");
        list.add("급여클럽");
        list.add("쏠야구");
        list.add("쏠쏠한 공모주");
        list.add("헤이영놀이터");
        list.add("운세");
        list.add("우리동네 구경하기");
        list.add("정부보조금 찾기");

        return list;
    }




    public ArrayList<String> getListData9() {
        ArrayList<String> list = new ArrayList<>();
        list.add("땡겨요");
        list.add("쏠지갑");
        list.add("쏠 생활정보");
        list.add("쏠/제로페이");
        list.add("신한Meme(밈)");
        list.add("스토리뱅크");
        list.add("컵 반환");
        list.add("MYCAR ZONE");
        list.add("해외골프 예약");
        list.add("실손보험 청구");
        list.add("기부하기");
        list.add("증여풀이(FREE)서비스");
        list.add("MY링크");

        return list;
    }




    public ArrayList<String> getListData10() {
        ArrayList<String> list = new ArrayList<>();
        list.add("화상상담서비스");
        list.add("모바일번호표");
        list.add("서식작성");
        list.add("영업점 상담예약");


        return list;
    }




    public ArrayList<String> getListData11() {
        ArrayList<String> list = new ArrayList<>();
        list.add("소호메이트(개인사업자)");
        list.add("SOL PB");
        list.add("프리미어");
        list.add("리틀 신한 케어");
        list.add("디딤씨앗 정보조회");
        list.add("연금라운지");

        return list;
    }



    public ArrayList<String> getListData12() {
        ArrayList<String> list = new ArrayList<>();
        list.add("참여마당");
        list.add("쏠 사용팁");


        return list;
    }



    public ArrayList<String> getListData13() {
        ArrayList<String> list = new ArrayList<>();
        list.add("한 눈에");
        list.add("머니버스 알림");
        list.add("캘린더");
        list.add("자산연결");
        list.add("연결관리");
        list.add("서비스 해지");

        return list;
    }



    public ArrayList<String> getListData14() {
        ArrayList<String> list = new ArrayList<>();
        list.add("금융상품비교");
        list.add("자산현황");
        list.add("투자지표");
        list.add("트렌드 테마 PICK");
        list.add("절세");
        list.add("목표관리");
        list.add("신용관리");

        return list;
    }




    public ArrayList<String> getListData15() {
        ArrayList<String> list = new ArrayList<>();
        list.add("소비현황");
        list.add("가계부");
        list.add("예산관리");


        return list;
    }


    public ArrayList<String> getListData16() {
        ArrayList<String> list = new ArrayList<>();
        list.add("신한플러스");
        list.add("나의 멤버쉽 현황");
        list.add("신한플러스 스탬프쿠폰");
        list.add("신한카드 타사 포인트전환");
        list.add("신한투자증권 투자정보");
        list.add("신한투자증권 국내주식");
        list.add("신한라이프 디지털보험");
        list.add("신한라이프 보험계약조회");

        return list;
    }



    public ArrayList<String> getListData17() {
        ArrayList<String> list = new ArrayList<>();
        list.add("새소식");
        list.add("이용안내");
        list.add("영업점 안내");
        list.add("전화상담");
        list.add("고객지원");
        list.add("상생금융");
        list.add("금융소비자보호");
        list.add("내정보");
        list.add("지켜요");

        return list;
    }



    public ArrayList<String> getListData18() {
        ArrayList<String> list = new ArrayList<>();
        list.add("설정/인증");


        return list;
    }

}