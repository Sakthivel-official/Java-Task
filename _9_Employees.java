/*
 3. Write a Java program to create a class called "Employee" with a name, job title, and salary 
      attributes, and methods to calculate and update salary.
 */

public class Employees {
	String name;
	String jobtitle;
	double salary;
	
	Employees (String name,String jobtitle,double salary){
		this.name = name;
		this.jobtitle = jobtitle;
		this.salary = salary;
	}
	
	public double calculateAnnualSalary() {
       	      return salary * 12;  // Assuming monthly salary
    	}
	
	public void updateSalary(double salary) {
		this.salary += salary;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Jobtitle: "+jobtitle);
		System.out.println("Salary: "+salary);
	}

	public static void main(String[] args) {
		Employees e1 = new Employees("Sakthivel","Software Developer",20000);
		Employees e2 = new Employees("Rmana","Software Developer",30000);
		e1.updateSalary(3000);
		double anulsal = e1.calculateAnnualSalary();
		System.out.println("Annual Salary: "+anulsal);
		e1.display();
		e2.display();
	}

}
