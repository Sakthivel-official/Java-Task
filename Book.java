
/*Constructor Overloading
	3. Write a Java program to create a class called "Book" with instance variables title, author, and price. 
		Implement a default constructor and two parameterized constructors:
		
	One constructor takes title and author as parameters.
	The other constructor takes title, author, and price as parameters.
	Print the values of the variables for each constructor.*/

public class Book {
	String title;  // fields / state
	String author;
	int price;
	
	//Constructor Overloading
	Book() {};  //default constructor
	
	Book(String t,String a){  //parameterized constructor
		title = t;
		author = a;
	}
	
	Book(String t,String a,int p){
		title = t;
		author = a;
		price = p;
	}
	
	void display() {  //method / behavier
		System.out.println("------------->Book Details<-------------");
		System.out.println("     Title : "+title);
		System.out.println("     Author: "+author);
		System.out.println("     Price : "+price);
	}
	void getTitle() {
		System.out.println("Title :"+title);
	}
	void getAuthor() {
		System.out.println("Author : "+author);
	}
	void getPrice() {
		System.out.println("Price : "+price);
	}

	public static void main(String[] args) {

		//invoke the default constructor
		Book b = new Book();
		b.display();
		
		//invoke the 2 parameter constructor
		Book b1 = new Book("Atomic Habits","James Clear",500);
		b1.getTitle();
		b1.display();
		
		//incoke the 3 parameter constructor
		Book b2 = new Book("Thinking, Fast and Slow","Daniel Kahneman");
		b2.display();
		
	}

}
