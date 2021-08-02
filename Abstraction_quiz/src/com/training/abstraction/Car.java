package com.training.abstraction;



public class Car extends Vehicle{
	
	Car(String model, int price) {
		super(model, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getMilage() {
		System.out.println("in car method");
		// TODO Auto-generated method stub
		
	}

	@Override
	void internal() {
		// TODO Auto-generated method stub
		System.out.println("internal maethod");
		
	}

	@Override
	void external() {
		// TODO Auto-generated method stub
		System.out.println("external maethod");
		
	}
	

}
