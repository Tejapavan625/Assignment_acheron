package com.training.classobj;

public class Vehicle {
	 String name;
	 String model;
	 int price;
	 
	 Vehicle(String name,String model,int price){
		 this.name=name;
		 this.model=model;
		 this.price=price;
		 
		 
	 }
	 
	
	
	void getDetails() {
		 System.out.println("name: "+name);
		 System.out.println("model: "+model);
		 System.out.println("price: "+price);
		
	 }
	 

}
