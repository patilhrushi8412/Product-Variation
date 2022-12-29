package com.te.productvariation.productvariationsrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.productvariation.productvariationentity.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer>{

	
}
