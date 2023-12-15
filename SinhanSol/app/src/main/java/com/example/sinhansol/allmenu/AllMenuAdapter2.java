package com.example.sinhansol.allmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.databinding.ItemMenuRecv1Binding;
import com.example.sinhansol.databinding.ItemMenuRecv2Binding;

import java.util.ArrayList;

public class AllMenuAdapter2 extends RecyclerView.Adapter<AllMenuAdapter2.ViewHolder> {



    ArrayList<String> list;

    Context context;



    public AllMenuAdapter2(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMenuRecv2Binding binding = ItemMenuRecv2Binding.inflate(LayoutInflater.from(context), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {

        h.binding.menuRecv2DetailList.setText(list.get(i));




    }

    @Override
    public int getItemCount() {
        return list.size();
    }







    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemMenuRecv2Binding binding;

        public ViewHolder(@NonNull ItemMenuRecv2Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


}
