package com.aaudin.springboottutorial.service.impl;

import com.aaudin.springboottutorial.service.PetService;

public class CatServiceImpl implements PetService{

	@Override
	public String identify() {
		return "I am a cat!";
	}
}
