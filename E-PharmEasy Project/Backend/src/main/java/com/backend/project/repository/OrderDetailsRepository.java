package com.backend.project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.project.entities.OrderDetails;
import com.backend.project.entities.Orders;


@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {

	List<OrderDetails> findByOrders(Orders order);
	Optional<OrderDetails> findById(int id);
	
}
