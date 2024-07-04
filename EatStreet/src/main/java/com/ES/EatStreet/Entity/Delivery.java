package com.ES.EatStreet.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "delivery")
public class Delivery {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;
    private String status;
    private LocalDateTime estimatedDelivery;
    private String currentLocation;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getEstimatedDelivery() {
		return estimatedDelivery;
	}
	public void setEstimatedDelivery(LocalDateTime estimatedDelivery) {
		this.estimatedDelivery = estimatedDelivery;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	
	
	public Delivery(Long id, Long orderId, String status, LocalDateTime estimatedDelivery, String currentLocation) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.status = status;
		this.estimatedDelivery = estimatedDelivery;
		this.currentLocation = currentLocation;
	}
	
	
	public Delivery() {
		super();
	}
    
    
}
