package com.ES.EatStreet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ES.EatStreet.Entity.Payment;
import com.ES.EatStreet.Services.PaymentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/payments")
public class PaymentController {
	
	 @Autowired
	    private PaymentService paymentService;

	    @PostMapping
	    public ResponseEntity<Payment> processPayment(@RequestBody Payment payment) {
	        Payment processedPayment = paymentService.processPayment(payment);
	        return ResponseEntity.ok(processedPayment);
	    }

}
