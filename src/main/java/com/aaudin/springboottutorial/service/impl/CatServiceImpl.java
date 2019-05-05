package com.aaudin.springboottutorial.service.impl;

import org.springframework.stereotype.Service;

import com.aaudin.springboottutorial.service.PetService;

@Service("catService")
public class CatServiceImpl implements PetService{

	@Override
	public String identify() {
		return "I am a cat!";
	}
}
