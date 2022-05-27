package com.example.a13_19435491_hoangtienmanhduc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SanPham extends AppCompatActivity {

    DataNuoc dataNuoc;
    ListView listView;
    ArrayList<Nuoc> arrayListNuoc;
    NuocAdapter nuocAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_pham);
        dataNuoc = new DataNuoc(this,"nuocdb.sqlite",null,1);
        dataNuoc.addNuoc(new Nuoc("Sting","100000"));
        dataNuoc.addNuoc(new Nuoc("RedBull","150000"));
        dataNuoc.addNuoc(new Nuoc("Pepsi","10000"));
        dataNuoc.addNuoc(new Nuoc("Phanta","12000"));
        dataNuoc.addNuoc(new Nuoc("Mirinda","10000"));
        dataNuoc.addNuoc(new Nuoc("Awafina","6000"));
        dataNuoc.addNuoc(new Nuoc("7Up","8000"));


        listView = findViewById(R.id.listviewsp);
        arrayListNuoc=dataNuoc.getAll();
        nuocAdapter=new NuocAdapter(this,R.layout.item_nuoc,arrayListNuoc);
        listView.setAdapter(nuocAdapter);
    }
}