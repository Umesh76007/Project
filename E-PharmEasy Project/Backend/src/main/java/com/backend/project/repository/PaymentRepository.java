package com.backend.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.project.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
