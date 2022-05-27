package com.example.a13_19435491_hoangtienmanhduc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DataNuoc extends SQLiteOpenHelper {
    public DataNuoc(@Nullable Context context,
                    @Nullable String name,
                    @Nullable SQLiteDatabase.CursorFactory factory,
                    int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE nuoc (" +
                " id INTEGER PRIMARY KEY AUTOINCREMENT," + "ten TEXT NOT NULL," + "gia DOUBLE NOT NULL)";
        db.execSQL(sql);
    }

    public void addNuoc(Nuoc nuoc){
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put("ten",nuoc.getTen());
        values.put("gia",nuoc.getGia());
        db.insert("nuoc",null,values);
    }

    public ArrayList<Nuoc> getAll(){
        ArrayList<Nuoc> nuocList = new ArrayList<>();
        String sql = "select * from nuoc";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql,null);
        if(cursor.moveToFirst()){
            do {
                Nuoc nuoc = new Nuoc();
                nuoc.setId(cursor.getInt(0));
                nuoc.setTen(cursor.getString(1));
                nuoc.setGia((int) cursor.getDouble(2));
                nuocList.add(nuoc);
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return nuocList;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
