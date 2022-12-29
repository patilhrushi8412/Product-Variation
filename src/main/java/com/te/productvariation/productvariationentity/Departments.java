package com.te.productvariation.productvariationentity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Entity
@Data
@JsonInclude(value = Include.NON_NULL)
public class Departments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;
	private String departmentTitle; 
	
	@OneToMany
	@Cascade(CascadeType.ALL)
	@JoinColumn(name="departmentId")
	private List<Categories> categories;
	
	@OneToMany
	@Cascade(CascadeType.ALL)
	@JoinColumn(name="departmentId")
	private List<Products> products;
}
