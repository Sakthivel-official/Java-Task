
//used - Datatypes, Variables, Scanner-input, Arithmetic Operators, print-Sout,printf

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
    // Q1. Write a Program for Two numbers add,subtract,multiply,divide
		
		int num1 = 100;
		int num2 = 23;
		
		System.out.println("-----Addition----- ");
		System.out.printf("%d + %d = %d", num1, num2, num1 + num2);  //add=num1+num2 printf-is a formated output %d-integer ,num1

		System.out.println("\n---Subtraction---- ");           //\n-used to print in next line
		System.out.printf("%d - %d = %d", num1, num2, num1 - num2);  //sub=num1-num2  

		System.out.println("\n--Multiplication--");
		System.out.printf("%d * %d = %d", num1, num2, num1 * num2);  //multiply=num1*num2

		System.out.println("\n-----Division----- ");
		System.out.printf("%d / %d = %.2f", num1, num2, (float)num1 / num2);  //divide=num1/num2  (float)-is used to convert the datatype 
										    //printf-is a formated output %.2f-floating 2 point ,num1
		
		
	// Q2.Get a input from user int, float, String, double , boolean 
		
		Scanner in=new Scanner(System.in);        //Scanner is used to get input from used 
		
		//gets the Datatypes 
		
		System.out.println("\n\nEnter Your Name: ");  
		String name = in.nextLine();           //String
		
		System.out.println("Enter Your age: ");
		int age = in.nextInt();                //integer
		
		System.out.println("Enter Your Height: ");
		float height = in.nextFloat();         //float
		
		System.out.println("Enter Your Weight: ");
		double weight = in.nextDouble();       //double
		
		System.out.println("Are You Single (true/false): ");
		boolean single = in.nextBoolean();     //boolean
		
		//Printing all the datatypes
		
		System.out.println("\n------>Your Details<------");  //  \n-used to create one more line space
		System.out.println("Name: " + name);    //String
		System.out.println("Age: " + age);      //int
		System.out.println("Height: " + height);//float
		System.out.println("Weight: " + weight);//double
		System.out.println("Single: " + single);//boolean
	}

}
