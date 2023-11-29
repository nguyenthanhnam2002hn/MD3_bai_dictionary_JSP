package com.example.ql_sp.service.impl;

import com.example.ql_sp.model.Product;
import com.example.ql_sp.service.Generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements Generic {
    public static Map<Integer,Product> arrayList;
    static {
        arrayList= new HashMap<>();
        arrayList.put(1,new Product(1,"cam",50000,200,"sản pẩm tốt","ảnh"));
        arrayList.put(2,new Product(2,"quýt",50000,200,"sản pẩm tốt","ảnh"));
        arrayList.put(3,new Product(3,"mít",50000,200,"sản pẩm tốt","ảnh"));
        arrayList.put(4,new Product(4,"dừa",50000,200,"sản pẩm tốt","ảnh"));
        arrayList.put(5,new Product(5,"dưa",50000,200,"sản pẩm tốt","ảnh"));
        arrayList.put(6,new Product(6,"lê",50000,200,"sản pẩm tốt","ảnh"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(arrayList.values());
    }

    @Override
    public void save(Product product) {
        arrayList.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return arrayList.get(id);
    }

    @Override
    public void update(int id, Product product) {
        arrayList.put(id,product);
    }

    @Override
    public void delete(int id) {
        arrayList.remove(id);
    }
}
