package com.example.a13_19435491_hoangtienmanhduc;

public class Nuoc {
    private int id;
    private String ten;
    private String gia;

    public Nuoc() {
    }

    public Nuoc(int id, String ten, String gia) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
    }

    public Nuoc(String ten, String gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
