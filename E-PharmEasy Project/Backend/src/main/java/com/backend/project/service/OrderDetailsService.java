package com.backend.project.service;

import java.util.List;
import java.util.Optional;

import com.backend.project.entities.OrderDetails;
import com.backend.project.entities.Orders;


public interface OrderDetailsService {

	void saveOrderDetails(OrderDetails od);
	OrderDetails findById(int id);
	List<OrderDetails> findByOrder(Orders order);
	
}
