package com.aaudin.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.aaudin.springboottutorial.service.BeanScopeTesterService;
import com.aaudin.springboottutorial.service.PetService;
import com.aaudin.springboottutorial.service.impl.BeanScopeTesterServiceImpl;
import com.aaudin.springboottutorial.service.impl.CatServiceImpl;

@SpringBootApplication
public class SpringBootTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutorialApplication.class, args);
	}
	
	@Bean("beanScopeTesterService1")
	public BeanScopeTesterService beanScopeTesterService1() {
		return new BeanScopeTesterServiceImpl();
	}
	
	@Bean("beanScopeTesterService2")
	public BeanScopeTesterService beanScopeTesterService2() {
		return new BeanScopeTesterServiceImpl();
	}
	
	@Bean("catService")
	public PetService catService() {
		return new CatServiceImpl();
	}
	
	
}
