
/*  2. Write a Java program to create a class called "Person" with a name and age attribute. 
Create two instances of the "Person" class, set their attributes using 
the constructor, and print their name and age */

public class Person {
	String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	public static void main(String[] args) {

		Person p1 = new Person("Sakthivel",19);
		p1.display();
			
		Person p2 = new Person("Ramana ",20);
		p2.display();
	}

}
