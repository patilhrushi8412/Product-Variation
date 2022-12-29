package com.te.productvariation.productvariationcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.productvariation.productvariationdto.Variationdto;
import com.te.productvariation.productvariationentity.Departments;
import com.te.productvariation.productvariationresponse.Response;
import com.te.productvariation.productvariationservice.Services;

@RestController
@RequestMapping("variation")
public class Controller {

	@Autowired
	private Services services;

	@PostMapping("/addDepartment")
	public ResponseEntity<Response> addDepartment(@RequestBody Variationdto dto) {
		Departments dept = services.addDept(dto);
		return new ResponseEntity<Response>(new Response(false, "Department Added", dept), HttpStatus.OK);
	}

	@GetMapping("/getDepartment/{departmentId}")
	public ResponseEntity<Response> getDepartment(@PathVariable int departmentId) {
		Departments dept = services.getDept(departmentId);
		return new ResponseEntity<Response>(new Response(false, "Getting Department", dept), HttpStatus.OK);
	}

	@DeleteMapping("/deleteDepartment/{departmentId}")
	public ResponseEntity<Response> deleteDepartment(@PathVariable int departmentId) {
		services.deleteDepartment(departmentId);
		return new ResponseEntity<Response>(new Response(false, "Department Deleted", null), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteProduct/{productId}")
	public ResponseEntity<Response> deleteProduct(@PathVariable int productId) {
		services.deleteProduct(productId);
		return new ResponseEntity<Response>(new Response(false, "Product Deleted", null), HttpStatus.OK);
	}
}
