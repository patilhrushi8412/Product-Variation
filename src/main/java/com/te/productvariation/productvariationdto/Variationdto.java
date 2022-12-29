package com.te.productvariation.productvariationdto;

import java.util.List;

import com.te.productvariation.productvariationentity.Categories;
import com.te.productvariation.productvariationentity.Products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Variationdto {

	private String departmentTitle;

	private List<Categories> categories;

	private List<Products> products;

}
