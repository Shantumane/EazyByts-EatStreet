package com.ES.EatStreet.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ES.EatStreet.Entity.Delivery;
import com.ES.EatStreet.Services.DeliveryService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/delivery-tracking")
public class DeliveryController {
	
	

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping("/{id}")
    public ResponseEntity<Delivery> trackOrder(@PathVariable Long orderId) {
        java.util.Optional<Delivery> delivery = deliveryService.trackOrder(orderId);
        return delivery.map(ResponseEntity::ok)
                       .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
