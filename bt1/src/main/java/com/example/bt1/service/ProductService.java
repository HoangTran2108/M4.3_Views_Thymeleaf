package com.example.bt1.service;

import com.example.bt1.model.Product;

import java.util.*;

public class ProductService implements IProductService {
    private static final Map<Integer, Product> products = new HashMap<>();
    static {
        products.put(1,new Product(1, "Banana", 100.0, "normal", "VN"));
        products.put(2,new Product(2, "Orange", 100.1, "good", "KR"));
        products.put(3,new Product(3, "Coconut", 100.2, "normal", "VN"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void add(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>();
        Set<Map.Entry<Integer, Product>> entries = products.entrySet();
        for (Map.Entry<Integer, Product> entry : entries) {
            if (entry.getValue().getName().equals(name)) {
                productList.add(entry.getValue());
            }
        }
        return productList;
    }


    @Override
    public void update(int id, Product product) {
        products.put(id, product);

    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}