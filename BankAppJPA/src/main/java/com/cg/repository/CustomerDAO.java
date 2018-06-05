package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.Customer;
import com.dto.WrapperBankCustomer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer>{

	
	

}
