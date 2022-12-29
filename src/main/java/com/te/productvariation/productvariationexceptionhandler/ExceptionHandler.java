package com.te.productvariation.productvariationexceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.productvariation.productvariationcustomexception.CustomException;
import com.te.productvariation.productvariationresponse.Response;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(CustomException.class)
	public ResponseEntity<Response> exceptionHandler(CustomException e) {
		return new ResponseEntity<Response>(new Response(true, e.getMessage(), null), HttpStatus.BAD_REQUEST);
	}
}
