package com.te.productvariation.productvariationentity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Entity
@Data
@JsonInclude(value = Include.NON_NULL)
public class ProductVariationOptions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productVariationOptionId;

}
