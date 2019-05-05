package com.aaudin.springboottutorial.component;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeComponent {
	
	private AtomicInteger calls = new AtomicInteger(0);
	
	public int incrementAndGet() {
		return calls.incrementAndGet();
	}

}
