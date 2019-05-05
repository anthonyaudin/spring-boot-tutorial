package com.aaudin.springboottutorial.component;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionComponent {
	
	private AtomicInteger calls = new AtomicInteger(0);
	
	public int incrementAndGet() {
		return calls.incrementAndGet();
	}
}
