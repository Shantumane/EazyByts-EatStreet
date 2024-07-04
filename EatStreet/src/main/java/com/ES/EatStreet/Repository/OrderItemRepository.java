package com.ES.EatStreet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ES.EatStreet.Entity.OrderItem;



@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {

}
