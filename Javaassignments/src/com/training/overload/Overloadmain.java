package com.training.overload;

import java.util.Scanner;

public class Overloadmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Employee name:");
		String name=sc.nextLine();
		System.out.println("enter the designation(Manager,Programmer,Director)");
		String designation=sc.nextLine();
		Employee e1= new Employee(name,designation);
		double bonus=0;
		if(designation.equalsIgnoreCase("programmer")) {
			bonus=e1.calcBonus(10000);
			System.out.println("Name:"+e1.name);
			System.out.println("Bonus :"+bonus);
		}else if(designation.equalsIgnoreCase("Manager")) {
			bonus=e1.calcBonus(10000,50000);
			System.out.println("Name:"+e1.name);
			System.out.println("Bonus :"+bonus);
			
		}else if(designation.equalsIgnoreCase("Director")) {
			bonus=e1.calcBonus(10000, 50000, 6000);
			System.out.println("Name:"+e1.name);
			System.out.println("Bonus :"+bonus);
		}else {
			System.out.println("choose the correct option");
		}
			sc.close();	
		
		

	}

}
