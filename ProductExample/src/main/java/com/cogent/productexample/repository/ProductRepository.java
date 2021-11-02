package com.cogent.productexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.productexample.dto.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
