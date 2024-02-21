package com.backend.project.service;

import java.util.List;

import com.backend.project.entities.Customer;
import com.backend.project.entities.Orders;

public interface OrderService {

	Orders saveOrder(Orders order);
	List<Orders> getAllOrders();
	List<Orders> getCustomerOrders(Customer customer);
	Orders findById(int id);
}


