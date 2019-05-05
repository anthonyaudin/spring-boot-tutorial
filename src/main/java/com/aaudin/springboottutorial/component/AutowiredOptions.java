package com.aaudin.springboottutorial.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredOptions {
	
	private PrototypeComponent prototypeComponent;
	
	//Field based autowiring
	@Autowired
	private SingletonComponent singletonComponent;
	
	private SessionComponent sessionComponent;
	
	//Constructor based autowiring
	public AutowiredOptions(@Autowired PrototypeComponent prototypeComponent) {
		this.prototypeComponent = prototypeComponent;
	}
	
	//Setter based autowiring
	@Autowired
	public void setSessionComponent(SessionComponent sessionComponent) {
		this.sessionComponent = sessionComponent;
	}
	
	//We do not really care about this method we just want to show that the 3 components got injected correctly
	public Integer sumCounts() {
		return prototypeComponent.incrementAndGet() + singletonComponent.incrementAndGet() + sessionComponent.incrementAndGet();
	}

}
