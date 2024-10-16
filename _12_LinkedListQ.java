
import java.util.*;
public class LinkedListQ {

	public static void main(String[] args) {

		
		LinkedList<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("Japan");
		countries.add("Portugal");
		countries.add("Brazil");
		countries.add("United States");
		countries.add("Canada");
		System.out.println(countries);
		
	 //	Q1. Write a Java program to remove a specified element from a linked list.
		
		countries.remove("Brazil");
		System.out.println("Q1: "+countries);
		
	//	Q2. Write a Java program to append the specified element to the end of a linked list.
		
//		countries.add(countries.getLast()+" & Denmark");
		countries.add("Denmark");
		System.out.println("Q2: "+countries);
		
	//	Q3 & Q4. Write a Java program to insert the specified element at the 
		//         end of a linked list.
		
		countries.addLast("Maldives");
		System.out.println("Q3: "+countries);
	}
	

}
