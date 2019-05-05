package com.aaudin.springboottutorial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.aaudin.springboottutorial.model.response.UserResponse;
import com.aaudin.springboottutorial.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	//Loads the url of the service from the application.properties file
	@Value("${service.url}")
	private String url;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public UserResponse retrieveUser() {
		//The responses entity is a wrapper that contains both the returned http status code as well as the response body. 
		//If you do not care about the http status code you can use getForObject instead
		//RestTemplate also supports post, put, delete and patch.
		ResponseEntity<UserResponse> responseEntity = restTemplate.getForEntity(url, UserResponse.class);
		if(responseEntity.getStatusCode().is2xxSuccessful()) {
			return responseEntity.getBody();
		}
		else {
			throw new RuntimeException("An error happened while loading the user");
		}
	}

}
