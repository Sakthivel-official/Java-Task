
//Q1.Write a Java program to reverse an array of integer values.

import java.util.Arrays;

public class Reverse_array {
	
	static int[] reverse(int[] arr) {
		
		int start = 0;
		int end = arr.length-1;
		System.out.println("Normal Array: "+Arrays.toString(arr));
		
		while(start<end) {
			//swap
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = {334,24,234,24,3};
		
		int[] revarr = reverse(arr);
		System.out.println("Reversed Array: "+Arrays.toString(revarr));
		
	}

}
