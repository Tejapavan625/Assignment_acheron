package com.training.basic;
import java.util.Scanner;
import java.util.Arrays;

public class Squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int array[]= new int [size];
		int squareRoot[]= new int [size];


		System.out.println("enter the elements");
		for(int i =0; i<size;i++) {
			array[i]=sc.nextInt();
			squareRoot[i]=(int) Math.sqrt(array[i]);
			
			
		}
		System.out.println(Arrays.toString(squareRoot));
		sc.close();

	}

}
