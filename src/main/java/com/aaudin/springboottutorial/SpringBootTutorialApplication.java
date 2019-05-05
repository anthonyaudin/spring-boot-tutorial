package com.aaudin.springboottutorial;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.aaudin.springboottutorial.component.ComponentWithValuesFromConfig;
import com.aaudin.springboottutorial.service.BeanScopeTesterService;
import com.aaudin.springboottutorial.service.impl.BeanScopeTesterServiceImpl;

@SpringBootApplication
public class SpringBootTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutorialApplication.class, args);
	}
	
	//Read property single.value from application.properties
	@Bean
	public ComponentWithValuesFromConfig componentWithValuesFromConfig(@Value("${single.value}") String valueFromConfig) {
		final ComponentWithValuesFromConfig component = new ComponentWithValuesFromConfig();
		component.setValue(valueFromConfig);
		return component;
	}
	
	@Bean("beanScopeTesterService1")
	public BeanScopeTesterService beanScopeTesterService1() {
		return new BeanScopeTesterServiceImpl();
	}
	
	@Bean("beanScopeTesterService2")
	public BeanScopeTesterService beanScopeTesterService2() {
		return new BeanScopeTesterServiceImpl();
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
