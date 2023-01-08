package com.upskill.java_1;

public class MethodType {

	/* Types of Methods
	 
	  1.Void Method
	  2.Static Method
	  3.Return Type Method
	   
	 */
	public static int hourlyIncome = 75;
	
	public static void main(String[] args){
		MethodType obj = new MethodType();
		 obj.annualIncomeVoid();
		 
		 System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());
		 
		 weeklyIncomeStatic();
	}

  //Void Method
	public void annualIncomeVoid(){
		int calculateAnnualIncmoe = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncmoe);
	}
    
	//Static Method
	public static void weeklyIncomeStatic(){
		int calculateAnnualIncmoe = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateAnnualIncmoe);
	}
	//return type Method
	 public int monthlyIncomeReturn(){
		 int calculateMonthlyIncome  = hourlyIncome * 180;
		 return calculateMonthlyIncome;
	 }
	 
 }	 