package com.reviewanalysis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.reviewanalysis.entity.Product;

@Service
public interface ProductService {
	public Product insertProduct(Product product);

	public Product updateProduct(Product product) throws Exception;

	public List<Product> getAllProducts() throws Exception;

	public String deleteByProductId(int productId) throws Exception;

	public Product getProductByProductId(int ProductId) throws Exception;

	public List<Product> getProductByProductName(String productName) throws Exception;

	public List<Product> getProductByCategory(String category);

	public List<Product> getProductByPrice(int price);

	public List<Product> getProductByDescription(String description);
	
//	public List<Product> sortByCost() throws Exception;

}
