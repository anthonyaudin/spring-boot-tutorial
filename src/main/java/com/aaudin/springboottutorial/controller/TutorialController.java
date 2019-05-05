package com.aaudin.springboottutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aaudin.springboottutorial.component.AutowiredOptions;
import com.aaudin.springboottutorial.component.ComponentWithValuesFromConfig;
import com.aaudin.springboottutorial.model.Person;
import com.aaudin.springboottutorial.model.response.BaseResponse;
import com.aaudin.springboottutorial.model.response.ColorListResponse;
import com.aaudin.springboottutorial.service.BeanScopeTesterService;
import com.aaudin.springboottutorial.service.ColorService;
import com.aaudin.springboottutorial.service.PersonService;
import com.aaudin.springboottutorial.service.PetService;

@RestController
public class TutorialController {

	@Autowired
	private PersonService personService;

	@Autowired
	@Qualifier("dogService")
	private PetService dogService;

	@Autowired
	@Qualifier("catService")
	private PetService catService;
	
	@Autowired
	@Qualifier("beanScopeTesterService1")
	private BeanScopeTesterService beanScopeTesterService1;
	
	@Autowired
	@Qualifier("beanScopeTesterService2")
	private BeanScopeTesterService beanScopeTesterService2;
	
	@Autowired
	private AutowiredOptions autowiredOptions;
	
	@Autowired
	private ComponentWithValuesFromConfig componentWithValuesFromConfig;
	
	@Autowired
	private ColorService colorService;

	@GetMapping("/person/{firstname}/{lastname}")
	public Person createPerson(@PathVariable("firstname") String firstname, @PathVariable("lastname") String lastname) {
		final Person person = personService.createPerson(firstname, lastname);
		return person;
	}

	@GetMapping("/dog")
	public BaseResponse identifyDog() {
		String animal = dogService.identify();
		BaseResponse response = new BaseResponse(animal);
		return response;
	}

	@GetMapping("/cat")
	public BaseResponse identifyCat() {
		String animal = catService.identify();
		BaseResponse response = new BaseResponse(animal);
		return response;
	}
	
	@GetMapping("/sessionScopeDifference")
	public BaseResponse sessionScopeDifference() {
		StringBuilder sb = new StringBuilder();
		sb.append("Session component counts: ");
		sb.append("after calling beanScopeTesterService1: ");
		sb.append(beanScopeTesterService1.countForSession());
		sb.append(", after calling beanScopeTesterService2: ");
		sb.append(beanScopeTesterService2.countForSession());
		return new BaseResponse(sb.toString());
	}
	
	@GetMapping("/prototypeScopeDifference")
	public BaseResponse prototypeScopeDifference() {
		StringBuilder sb = new StringBuilder();
		sb.append("Prototype component counts: ");
		sb.append("after calling beanScopeTesterService1: ");
		sb.append(beanScopeTesterService1.countForPrototype());
		sb.append(", after calling beanScopeTesterService2: ");
		sb.append(beanScopeTesterService2.countForPrototype());
		return new BaseResponse(sb.toString());
	}
	
	@GetMapping("/singletonScopeDifference")
	public BaseResponse singletonScopeDifference() {
		StringBuilder sb = new StringBuilder();
		sb.append("Session component counts: ");
		sb.append("after calling beanScopeTesterService1: ");
		sb.append(beanScopeTesterService1.countForSingleton());
		sb.append(", after calling beanScopeTesterService2: ");
		sb.append(beanScopeTesterService2.countForSingleton());
		return new BaseResponse(sb.toString());
	}
	
	@GetMapping("/autowiringOptions")
	public BaseResponse testAutowiringOptions() {
		return new BaseResponse(autowiredOptions.sumCounts().toString());
	}
	
	@GetMapping("/valueFromConfig")
	public BaseResponse loadValueFromConfig() {
		String valueFromConfig = componentWithValuesFromConfig.getValue();
		return new BaseResponse(valueFromConfig);
	}
	
	@GetMapping("/colors")
	private ColorListResponse loadColors() {
		List<String> colors = colorService.retrieveColors();
		return new ColorListResponse(colors);
	}

}
