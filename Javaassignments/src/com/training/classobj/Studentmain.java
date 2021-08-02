package com.training.classobj;
import java.util.Scanner;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter the id");
		int id=sc.nextInt();
		int marks[]=new int[3];
		System.out.println("enter marks for three subjects");
		for(int i=0;i<3;i++) {
			marks[i]=sc.nextInt();
		}
		Student s1=new Student(name,id);
		Student s2=new Student("pavan",1234);
		int marks2[]= {80,60,30};
		Student s3=new Student("teja",4231);
		int marks3[]= {90,40,50};
		s1.getDetails();
		System.out.println("Grade1: "+s1.getGrades(marks));
		s2.getDetails();
		System.out.println("Grade2: "+s2.getGrades(marks2));
		s3.getDetails();
		System.out.println("Grade3: "+s3.getGrades(marks3));
		sc.close();
		
		

	}

}
