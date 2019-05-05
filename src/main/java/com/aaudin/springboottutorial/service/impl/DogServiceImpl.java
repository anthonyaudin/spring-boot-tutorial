package com.aaudin.springboottutorial.service.impl;

import org.springframework.stereotype.Service;

import com.aaudin.springboottutorial.service.PetService;

@Service("dogService")
public class DogServiceImpl implements PetService {

	@Override
	public String identify() {
		return "I am a dog!";
	}

}
