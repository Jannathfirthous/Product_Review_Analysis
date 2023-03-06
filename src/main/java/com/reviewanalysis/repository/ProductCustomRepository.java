package com.reviewanalysis.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.reviewanalysis.entity.Product;

@Repository
public interface ProductCustomRepository {
	public Product getProductByProductId(int ProductId) throws Exception;

	public List<Product> getProductByProductName(String productName) throws Exception;
	
	public List<Product> getProductByCategory(String category);

	public List<Product> getProductByPrice(int price);
	
	public List<Product> getProductByDescription(String description);
	
//	public List<Product> sortByCost() throws Exception;

}
