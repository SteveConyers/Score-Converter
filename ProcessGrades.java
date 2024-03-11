//ProcessGrades.java by Steven Conyers - 2/2/22

// This program demonstrates a user controlled loop
// by using a DO WHILE loop

import java.util.Scanner;



public class ProcessGrades
{
   public static void main(String[] args)
   {
      String input;			// To hold keyboard input
      int grade = 0;		//Variable
      char repeat;			// Holds 'y' or 'n'
	  int totalPass = 0;
	  int totalFail = 0;
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Welcome to the Letter Grade Converter");
	  System.out.println("by Steven Conyers\n");

do
{
	// Get the numeric grade.
	 System.out.print("Enter numerical grade: ");
     grade = keyboard.nextInt();
	 
while (grade < 0 || grade > 100)
{
	System.out.println("Grade can only be 0 to 100");
	System.out.print("Enter correct numerical grade: ");
	grade = keyboard.nextInt();
}
	
	if (grade <= 59)
	{
		System.out.println("Letter grade: E \n");
	}
	else if (grade >= 60 && grade <= 69)
	{
		System.out.println("Letter grade: D \n");
	}
	else if (grade >= 70 && grade <= 79)
	{
		System.out.println("Letter grade: C \n");
	}
	else if (grade >= 80 && grade <= 89)
	{
		System.out.println("Letter grade: B \n");
	}
	else
	{
		System.out.println("Letter grade: A \n");
	}
	
	if (grade > 59)
	{
		totalPass++; 
	}
	else
	{
		totalFail++;
	}
	
    // Does the user want to average another set?
    System.out.print("Continue? [y/n]: ");
    input = keyboard.next();     // Read a string.
    repeat = input.charAt(0);    // Get the first char.
	
	System.out.println();		  //Blank line for out spacing
	
}while (repeat == 'Y' || repeat == 'y');
	
	System.out.println("The nuumber of passing grades: " + totalPass);
	
	System.out.println("The number of failing grades:  " + totalFail);
   }
}