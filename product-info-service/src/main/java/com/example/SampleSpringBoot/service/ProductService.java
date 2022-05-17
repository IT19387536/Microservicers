package com.example.SampleSpringBoot.service;

import com.example.SampleSpringBoot.entity.Product;

import java.util.Date;
import java.util.List;

public interface ProductService {

    Product save(Product product) throws Exception;

    Product findProductById(int id);

    List<Product> getProductList();

    void deleteProduct(int id);

    Product update(Product product) throws Exception;

    List<Product> retrieveProduct();

}
