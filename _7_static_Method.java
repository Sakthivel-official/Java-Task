
public class _07_static_Method {
	
	//Q1. to print add two numbers using static method 
	//Q2. to print two numbers using public method
	
	static int a ;
	static int b;
	
	static void StaticAdd() {
		System.out.println("Static Method -> Addition of : "+a+" and "+b+" is: "+(a+b));
	}

	public void Add() {
		System.out.println("public Method -> Addition of : "+a+" and "+b+" is: "+(a+b));
	}
	public static void main(String[] args) {

		
		a = 22; // a,b is static variable we can directly access the variables  
		b = 30;
		
		StaticAdd();  // access the static method directly
		
		_7_static_Method add = new _7_static_Method(); //creating a object for class to access non-static method
		
		add.Add(); //access the public method using object
		
	}

}
