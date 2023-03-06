package com.reviewanalysis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reviewanalysis.entity.Product;
import com.reviewanalysis.service.ProductService;

@RestController
@RequestMapping("/product/admin")
public class ProductAdminController {
	@Autowired
	ProductService productService;
	private final Logger mylogs = LoggerFactory.getLogger(this.getClass());

//	@CrossOrigin(origins = "*")
	@PostMapping("/addproduct") // localhost:8888/product/admin/addproduct
	public ResponseEntity<String> addUser(@RequestBody Product product) {
		try {
			Product savedProduct = productService.insertProduct(product);
			String responseMsg = savedProduct.getProductName() + " save with Id " + savedProduct.getProductId();
			mylogs.info(" ---->> Inside App User Constroller Post mapping , user created " + responseMsg);
			return new ResponseEntity<String>(responseMsg, HttpStatus.OK);
		} catch (Exception e) {
			String errorMsg = "Contact to customer care 1800-250-960 or mail us :- care@capg.com";
			mylogs.error(errorMsg);
			return new ResponseEntity<String>(errorMsg, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/update/{productId}") // localhost:8888/product/admin/update/1
	public Product updateProduct(@RequestBody Product product) throws Exception {
		return productService.updateProduct(product);
	}

	@DeleteMapping("/delete/{productId}") // localhost:8888/product/admin/delete/6
	public String deleteProduct(@PathVariable int productId) throws Exception {
		productService.deleteByProductId(productId);
		mylogs.info("A value is deleted");
		return "deleted Successfully";
	}

	@GetMapping("/searchproduct/{productId}") // localhost:8888/product/searchproduct/6
	public Product searchProductById(@PathVariable int productId) throws Exception {
		return productService.getProductByProductId(productId);
	}
}
