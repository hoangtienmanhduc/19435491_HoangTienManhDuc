package com.example.a13_19435491_hoangtienmanhduc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SanPham extends AppCompatActivity {

    DataNuoc dataNuoc;
    ListView listView;
    ArrayList<Nuoc> nuoc;
    NuocAdapter nuocAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_pham);
        dataNuoc = new DataNuoc(this,"nuocdb.sqlite",null,1);
        dataNuoc.addNuoc(new Nuoc("Sting",5000));
    }

}