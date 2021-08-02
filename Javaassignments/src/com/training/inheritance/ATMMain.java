package com.training.inheritance;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int balance;
		System.out.println("enter the balance amount:");
		balance=sc.nextInt();
		
		int n;
		System.out.println("Enter the amount\n1 for current account\n2 for saving account");
		n=sc.nextInt();
		
		Bank b=null;
		if(n==1) {
		b=new Current(balance);	
	}else if(n==2) {
		b=new Saving(balance);
		
	}else {
		System.out.println("wrong choice");
	}
		boolean flag=true;
		while(flag) {
			 System.out.println("enter \n1 for withdraw\n2 for deposit\n3 to get balance \n4 exit");
			 int menu=sc.nextInt();
			 switch(menu){
				 case 1:{
					 System.out.println("enter the amount to withdraw");
					 int amount=sc.nextInt();
					 b.withdraw(amount);
					 break;
					 
				}case 2:{
					 System.out.println("enter the amount to deposit");
					 int amount=sc.nextInt();
					 b.deposit(amount);
					 break;
				 
			    }case 3:{
				 System.out.println("enter the amount to get balance: "+b.getBalance());
				 break;
		        }case 4:{
		        	System.out.println("Thak you for using ATM");
		        	flag=false;
		        	break;
		        }
		         default:{
		        	 System.out.println("wrong choice");
		        	 break;
		
		         }
		}

}

	}

}
