package com.uday.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uday.model.Person;
import com.uday.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository<Person> personRepository;
	
	// create
	@Transactional
	public void addPerson(Person p) {
		personRepository.save(p);
	}
	
	@Transactional
	public Person getById(Long id) {
		return personRepository.findOne(id);
	}
	
	// read
	@Transactional
	public Person find(String firstname) {
		return personRepository.findByFirstName(firstname);
	}
	
	// update
	@Transactional
	public boolean updatePerson(Person p) {
		return personRepository.save(p) != null;
	}
	
	// delete
	@Transactional
	public void deletePerson(Long personId) {
		personRepository.delete(personId);
	}
	
	// list all
	@Transactional
	public List<Person> getAllPersons() {
		return (List<Person>) personRepository.findAll();
	}
}
