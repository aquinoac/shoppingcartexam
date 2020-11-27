package com.shoppingcart.aquino.gofluent.repository;

import org.springframework.data.repository.CrudRepository;

import com.shoppingcart.aquino.gofluent.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
