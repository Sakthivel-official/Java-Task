package saturdayTest_28_09_24;

//Q4. Write a Java program to create a class called "Shape" with abstract methods
//	   for calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".




abstract class Shape{
	abstract void area();
	abstract void primeter();
}

//# Rectangle
//area_rectangle = l * w             # Area of a rectangle
//perimeter_rectangle = 2 * (l + w)   # Perimeter of a rectangle
//

class Rectangle extends Shape{
	
	double length;
	double width;
	
	Rectangle(double len,double wed){
		length = len;
		width = wed;
	}

	@Override
	public void area() {
		double area = length * width;
		System.out.println("The Area of Rectangle is: "+area);
	}

	@Override
	public void primeter() {
		double primeter = 2*(length+width);
		System.out.println("The Primeter of Rectangle is: "+primeter);
	}
	
}

//area_circle = 3.14159 * r**2       # Area of a circle
//perimeter_circle = 2 * 3.14159 * r  # Perimeter (Circumference) of a circle
//

class Circle extends Shape {

	double radius;
	
	Circle(double rad){
		radius = rad;
	}
	@Override
	void area() {
		double area = Math.PI *radius *radius;
		System.out.println("The Area of Circle is: "+area);
	}

	@Override
	void primeter() {
		double primeter = 2 * Math.PI * radius;
		System.out.println("The Primeter of circle is: "+primeter);
	}
	
}

//# Triangle
//area_triangle = 0.5 * b * h         # Area of a triangle
//perimeter_triangle = a + b + c      # Perimeter of a triangle

class Triangle extends Shape{

	double base;
	double height;
	double sideA;
	double sideB;
	double sideC;
	
	Triangle(double b,double h,double sa,double sb,double sc){
		base = b;
		height = h;
		sideA = sa;
		sideB = sb;
		sideC = sc;
	}
	
	@Override
	void area() {
		double area = 0.5 * base * height;
		System.out.println("The Area of Triangle is: "+area);
	}

	void primeter() {
		double primeter = sideA + sideB+ sideC;
		System.out.println("The Primeter of Triangle is: "+primeter);
	}
	
}

public class Main3 {

	public static void main(String[] args) {
		
		Shape r1 = new Rectangle(43,53);
		r1.area();
		r1.primeter();
		
		Shape c1 = new Circle(34);
		c1.area();
		c1.primeter();
		
		Shape t1 = new Triangle(2,3,4,5,6);
		t1.area();
		t1.primeter();

	}

}
