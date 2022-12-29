package com.te.productvariation.productvariationservice;

import com.te.productvariation.productvariationdto.Variationdto;
import com.te.productvariation.productvariationentity.Departments;

public interface Services {

	Departments addDept(Variationdto dto);

	Departments getDept(int departmentId);

	void deleteDepartment(int departmentId);

	void deleteProduct(int productId);

}
