package com.reviewanalysis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reviewanalysis.entity.Product;
import com.reviewanalysis.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
    ProductRepository productRepository;
	@Override
	public Product insertProduct(Product product) {
		// TODO Auto-generated method stub
		Product savedProduct = productRepository.save(product);
		return savedProduct;
	}
	@Override
	public Product updateProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		Product savedProduct=productRepository.save(product);
		return savedProduct;
	}
	@Override
	public List<Product> getAllProducts() throws Exception {
		// TODO Auto-generated method stub
		List<Product> allProducts=productRepository.findAll();
		return allProducts;
	}
	@Override
	public String deleteByProductId(int productId) throws Exception {
		// TODO Auto-generated method stub
		productRepository.deleteById(productId);
		return "Deleted successfully";
		
	}
	@Override
	public Product getProductByProductId(int ProductId) throws Exception {
		// TODO Auto-generated method stub
		return productRepository.getProductByProductId(ProductId);
	}
	@Override
	public List<Product> getProductByProductName(String productName) throws Exception {
		// TODO Auto-generated method stub
		return productRepository.getProductByProductName(productName);
	}
	@Override
	public List<Product> getProductByCategory(String category) {
		// TODO Auto-generated method stub
		return productRepository.getProductByCategory(category);
	}
	@Override
	public List<Product> getProductByPrice(int price) {
		// TODO Auto-generated method stub
		return productRepository.getProductByPrice(price);
	}
	@Override
	public List<Product> getProductByDescription(String description) {
		// TODO Auto-generated method stub
		return productRepository.getProductByDescription(description);
	}
//	@Override
//	public List<Product> sortByCost() throws Exception {
//		// TODO Auto-generated method stub
//		List<Product> list = productRepository.findAll();
//		Collections.sort(list, new SortByHightoLow());
//		return list;
//	}
	
	
}
