package com.aaudin.springboottutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.aaudin.springboottutorial.model.Person;
import com.aaudin.springboottutorial.model.response.BaseResponse;

@RestController
public class TutorialController {

	@GetMapping
	public BaseResponse basicGet() {
		return new BaseResponse("Basic GET request");
	}
	
	@PostMapping
	public BaseResponse postWithRequest(@RequestBody Person person) {
		String message = "You passed person " + person.toString();
		return new BaseResponse(message);
	}
	
	@GetMapping("/{id}")
	public BaseResponse getWithPathParam(@PathVariable("id") String id) {
		String message = "You passed value " + id;
		return new BaseResponse(message);
	}
	
	@GetMapping("/withHeader")
	public BaseResponse basicGetWithHeader(@RequestHeader("name") String name) {
		String message = "You passed header " + name;
		return new BaseResponse(message);
	}
}
