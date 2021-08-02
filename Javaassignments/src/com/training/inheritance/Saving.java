package com.training.inheritance;

public class Saving extends Bank {

	Saving(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(balance>=amount) {
			balance=balance-amount;
			System.out.println("Available Blance after withdraw:"+balance);
		}else {
			System.out.println("Available balnce is Less than amt to withdraw");
		}
	    
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		balance=balance+amount;
		System.out.println("Available Balance:"+balance);
	
		
	}

}
