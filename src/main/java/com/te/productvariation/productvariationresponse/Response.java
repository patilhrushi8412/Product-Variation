package com.te.productvariation.productvariationresponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

	private boolean error;
	private String message;
	private Object data;
}
