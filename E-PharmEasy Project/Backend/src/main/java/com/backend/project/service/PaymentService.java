package com.backend.project.service;

import com.backend.project.entities.Payment;

public interface PaymentService {

	Payment savePayment(Payment payment);
	
	Payment findPaymentById(int id);
}
