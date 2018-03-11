package com.uday.main;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.uday.model.Product;
import com.uday.service.ProductService;

public class SpringOrmMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		ProductService productService = ctx.getBean(ProductService.class);
		productService.add(new Product(1, "Bulb"));
		productService.add(new Product(2, "Mustard"));
		
		System.out.println("\nlist all products ..");
		listProducts(productService.findAll());
		
		// Test transaction rollback with duplicated key
		System.out.println("----------------------------------------");
		System.out.println("testing rollback...");
		try {
			productService.addAll(Arrays.asList(new Product(3, "Book"), new Product(4, "Soap"), new Product(1, "Computer")));
		} catch(DataAccessException dataAccessException) {
			
		}
		
		System.out.println("\n----------------------------");
		System.out.println("list all products");
		listProducts(productService.findAll());
		
		ctx.close();
	}

	private static void listProducts(List<Product> products) {
		for(Product p: products)
			System.out.println(p);
		
	}

}
