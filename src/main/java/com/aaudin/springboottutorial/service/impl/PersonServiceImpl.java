package com.aaudin.springboottutorial.service.impl;

import org.springframework.stereotype.Service;

import com.aaudin.springboottutorial.model.Person;
import com.aaudin.springboottutorial.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public Person createPerson(String firstname, String lastname) {
		final Person person = new Person();
		person.setFirstname(firstname);
		person.setLastname(lastname);
		return person;
	}

}
