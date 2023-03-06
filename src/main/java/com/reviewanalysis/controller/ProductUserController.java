package com.reviewanalysis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reviewanalysis.entity.Product;
import com.reviewanalysis.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductUserController {
	@Autowired
	ProductService productService;
//	private final Logger mylogs = LoggerFactory.getLogger(this.getClass());
	//@CrossOrigin(origins = "*")

	@GetMapping("/productname/{productName}") // localhost:8888/product/productname
	public List<Product> searchProductByName(@PathVariable String productName) throws Exception {
		return productService.getProductByProductName(productName);
	}
	@GetMapping("/category/{category}") // localhost:8888/product/productname
	public List<Product> searchProductCategory(@PathVariable String category) throws Exception {
		return productService.getProductByCategory(category);
	}
	@GetMapping("/price/{price}") // localhost:8888/product/productname
	public List<Product> searchProductPrice(@PathVariable int price) throws Exception {
		return productService.getProductByPrice(price);
	}
	@GetMapping("/description/{description}") // localhost:8888/product/productname
	public List<Product> searchProductDescription(@PathVariable String description) throws Exception {
		return productService.getProductByDescription(description);
	}
	@GetMapping("/allproducts")//localhost:8888/product/allproducts
	public List<Product> getAllProducts() {
		try {
			List<Product> allExtractedProduct = productService.getAllProducts();
			return allExtractedProduct;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return null;
	}
//	@GetMapping("/cost") // localhost:8023/flightbooking/user/cost
//	public List<Product> sortcostperseat() throws Exception {
//		return productService.sortByCost();
//	}

}
