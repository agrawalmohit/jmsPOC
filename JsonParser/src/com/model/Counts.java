package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Counts {

	private int media;

	private int followed_by;

	private int follows;

	@JsonProperty("media")
	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}

	@JsonProperty("followed_by")
	public int getFollowed_by() {
		return followed_by;
	}

	public void setFollowed_by(int followed_by) {
		this.followed_by = followed_by;
	}

	@JsonProperty("follows")
	public int getFollows() {
		return follows;
	}

	public void setFollows(int follows) {
		this.follows = follows;
	}

}
