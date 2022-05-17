package com.example.SampleSpringBoot.repository;

import com.example.SampleSpringBoot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

//    @Query("EFutures.product.find({$and:[{startDate:{$lte:new Date()}},{closeDate:{$gte:new Date()}}]})")
//    List<Product> findProducts();

    @Query("select p from Product p where p.startDate<=current_date  and p.closeDate>=current_date ")
    List<Product> findProducts();
}
