package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta {

	
	private int code;
	
	@JsonProperty("code")
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
}
