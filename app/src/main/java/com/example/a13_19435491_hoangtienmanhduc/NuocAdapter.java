package com.example.a13_19435491_hoangtienmanhduc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class NuocAdapter extends BaseAdapter {
    Context context;
    int idLayout;
    ArrayList<Nuoc> arrayList;

    public NuocAdapter(Context context, int idLayout, ArrayList<Nuoc> arrayList) {
        this.context = context;
        this.idLayout = idLayout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(idLayout,parent,false);
        Nuoc nuoc = arrayList.get(i);
        TextView ten = convertView.findViewById(R.id.tv_ten);
        TextView gia = convertView.findViewById(R.id.tv_gia);
        Button btn = convertView.findViewById(R.id.btn_mua);

        ten.setText(arrayList.get(i).getTen());
        gia.setText(arrayList.get(i).getGia());
        return convertView;
    }
}
