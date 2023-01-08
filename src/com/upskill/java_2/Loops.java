package com.upskill.java_2;

public class Loops {

/*
	 1. For Loops
	 2. While Loop
	 3. Do While Loop
	 4. Infinite Loop
 */
	public static void main(String[] args) {
		
     practiceForLoop();
     practiceWhileLoop();
     practiceDoWhileLoop();
     practiceInfiniteLoop();
     practiNestedForLoop();
	}
	
	public static void practiceForLoop(){              // For Loop - Do again and again upto condition upper filled	
	int i;                                             // Initialize the variable
	for(i=10; i>=1;i--){                              //Setting lower limit, Upper limit, Increment or Decrement
	System.out.println("For Loops number = " + i);     // Statement
			
			
		}
     
	}
	public static void practiceWhileLoop(){          // While Loop - Do again and again upto condition  filled	
	int i =1;                                         // Initialize the variable
	while(i<=10){                                      // Setting Condition
	System.out.println("While Loops number = " + i);    // Statement
			i++;                                      // Increment or decrement 
		}
			 
	}
	public static void practiceDoWhileLoop(){         // Do While Loop - Do action then match condition	
		int i = 1;                                       // Initialize the variable
		do{
System.out.println("Do While Loops number = " + i);     // Statement
			i++;                                        // Increment or decrement 
		}while (i<=100);                               //Checking condition
			
	}
	public static void practiceInfiniteLoop(){       // Infinite Loop - never ending loop
		int i;                                        //Initialize the variable
		for (i=1; ; i++){                             // Setting No Upper limit
System.out.println(" Infinite Loops number = " + i);  // Statement 
			
		}
		
	}
	
	public static void practiNestedForLoop(){      //Nested Loop - loop inside another loop
		int i;                                     //Initialize i for loop 1
		int j;                                    //Initialize j for  loop 2
		for (i=1; i<=10; i++){                    //First loop for i
			for (j=1; j<=10; j++){                // Second loop j
				int multipicationTable = i * j;    //Statement for loop 2
	System.out.println(multipicationTable + " ");
			}
			System.out.println( " ");             //Statement for loop 1
				
			}
		}
		
	}
	
