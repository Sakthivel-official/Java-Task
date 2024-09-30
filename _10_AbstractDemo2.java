
//Q2. Write a Java program to create an abstract class Vehicle with abstract
//     methods startEngine() and stopEngine(). Create subclasses Car and Motorcycle 
//     that extend the Vehicle class and implement the respective methods to start
//     and stop the engines for each vehicle type.

abstract class Vehicle{
	
	abstract void startEngine();
	abstract void stopEngine();
	
}

class Car extends Vehicle{
	
	void startEngine() {
		System.out.println("Car Engine Started.....");
	}
	
	void stopEngine() {
		System.out.println("Car Engine Stoped....");
	}
}

class Motorcycle extends Vehicle{

	void startEngine() {
		System.out.println("Motorcycle Engine Started>>>");
	}

	void stopEngine() {
		System.out.println("Motorcycle Engine Stoped>>>");
		
	}	
	
}


public class AbstractDemo2 {

	public static void main(String[] args) {
		
		Vehicle c1 = new Car();
		c1.startEngine();
		
		Vehicle m1 = new Motorcycle();
		m1.startEngine();
		
		m1.stopEngine();
		c1.startEngine();
		c1.stopEngine();
	}

}
