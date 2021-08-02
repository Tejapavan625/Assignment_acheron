package com.training.basic;
import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the elements");
		a=sc.nextInt();  
		b=sc.nextInt();  
		c=sc.nextInt();  
		
		 if (a<b && a<c) {
			 System.out.println("a is smaller");
		 }else if(b<c && b<a){
			 System.out.println("b is smaller"); 
		 }else{
			 System.out.println("c is greater");
			 }

	}

}
