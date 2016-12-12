package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

	private String username;
	private String bio;
	private String website;
	private String profile_picture;
	private String full_name;
	private Counts counts;
	private String id;

	@JsonProperty("username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@JsonProperty("bio")
	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	@JsonProperty("website")
	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@JsonProperty("profile_picture")
	public String getProfile_picture() {
		return profile_picture;
	}

	public void setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
	}

	@JsonProperty("full_name")
	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	@JsonProperty("counts")
	public Counts getCounts() {
		return counts;
	}

	public void setCounts(Counts counts) {
		this.counts = counts;
	}

	@JsonProperty("id")	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
