package com.uday.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.uday.model.Person;

public interface PersonRepository<P> extends CrudRepository<Person, Long> {
	Person findByFirstName(String firstName);
}
