// package saturdayTest21_09_24;

import java.util.Scanner;
enum Direction{North,South,East,West};

public class _6_SaturdayTest {

	public static void main(String[] args) {

		
		//Q1. Write a program that displays the sum of n odd natural numbers
		
		int n=10;
		int sum=0;
		
		for(int i=1;i<=n*2;i+=2) {
			sum+=i;
		}
		System.out.println("The sum of "+n+" Odd numbers is: "+sum);
		
		
		//Q2. Write a program to implement an enum called "Direction" with constants
		//    representing the cardinal directions(North,South,East,West);
		
		
		Direction dir;
		dir=Direction.East;
		
		System.out.println(dir);
		
		//Q3. Write a program to compute the body mass index(BMI);
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter you Weight in Kilograms: ");
		double weight=in.nextDouble();
		
		System.out.print("Enter you Height in meters: ");
		double height=in.nextDouble();
		
		double BMI = weight/(height*height);
		
		if(BMI < 18.5) {
			System.out.println("under weight "+BMI);
		}
		else if(18.5 <= BMI && BMI < 24.9) {
			System.out.println("Normal weight");
		}
		else if(BMI >= 25 && BMI <29.9) {
			System.out.println("Over weight");
		}
		else {
			System.out.println("obese");
		}
		
		
		//Q4. Write a program that reads an integer between 0 and 1000 and adds all digits in the integer
		
		
		System.out.println("Enter a Number: ");
		int n1 = in.nextInt();
		int num = n1;
		
		if(1000 < n1) {
			System.out.println("Enter a number between 0 - 1000");
		}
		else {
			int digitcount=0;
			
			while(num > 0) {
				digitcount += num % 10;
				num /= 10;
			}
			
			System.out.println("Sum of "+n1+" Digit is: "+digitcount);
		}
		
		
		//Q5. Write a program that print 500 400 300 200 100 0
		
		DecreaseNum();    //Calling the function
		
	}
	
	
	static int Dnum=500;
	
	static void DecreaseNum() {
		if(Dnum>=0) {
			System.out.println(Dnum);
			Dnum-=100;
			DecreaseNum();    // Recursive function
		}
	} 

}


