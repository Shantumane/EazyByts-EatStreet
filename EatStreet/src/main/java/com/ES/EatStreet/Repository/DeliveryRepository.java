package com.ES.EatStreet.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ES.EatStreet.Entity.Delivery;


@Repository

public interface DeliveryRepository  extends JpaRepository<Delivery, Long> {
	
	 Optional<Delivery> findByOrderId(Long orderId);

}
