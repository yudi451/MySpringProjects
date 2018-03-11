package com.uday.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.uday.model.Person;
import com.uday.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
	public @ResponseBody Person getPerson(@PathVariable Long id) {
		return personService.getById(id);
	}
	
	@RequestMapping(value = "/personname/{name}", method = RequestMethod.GET)
	public @ResponseBody Person getPersonByName(@PathVariable String name) {
		return personService.find(name);
	}
	
	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public List<Person> getAllPersons() {
		return personService.getAllPersons();
	}
	
	@RequestMapping(value = "/person/{id}", method = RequestMethod.DELETE)
	public HttpStatus deletePerson(@PathVariable Long id) {
		personService.deletePerson(id);
		return HttpStatus.NO_CONTENT;
	}
	
	@RequestMapping(value = "/person", method = RequestMethod.POST)
	public HttpStatus addPerson(@RequestBody Person person) {
		personService.addPerson(person);
		return HttpStatus.CREATED;
	}
	
	@RequestMapping(value = "/person", method = RequestMethod.PUT)
	public HttpStatus updatePerson(@RequestBody Person person) {
		return personService.updatePerson(person) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
}
