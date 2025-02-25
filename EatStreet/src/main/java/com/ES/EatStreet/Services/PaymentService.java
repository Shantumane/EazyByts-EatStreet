package com.ES.EatStreet.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ES.EatStreet.Entity.Payment;
import com.ES.EatStreet.Repository.PaymentRepository;


@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment processPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

}
