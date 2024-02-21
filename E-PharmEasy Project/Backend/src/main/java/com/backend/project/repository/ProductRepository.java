package com.backend.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.project.entities.Category;
import com.backend.project.entities.Product;
import com.backend.project.entities.Seller;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findBySeller(Seller seller);

	List<Product> findByCategory(Category category);
	
}
