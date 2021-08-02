package com.training.classobj;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank(10000);
		int choice;
		System.out.println("Enter Your Choice\n 1. Balance 2. withdraw 3. Deposit  4. Exit");
		do{
			choice =sc.nextInt();
			double balance=b.getBalance();
			switch(choice) {
				case 1:
					System.out.println("Balance in Account: "+
				     b.getBalance());
					break;
					
				case 2:
					System.out.println("Enter Amount to withdraw");
					int amount=sc.nextInt();
					
					if(amount<=balance) {
						
						b.withdraw(amount);
						System.out.println("Total Balance Availble: "+
						b.getBalance());
					}
					
					else {
						System.out.println("Sorry! Insufficient Balance");
					}
					break;
					
				case 3:
					
					System.out.println("Enter Amount to Deposit");
					int bal=sc.nextInt();
					b.deposit(bal);
					System.out.println("Total balance: "+
					b.getBalance());
					break;
					
				case 4:
					System.out.println("Thank you for visiting our ATM");
					break;
				default:
					System.out.println("Wrong choice");
			}
		} 
		while(choice!=0);
		sc.close();
		

	}

}
