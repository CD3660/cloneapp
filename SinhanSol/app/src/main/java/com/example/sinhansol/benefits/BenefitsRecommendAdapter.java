package com.example.sinhansol.benefits;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.databinding.ItemRecvBenefitsBinding;

import java.util.ArrayList;

public class BenefitsRecommendAdapter extends RecyclerView.Adapter<BenefitsRecommendAdapter.ViewHolder> {

    LayoutInflater inflater;

    ArrayList<BenefitsRecommendDTO> list;

    Context context;



    public BenefitsRecommendAdapter(LayoutInflater inflater, ArrayList<BenefitsRecommendDTO> list, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvBenefitsBinding binding = ItemRecvBenefitsBinding.inflate(inflater, parent, false);

        return new ViewHolder(binding);
    }




    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.recommendText1.setText(list.get(i).);



    }





    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemRecvBenefitsBinding binding;
        public ViewHolder(@NonNull ItemRecvBenefitsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


}
