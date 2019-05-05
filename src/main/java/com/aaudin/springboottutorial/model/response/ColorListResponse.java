package com.aaudin.springboottutorial.model.response;

import java.util.List;

public class ColorListResponse {
	
	private List<String> colors;
	
	public ColorListResponse() {
	}
	
	public ColorListResponse(List<String> colors) {
		this.colors = colors;
	}
	
	public List<String> getColors() {
		return colors;
	}
	
	public void setColors(List<String> colors) {
		this.colors = colors;
	}
}
