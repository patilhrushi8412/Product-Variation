package com.te.productvariation.productvariationsrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.productvariation.productvariationentity.Departments;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Departments, Integer> {

}
