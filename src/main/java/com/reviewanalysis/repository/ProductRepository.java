package com.reviewanalysis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reviewanalysis.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>, ProductCustomRepository {

}
