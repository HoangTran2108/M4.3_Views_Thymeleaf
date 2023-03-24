package com.example.bt1.service;
import com.example.bt1.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void add(Product product);

    Product findById(int id);
    List<Product> findByName(String name);

    void update(int id, Product product);

    void remove(int id);
}