package com.uday.service;

import java.util.List;

import com.uday.model.Person;

public interface PersonService {
	public void addPerson(Person person);
	public void editPerson(Person person, int personId);
	public void deletePerson(int personId);
	public Person find(int personId);
	public List<Person> findAll();
}
