package saturdayTest_28_09_24;

// Q5. Write a Java program to create a class called "Person" with a name and age attribute. 
//		Create two instances of the "Person" class, set their attributes using
//		the constructor, and print their name and age.

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
}

public class Main4 {

	public static void main(String[] args) {

		Person p1 = new Person("Sakthivel",19);
		
		System.out.println("Name: "+p1.name);
		System.out.println("Age : "+p1.age);
		
	}

}
