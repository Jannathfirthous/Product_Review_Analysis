package com.reviewanalysis.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.reviewanalysis.entity.Product;
import com.reviewanalysis.repository.ProductRepository;

@SpringBootTest
class ProductServiceImplTest {

	@Mock
	ProductRepository productRepository;

	@InjectMocks
	ProductServiceImpl productService;

	@Test
	@DisplayName("Insert the products")
	void testInsertProduct() throws Exception {
		Product sampleInput = new Product("Redmi note 11", "Mobiles", 20000, "It is a no 1 mobile");
		Product expectedOutput = new Product("Redmi note 11", "Mobiles", 20000, "It is a no 1 mobile");
		BDDMockito.given(productService.insertProduct(sampleInput)).willReturn(expectedOutput);
	}

	@Test
	@DisplayName("Get all the products")
	void testGetAllProducts() throws Exception {
		Product product1 = new Product("Redmi note 11", "Mobiles", 20000, "It is a no 1 mobile");
		Product product2 = new Product("Redmi note 11", "Mobiles", 20000, "It is a no 1 mobile");
		List<Product> sampleOutput = new ArrayList<>();
		sampleOutput.add(product1);
		sampleOutput.add(product2);
		BDDMockito.given(productService.getAllProducts()).willReturn(sampleOutput);
		List<Product> actualOutput = productService.getAllProducts();
		assertNotNull(actualOutput);
		assertIterableEquals(sampleOutput, actualOutput);
	}

	@Disabled
	@Test
	void testDeleteByProductId() throws Exception {
//		fail("Not yet implemented");

	}

	@Disabled
	@Test
	void testGetProductByProductId() throws Exception {
		// fail("Not yet implemented");

	}

	@Disabled
	@Test
	void testGetProductByProductName() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testGetProductByCategory() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testGetProductByPrice() throws Exception {

	}

	@Disabled
	@Test
	void testGetProductByDescription() {
		fail("Not yet implemented");
	}
}
