
/*3. Write a Java program to create a class called "Rectangle"   
      with width and height attributes. Calculate the area and perimeter of the rectangle.

  
*/

public class Rectangle {
	double width;
	double height;
	
	Rectangle(double width,double height){
		this.width = width;
		this.height = height;
	}
	
	
	//Area = height * width
	void Area() {
		double area = height * width;
		System.out.println("Width: "+width+"\nHeight: "+height+"\nThe Area of Rectangle: "+area);
	}
	
	//Peremeter = (height + width)*2
	void peremeter() {
		double peremeter = (height + width)*2;
		System.out.println("The Peremeter of Rectangle: "+peremeter);
	}
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(23,54);
		r1.Area();
		r1.peremeter();
		
		Rectangle r2 = new Rectangle(43,54);
		r2.Area();
		r2.peremeter();
		
	}

}
