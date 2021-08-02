package com.training.classobj;

public class Student {
	
        String name;
        int id;
         
        Student(String student,int id){
        	this.name = name;
        	this.id=id;
        }  
          public void getDetails() {
        	  System.out.println("name :"+name+"\nid :"+id);
        	 
        	 
         }
          
         public char getGrades(int[] marks) {
        	 
        	 char grade;
        	 for(int i=0;i<marks.length;i++) {
        		 marks[0]+=marks[i];	 
        	 }
        	 marks[0]/=marks.length;
        	 if(marks[0]>90) {
        		 grade='A';
        	 }else if(marks[0]>80) {
        		 grade='B';
        	 }else {
        		 grade='c';
        	 }
        	 return grade;
        	 
         }
}
