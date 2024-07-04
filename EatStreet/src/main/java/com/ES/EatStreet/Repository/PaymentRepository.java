package com.ES.EatStreet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ES.EatStreet.Entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{
	

}
