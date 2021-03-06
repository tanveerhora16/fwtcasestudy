package com.yash.mbs.domain;

import java.util.List;

;

public class Screen {

	private int screenId;
	private String screenName;
	Movie movie;
	private List<Show> show;

	public Screen(int i, String name) {
		this.screenId = i;
		this.screenName = name;
	}

	public List<Show> getShow() {
		return show;
	}

	public void setShow(List<Show> show) {
		this.show = show;
	}

	public Screen(int screenId, String screenName, Movie movie) {
		super();
		this.screenId = screenId;
		this.screenName = screenName;
		this.movie = movie;
	}

	public Screen() {
		// TODO Auto-generated constructor stub
	}

	public int getScreenId() {
		return screenId;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", screenName=" + screenName + "]";
	}

}
