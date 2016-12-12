package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	private Meta meta;

	private Data data;

	@JsonProperty("meta")
	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	@JsonProperty("data")
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}
