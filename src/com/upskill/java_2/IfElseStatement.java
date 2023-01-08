package com.upskill.java_2;

public class IfElseStatement {

	public static void main(String[] args) {

	int age = 8;
	int uber = 150;
		
		if(age<= 13){
			System.out.println("You are children");
		} else if (age > 13 && age <18){
			System.out.println("You are Teenager");
		} else if (age>=60){
		 if (age <100){
			 System.out.println("You are Senior ");
		 } else
			 System.out.println("You are Champion ");
			
	 } else {
			
			System.out.println("You are adult");
		}

	

  if (uber<=100){
	  System.out.println("Bad day for me");
  }else if ( uber > 100 &&  uber <200){
	  System.out.println(" God day");
	  
	 } else{

			System.out.println("You are adult");
		}

	 }
  }

