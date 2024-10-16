

import java.util.*;
public class ListQuestions {
	

	public static void main(String[] args) {

		List<String> studentName = new ArrayList<>();
		
		studentName.add("Sakthi");
		studentName.add("Arun");
		studentName.add("Bala");
		studentName.add("Murali");
		studentName.add("Muthu");
		studentName.add("Mari");
		System.out.println(studentName);
		
//		   0       1    2      3       4     5
//		[Sakthi, Arun, Bala, Murali, Muthu, Mari]
		
		//Q1. Write a Java program to remove the third element from an array list.
		
		studentName.remove(2);
		System.out.println("After Removing Third Element: \n"+studentName);
		
		
		
		
		//Q2. Write a Java program to add  the second element into to an array list.
		
		studentName.add(1,"Varun");
		System.out.println("After Adding an Element in Second Position: \n"+studentName);
		
		
		//Q3. Write a Java program to print all the elements of an ArrayList using the elements' position.
		
		System.out.println("Printing All the Element");
		for(int i = 0; i < studentName.size(); i++) {
			System.out.println((i+1)+". "+studentName.get(i));
		}
		
		
		//Q4. Write a Java program to replace the second element of an ArrayList with 
		//	the specified element
		
		studentName.set(1, "Ram");
		System.out.println("Replace the Second element: \n"+studentName);
	}

}
