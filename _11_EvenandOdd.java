
//Q3. Write a Java program to find the number of even and odd integers in a given array of integers.

import java.util.Arrays;

public class EvenandOdd {

	//creating a method to find odd and even number and count of odd and even
	static void findEvenOdd(int[] arr) {   //parameter as array
		String odd = "";     //to add all the odd num in this string
		String even = "";	//to add all even num in this string
		int evenCount = 0;   // for count the even number
		int oddCount = 0;    // count the odd number
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {    // even number -> (num)%2 == 0
				even += arr[i] + "  ";
				evenCount++;     
			}
			else {
				odd += arr[i] + "  ";
				oddCount++;
			}
		}
		
		System.out.println("---------------ODD AND EVEN--------------");
		System.out.println("In this Array "+Arrays.toString(arr));
		System.out.println(oddCount+" ODD Numbers: "+odd);
		System.out.println(evenCount+" EVEN Numbers: "+even);
		System.out.println("-----------------------------------------");
		
	}
	
	public static void main(String[] args) {

		int[] arr = {2,4,23,42,34,45,75};
		findEvenOdd(arr);
		
		int[] arr2 = {32,3,4,24,4,51,4,141,43};
		findEvenOdd(arr2);
		
	}

}
