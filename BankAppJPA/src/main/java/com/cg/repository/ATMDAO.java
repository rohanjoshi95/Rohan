package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.ATM;

@Repository
public interface ATMDAO extends JpaRepository<ATM, Integer>{


}
