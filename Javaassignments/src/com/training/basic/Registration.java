package com.training.basic;
import java.util.Scanner;

public class Registration {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a=new String[] {"Teja", "raj", "pavan"};
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter user name to login");
		String name = sc.nextLine();
		boolean flag=true;
		for(int i=0;i<3;i++) {
			if(name.equalsIgnoreCase(a[i])) {
				System.out.println("You are logged in successfully");
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("Invalid Username");
			
		}
		sc.close();	



	}

}
