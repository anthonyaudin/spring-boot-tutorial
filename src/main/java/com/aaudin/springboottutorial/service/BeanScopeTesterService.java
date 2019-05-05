package com.aaudin.springboottutorial.service;

public interface BeanScopeTesterService {

	int countForSession();
	int countForSingleton();
	int countForPrototype();
	
}
