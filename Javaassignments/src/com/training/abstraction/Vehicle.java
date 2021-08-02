package com.training.abstraction;


public abstract class Vehicle extends Accesory {
	String model;
	int price;
	 
	Vehicle(String model,int price){
		this.model=model;
		this.price=price;
		}

	abstract void getMilage();
	void getDetails() {
		System.out.println("model of vehicle "+model);
		System.out.println("price of vehicle "+price);
	
}
}