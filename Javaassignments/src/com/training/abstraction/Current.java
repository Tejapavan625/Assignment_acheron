package com.training.abstraction;

public class Current extends Bank {
	
	Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(balance>=amount/2) {
			balance=balance-amount/2;
			System.out.println("Available Blance after withdraw:"+balance);
		}else {
			System.out.println("Available balnce is Less than amt to withdraw");
		}
		
		
		
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		balance=balance+amount/2;
		System.out.println("Available Balance:"+balance);
	
		
	}

}
