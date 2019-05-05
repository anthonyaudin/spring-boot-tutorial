package com.aaudin.springboottutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aaudin.springboottutorial.model.Person;
import com.aaudin.springboottutorial.service.PersonService;

@RestController
public class TutorialController {
	
	@Autowired
	private PersonService personService;

	@GetMapping("/person/{firstname}/{lastname}")
	public Person createPerson (@PathVariable("firstname") String firstname, @PathVariable("lastname") String lastname) {
		final Person person = personService.createPerson(firstname, lastname);
		return person;
	}
	
}
