package com.example.ql_sp.service;

import com.example.ql_sp.model.Product;

import java.util.List;

public interface Generic {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    void update(int id,Product product);
    void delete(int id);
}
