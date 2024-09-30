
//Q1. Write a Java program to create an abstract class Employee with abstract
//     methods calculateSalary() and displayInfo(). Create subclasses Manager and Programmer
//	   that extend the Employee class and implement the respective methods to calculate 
//	   salary and display information for each role


abstract class Employe{
	String name;
	double salary;
	int age;
	int id;
	
	Employe(int id,String name,double salary,int age){
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.id = id;
	}
	
	abstract double calculateSalary();
	abstract void displayInfo();
}

class Manager extends Employe{
	double bonus;
	
	Manager( int id, String name, double salary, int age, double bonus){
	super(id, name,salary,age);
	this.bonus = bonus;
	}
	
	double calculateSalary() {
		return salary+bonus;
	}
	
	void displayInfo() {
		
		System.out.println("----------Details About the Manger----------");
		System.out.println("    Id    : "+id);
		System.out.println("    Name  : "+name);
		System.out.println("    Salary: "+calculateSalary());
		System.out.println("    Age   : "+age);
		System.out.println("--------------------------------------------");
	}
	
}

class Programmer extends Employe{
	
	Programmer(int id,String name, double salary, int age){
		super(id,name,salary,age);
	}
	
	
	double calculateSalary() {
		return salary*12;
	}

	void displayInfo() {
		System.out.println("-----------Details About the Programmer----------");
		System.out.println("    ID    : "+id);
		System.out.println("    Name  : "+name);
		System.out.println("    Salary: "+salary);
		System.out.println("    Age   : "+age);
		System.out.println("--------------------------------------------------");
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {

		Employe e1;   //id,name ,salary,age,bonus
		e1 = new Manager(1,"Sakthi",3000,19,200);
		e1.displayInfo();
		System.out.println(e1.calculateSalary());//it computes salary + bonus for the Manger
		
						//id,name ,salary,age,	
		e1 = new Programmer(2,"Naveen Reddy",4000,32);
		e1.displayInfo();
		System.out.println("Annual Salary: "+e1.calculateSalary());// it computes the Annual salary for Programmers
		
		
	}

}
