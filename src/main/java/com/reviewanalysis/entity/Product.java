package com.reviewanalysis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	@NotNull(message = "product name")
	@Column(name = "Product_name")
	private String productName;
	@NotEmpty
	@Column(name = "product_category")
	String category;
	@Column(name = "Price")
	private int price;
	@Column(name = "Description")
	String description;

	public Product(@NotNull(message = "product name") String productName, @NotEmpty String category, int price,
			String description) {
		super();
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.description = description;
	}

}
