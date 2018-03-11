package org.uday.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.uday.dao.PersonDAO;
import org.uday.model.Person;

public class SpringHibernateMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		
		Person person = new Person();
		person.setName("Avyan");
		person.setCountry("USA");
		
		personDAO.save(person);
		System.out.println("Person::"+person);
		
		List<Person> list = personDAO.list();
		for(Person p : list)
			System.out.println("Person List::"+p);
		
		context.close();
	}

}
