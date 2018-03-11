package com.uday.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.uday.dao.ProductDao;
import com.uday.model.Product;

@Component
@Transactional(value = "transactionManager")
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	

	public void add(Product product) {
		productDao.persist(product);
	}
	
	
	public void addAll(Collection<Product> products) {
		for(Product product: products) {
			productDao.persist(product);
		}
	}
	
	
	public List<Product> findAll() {
		return productDao.findAll();
	}
}
