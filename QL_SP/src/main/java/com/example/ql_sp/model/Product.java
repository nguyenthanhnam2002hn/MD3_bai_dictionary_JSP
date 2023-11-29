package com.example.ql_sp.model;

public class Product {
    private int id;
    private String name;
    private int price;
    private int quantity;
    private String title;
    private String img;

    public Product() {
    }

    public Product(String name, int price, int quantity, String title, String img) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.title = title;
        this.img = img;
    }

    public Product(int id, String name, int price, int quantity, String title, String img) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.title = title;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
