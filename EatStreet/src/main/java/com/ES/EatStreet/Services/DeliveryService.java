package com.ES.EatStreet.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ES.EatStreet.Entity.Delivery;
import com.ES.EatStreet.Repository.DeliveryRepository;


@Service
public class DeliveryService {

	 @Autowired
	    private DeliveryRepository deliveryRepository;

	    public Optional<Delivery> trackOrder(Long orderId) {
	        return deliveryRepository.findById(orderId);
	    }
	}