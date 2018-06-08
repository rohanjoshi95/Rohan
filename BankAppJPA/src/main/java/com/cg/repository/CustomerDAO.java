package com.cg.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.model.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer>{

	public Optional<Customer> findByCustomerId(Integer customerId);

}
