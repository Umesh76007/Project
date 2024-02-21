package com.backend.project.service;

import com.backend.project.entities.Address;

public interface AddressService {
	
	Address saveAddress(Address address);
	
	Address findAddress(int id);
}
