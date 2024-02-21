package com.backend.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.project.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
