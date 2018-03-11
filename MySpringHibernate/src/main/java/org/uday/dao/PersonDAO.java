package org.uday.dao;

import java.util.List;

import org.uday.model.Person;

public interface PersonDAO {
	void save(Person p);
	List<Person> list();
}
