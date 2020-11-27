package com.shoppingcart.aquino.gofluent.repository;

import org.springframework.data.repository.CrudRepository;

import com.shoppingcart.aquino.gofluent.entity.OrderProduct;
import com.shoppingcart.aquino.gofluent.entity.OrderProductPK;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {

}
