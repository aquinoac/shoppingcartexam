package com.shoppingcart.aquino.gofluent.dto;

import com.shoppingcart.aquino.gofluent.entity.Product;

public class OrderProductDto {

    private Product product;
    private Integer quantity;
    
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
    
}
