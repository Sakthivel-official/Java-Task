
//2. create a class dog with instance variable name,color. implement a parameterized that 
//  takes name,color as parameter and initialize the instance variable print the values the variable
public class Dog {

	
	String name;
	String color;
	
	Dog(String n,String c){
		name = n;
		color = c;
	}
	
	void display() {
		System.out.println("Dog Name: "+name);
		System.out.println("Dog Color: "+color);
	}
	
	public static void main(String[] args) {

		Dog d1 = new Dog("Rocky","black");
		d1.display();
		
	}

}
