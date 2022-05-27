package com.example.a13_19435491_hoangtienmanhduc;

public class Nuoc {
    private int id;
    private String ten;
    private int gia;

    public Nuoc() {
    }

    public Nuoc(int id, String ten, int gia) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
    }

    public Nuoc(String ten, int gia) {
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

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
