
//1. write a program to print employee details using constructor(empid,empname,empsal,empage,empdistioga);
//2. create a class dog with instance variable name,color. implement a parameterized that takes name,color as parameter and initialize the instance variable
//   print the values the variable
public class Employee {
	int empid;
	String empname;
	double empsal;
	int empage;
	String designation;
	
	Employee(int i,String n,double sal,int age,String d){
		empid = i;
		empname = n;
		empsal = sal;
		empage = age;
		designation = d;
	}
	
	void display() {
		System.out.println("Employee Id: "+empid);
		System.out.println("Employee Name: "+empname);
		System.out.println("Employee Salary: "+empsal);
		System.out.println("Employee Age: "+empage);
		System.out.println("Employee Designation: "+designation);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Sakthivel",20000,19,"SDE-1");
		Employee e2 = new Employee(2,"Ronaldo",200000,21,"SDE-3");
		e1.display();
		e2.display();
	}

}
