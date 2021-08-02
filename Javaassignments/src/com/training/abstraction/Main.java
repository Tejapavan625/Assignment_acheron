package com.training.abstraction;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter model");
		String model=sc.nextLine();
		System.out.println("enter the price");
		int price=sc.nextInt();
		
		Accesory a=new Car(model,price);
		a.internal();
		a.external();
		 
		Vehicle v=(Vehicle)a;
		v.getDetails();
		v.getMilage();	
		
		

	}

}
