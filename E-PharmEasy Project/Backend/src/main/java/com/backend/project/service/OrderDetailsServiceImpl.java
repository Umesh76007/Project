package com.backend.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.project.entities.OrderDetails;
import com.backend.project.entities.Orders;
import com.backend.project.repository.OrderDetailsRepository;
@Service
public class OrderDetailsServiceImpl implements OrderDetailsService{

	@Autowired 
	OrderDetailsRepository orderDetailsRepo;
	
	@Override
	public void saveOrderDetails(OrderDetails od) {
		// TODO Auto-generated method stub
		orderDetailsRepo.save(od);
	}

	@Override
	public OrderDetails findById(int id) {
		// TODO Auto-generated method stub
		Optional<OrderDetails> orderDetails= orderDetailsRepo.findById(id);
		return orderDetails.get();
	}

	@Override
	public List<OrderDetails> findByOrder(Orders order) {
		// TODO Auto-generated method stub
		return orderDetailsRepo.findByOrders(order);
	}
}
