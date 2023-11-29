package com.example.ht_danh_sach_kh.model;

public class Student {
    private int id;
    private String name;
    private String ns;
    private String dc;
    private String img;
    public Student() {
    }
    public Student(int id, String name, String ns, String dc, String img) {
        this.id = id;
        this.name = name;
        this.ns = ns;
        this.dc = dc;
        this.img = img;
    }
    public Student(String name, String ns, String dc, String img) {
        this.name = name;
        this.ns = ns;
        this.dc = dc;
        this.img = img;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
