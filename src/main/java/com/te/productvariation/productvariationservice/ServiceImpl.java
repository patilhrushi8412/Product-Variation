package com.te.productvariation.productvariationservice;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.productvariation.productvariationcustomexception.CustomException;
import com.te.productvariation.productvariationdto.Variationdto;
import com.te.productvariation.productvariationentity.Departments;
import com.te.productvariation.productvariationentity.Products;
import com.te.productvariation.productvariationsrepository.ProductRepo;

@Service
public class ServiceImpl implements Services {

	@Autowired
	private com.te.productvariation.productvariationsrepository.Repository repo;
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public Departments addDept(Variationdto dto) {
		try {
			if (dto == null) {
				throw new CustomException("Something Went Wrong");
			} else {

			}
			Departments dept = new Departments();
			BeanUtils.copyProperties(dto, dept);
			Departments save = repo.save(dept);
			return save;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Departments getDept(int departmentId) {
		try {
			Optional<Departments> dept = repo.findById(departmentId);
			if (!dept.isPresent()) {
				throw new CustomException("Data Not Fount");
			} else {
				return dept.get();
			}
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void deleteDepartment(int departmentId) {
		try {
			Optional<Departments> dept = repo.findById(departmentId);
			if (!dept.isPresent()) {
				throw new CustomException("Data Not Fount");
			} else {
				repo.delete(dept.get());
			}
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void deleteProduct(int productId) {
		try {
			Optional<Products> product = productRepo.findById(productId);
			if (!product.isPresent()) {
				throw new CustomException("Data Not Fount");
			} else {
				productRepo.delete(product.get());
			}
		} catch (Exception e) {
			throw e;
		}
	}

}
