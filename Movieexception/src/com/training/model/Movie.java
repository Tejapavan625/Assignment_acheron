package com.training.model;

public class Movie {
	private int rank;
	private double budget;
	private String  name;
	private int rating;
	
	public Movie(int rank, double budget, String name, int rating) {
		super();
		this.rank = rank;
		this.budget = budget;
		this.name = name;
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Movie [rank=" + rank + ", budget=" + budget + ", name=" + name + ", rating=" + rating + "]";
	}

	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	

}
