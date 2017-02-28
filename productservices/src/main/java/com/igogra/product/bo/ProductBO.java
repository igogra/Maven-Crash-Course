package com.igogra.product.bo;

import com.igogra.product.dto.Product;

public interface ProductBO {
	public void create(Product product);
	
	public Product findProduct(int id);
}
