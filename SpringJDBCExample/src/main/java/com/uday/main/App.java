package com.uday.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.uday.config.AppConfig;
import com.uday.model.Person;
import com.uday.service.PersonService;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		PersonService personService = (PersonService) ctx.getBean("personService");
		
		
		Person anita = personService.find(2);
		System.out.println(anita);
		
//		showAllPersons(personService);
	}
	
	public static void showAllPersons(PersonService personService) {
		List<Person> persons = personService.findAll();
		for(Person person: persons)
			System.out.println(person);
	}
}
