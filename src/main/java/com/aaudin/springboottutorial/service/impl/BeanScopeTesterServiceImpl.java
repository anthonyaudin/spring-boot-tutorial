package com.aaudin.springboottutorial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.aaudin.springboottutorial.component.PrototypeComponent;
import com.aaudin.springboottutorial.component.SessionComponent;
import com.aaudin.springboottutorial.component.SingletonComponent;
import com.aaudin.springboottutorial.service.BeanScopeTesterService;

public class BeanScopeTesterServiceImpl implements BeanScopeTesterService {
	
	@Autowired
	private PrototypeComponent prototypeComponent;
	
	@Autowired
	private SessionComponent sessionComponent;
	
	@Autowired 
	private SingletonComponent singletonComponent;

	@Override
	public int countForSession() {
		return sessionComponent.incrementAndGet();
	}

	@Override
	public int countForSingleton() {
		return singletonComponent.incrementAndGet();
	}

	@Override
	public int countForPrototype() {
		return prototypeComponent.incrementAndGet();
	}
	
	

}
