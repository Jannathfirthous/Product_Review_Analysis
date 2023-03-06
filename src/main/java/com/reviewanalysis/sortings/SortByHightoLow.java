package com.reviewanalysis.sortings;

import java.util.Comparator;

import com.reviewanalysis.entity.Product;

public class SortByHightoLow implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.getPrice()-p2.getPrice();
	}

}
