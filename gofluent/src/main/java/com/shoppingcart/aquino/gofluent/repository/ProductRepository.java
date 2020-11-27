package com.shoppingcart.aquino.gofluent.repository;

import org.springframework.data.repository.CrudRepository;
import com.shoppingcart.aquino.gofluent.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
