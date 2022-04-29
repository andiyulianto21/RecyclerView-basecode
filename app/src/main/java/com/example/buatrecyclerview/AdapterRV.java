package com.example.buatrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterRV extends RecyclerView.Adapter<AdapterRV.HolderData>{

    private Context context;
    private List<String> namaMhs;
    private List<Integer> umurMhs;

    public AdapterRV(Context context, List<String> namaMhs, List<Integer> umurMhs) {
        this.context = context;
        this.namaMhs = namaMhs;
        this.umurMhs = umurMhs;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.card_item_mahasiswa, parent, false);
        HolderData holder = new HolderData(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        holder.tv_namaMhs.setText(namaMhs.get(position));
        holder.tv_umurMhs.setText(umurMhs.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return namaMhs.size();
    }

    public static class HolderData extends RecyclerView.ViewHolder {

        private TextView tv_namaMhs, tv_umurMhs;

        public HolderData(@NonNull View itemView) {
            super(itemView);
            tv_namaMhs = itemView.findViewById(R.id.tv_namaMhs);
            tv_umurMhs = itemView.findViewById(R.id.tv_umurMhs);
        }

    }

}
