

//Q4. Write a Java program to find the largest of two nos

import java.util.Scanner;

public class LargestofTwoNum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Number1: ");
		int n1 = in.nextInt();
		System.out.print("Enter Number2: ");
		int n2 = in.nextInt();
		
		if(n1 > n2) 
			System.out.println("Number 1 is Largest: "+n1);
		else if(n2 > n1) 
			System.out.println("Number 2 is Largest: "+n2);
		else 
			System.out.println("Both are equal..");
		
		in.close();
		
	}

}
