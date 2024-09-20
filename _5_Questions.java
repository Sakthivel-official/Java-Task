import java.util.Scanner;

public class _5_Questions {

	public static void main(String[] args) {

		//1. Write a program to print username, age, address, pin code using while
		
		String name = "Sakthivel";
		int age = 19;
		String address = "7, subramaniyar Kovil street, pudupalayam";
		int pincode = 606705;
		
		while(true) {
			System.out.println("UserName : " + name);
			System.out.println("Age : " + age);
			System.out.println("Address : " + address);
			System.out.println("Pin-Code : " + pincode);
			break;
		}
		
		
		//2. Write a program to print 1 to 5 using if
		
		int a = 1;
		if(a>0) {
			System.out.println(a);
			a++;
			System.out.println(a);
			a++;
			System.out.println(a);
			a++;
			System.out.println(a);
			a++;
			System.out.println(a);
		}
		
		
		//3. Write a program to print greatest among three numbers
	
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Number 1: ");
		int n1=in.nextInt();	
		
		System.out.println("Enter Number 2: ");
		int n2=in.nextInt();
		
		System.out.println("Enter Number 3: ");
		int n3=in.nextInt();	
		
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("Number 1 is greatest: "+n1);
		}
		else if(n2 >= n1 && n2 > n3) {
			System.out.println("Number 2 is greatest: "+n2);
		}
		else if(n3 > n1 && n3 >= n1) {
			System.out.println("Number 3 is greatest: "+n3);
		}
		else {
			System.out.println("Numbers are Equal! ");
		}
		
		
		//4. Write a program to print greatest of two numbers using if
		
		int num1=54;
		int num2=54;
		
		if(num1>num2) {
			System.out.println("Number 1 is Greatest: "+num1);
		}
		
		if(num2>num1) {
			System.out.println("Number 2 is Greatest: "+ num2);
		}
		
		if(num1==num2) {
			System.out.println("Equal");
		}
		
		
		//5. Write a program to print Week days switch 1-monday.....
		
		System.out.println("Enter a Day :");
		int day = in.nextInt();
		in.close();
		
		switch(day) {
			case 1:
				System.out.println("1. Monday");
				break;
			case 2:
				System.out.println("2. Tuesday");
				break;
			case 3:
				System.out.println("3. Wednesday");
				break;
			case 4:
				System.out.println("4. Thursday");
				break;
			case 5:
				System.out.println("5. Friday");
				break;
			case 6:
				System.out.println("6. Saturday");
				break;
			case 7:
				System.out.println("7. Sunday");
				break;
			default:
				System.out.println("Enter a Day 1 to 7!");
		}
		
		
		
		//6. Write a program 10 to 1 using if
		
		int num=10;
		
		if(num>0) {
			
			System.out.println(num);
			num--;
			System.out.println(num);
			num--;
			System.out.println(num);
			num--;
			System.out.println(num);
			num--;
			System.out.println(num);
			num--;
			System.out.println(num);
			num--;
			System.out.println(num);
			num--;
			System.out.println(num);
			num--;
			System.out.println(num);
			num--;
			System.out.println(num);	
			
		}
		
	}

}
