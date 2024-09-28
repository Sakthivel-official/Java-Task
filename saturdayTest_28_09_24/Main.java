package saturdayTest_28_09_24;

// Q1. Write a Java program to create a class called "Vehicle" with attributes 
//		 for make, model, and year. Create subclasses "Car" and "Truck" that add specific attributes
// 		 like trunk size for cars and payload capacity for trucks. Implement a method to display vehicle details in each subclass.


class Vechicle{   //super class
	String make;
	String model;
	int year;
	
	Vechicle(String make, String model, int year){ //parameterized constructor to initialize the object/field
		this.make = make;
		this.model = model;
		this.year = year;
	}
}

class Car extends Vechicle{ //sub class
	double trunk;
	
	Car(String make, String model, int year, double trunk){
		super(make,model,year);  //super() is used to call the super class constructor in subclass
		this.trunk = trunk;
	}
	
	void display() {
		System.out.println("-------Car Details--------");
		System.out.println("Make: "+make);  // access the super class field/data
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
		System.out.println("Trunk: "+trunk);
	}
}

class Truck extends Vechicle{ // sub class 
	String capacity;
	
	Truck(String make,String model,int year,String capacity){
		super(make,model,year);
		this.capacity = capacity;
	}
	
	void display() {
		System.out.println("-------Truck Details--------");
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
		System.out.println("PayLoad Capacity: "+capacity);
	}
}

public class Main {

	public static void main(String[] args) {

		Car c1 = new Car("Benz","b-12",2012,20);
		c1.display();
		
		Truck t1 = new Truck("Ford","F-120",2013,"1.5 Ton");
		t1.display();
	}

}
