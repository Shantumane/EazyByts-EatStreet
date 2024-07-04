package com.ES.EatStreet.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ES.EatStreet.Entity.Order;
import com.ES.EatStreet.Services.OrderService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/orders")
public class OrderController {
	
	    @Autowired
	    private OrderService orderService;

	    @GetMapping
	    public List<Order> getAllOrders() {
	        return orderService.getAllOrders();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
	        Optional<Order> order = orderService.getOrderById(id);
	        if (order.isPresent()) {
	            return ResponseEntity.ok(order.get());
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @PostMapping
	    public Order createOrder(@RequestBody Order order) {
	        return orderService.saveOrder(order);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Order> updateOrder(@PathVariable Long id, @RequestBody Order orderDetails) {
	        Optional<Order> optionalOrder = orderService.getOrderById(id);
	        if (optionalOrder.isPresent()) {
	            Order order = optionalOrder.get();
	            order.setOrderDate(orderDetails.getOrderDate());
	            order.setStatus(orderDetails.getStatus());
	            order.setOrderItems(orderDetails.getOrderItems());
	            Order updatedOrder = orderService.saveOrder(order);
	            return ResponseEntity.ok(updatedOrder);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
	        Optional<Order> optionalOrder = orderService.getOrderById(id);
	        if (optionalOrder.isPresent()) {
	            orderService.deleteOrder(id);
	            return ResponseEntity.noContent().build();
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	}
	    



