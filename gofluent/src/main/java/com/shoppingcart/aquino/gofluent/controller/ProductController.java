package com.shoppingcart.aquino.gofluent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.aquino.gofluent.entity.Product;
import com.shoppingcart.aquino.gofluent.service.ProductService;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("gofluent/products")
public class ProductController {
	
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = { "", "/" })
    public @NotNull Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }

}
