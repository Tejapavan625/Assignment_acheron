package com.training.classobj;

public class Bank {
	
	double balance;
	 Bank(double balance){
		 this.balance=balance;
		 
	 }
	  public void withdraw(int x) {
		  balance=balance-x;
		  
	  }
      
	  public void deposit(int x) {
		  balance=balance+x;
		  
	  }
	  public double getBalance() {
		  return balance;
		  
	  }
}
