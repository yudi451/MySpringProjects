package com.uday.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uday.config.PersonRowMapper;
import com.uday.model.Person;

@Repository
@Qualifier("personDao")
public class PersonDaoImpl implements PersonDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public void addPerson(Person person) {
		jdbcTemplate.update("INSERT INTO person(person_id,first_name,last_name,email) VALUES (?,?,?,?)",
				person.getPersonId(),person.getFirstName(),person.getLastName(), person.getEmail());
		System.out.println("person added!!");
	}

	
	public void editPerson(Person person, int personId) {
		jdbcTemplate.update("UPDATE person SET first_name=?,last_name=?, email=? WHERE person_id = ?",
				person.getFirstName(), person.getLastName(), person.getEmail(), personId);
		System.out.println("person updated!!");
	}

	
	public void deletePerson(int personId) {
		jdbcTemplate.update("DELETE FROM person WHERE person_id=?",
				personId);
		System.out.println("person deleted!!");
	}

	
	public Person find(int personId) {
		Person person = (Person) jdbcTemplate.queryForObject("SELECT * FROM person where person_id=?",new Object[]{personId}, new PersonRowMapper());
		return person;
	}

	
	public List<Person> findAll() {
		String sql = "select * from person";
		List<Person> persons = new ArrayList<Person>();
		
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for(Map<String, Object> row: rows) {
			Person person = new Person();
			person.setPersonId((Integer)row.get("person_id"));
			person.setFirstName((String)row.get("first_name"));
			person.setLastName((String)row.get("last_name"));
			person.setEmail((String)row.get("email"));
			persons.add(person);
		} 
		return persons;
	}

}
