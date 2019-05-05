package com.aaudin.springboottutorial.component;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) // This line is useless as the default scope is singleton
public class SingletonComponent {
	
	private AtomicInteger calls = new AtomicInteger(0);
	
	public int incrementAndGet() {
		return calls.incrementAndGet();
	}
}
