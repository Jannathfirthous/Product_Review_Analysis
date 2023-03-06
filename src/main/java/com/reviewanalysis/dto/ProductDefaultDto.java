package com.reviewanalysis.dto;

import org.springframework.stereotype.Component;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ProductDefaultDto implements ProductDto{
	private String productName;
	private String category;
	private int price;
}
