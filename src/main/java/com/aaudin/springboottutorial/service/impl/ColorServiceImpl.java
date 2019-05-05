package com.aaudin.springboottutorial.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.aaudin.springboottutorial.service.ColorService;

@Service
public class ColorServiceImpl implements ColorService {
	
	//Read property multiple.values from application.properties and creates an array of string (using comma as delimiter)
	@Value("${multiple.values}")
	private String[] colors;

	@Override
	public List<String> retrieveColors() {
		return Arrays.asList(colors);
	}

}
