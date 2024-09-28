package saturdayTest_28_09_24;

// Q2. Write a Java program to create a class called "Course" with attributes for 
//		course name, instructor, and credits. Create a subclass "OnlineCourse" that adds 
//		attributes for platform and duration. Implement methods to display course details and check 
//		if the course is eligible for a certificate based on duration.


class Course{
	String name;
	String instructor;
	String credits;
	
	Course(String name,String instructor,String credits){
		this.name = name;
		this.instructor = instructor;
		this.credits = credits;
	}
	
}

class OnlineCourse extends Course{
	String platform;
	double duration;
	static int dura;
	
	static {  //static block is used to initialize the static variable, here dura is a static variable = 4months duration
		dura = 4;
	}
	
	OnlineCourse(String name,String instructor,String credits, String platform,double duration){
		super(name,instructor,credits);
		this.platform = platform;
		this.duration = duration;
	}
	
	public void display() {
		System.out.println("-----------Course Details-----------");
		System.out.println("    Name      : "+name);
		System.out.println("    Instructor: "+instructor);
		System.out.println("    Credits   : "+credits);
		
		System.out.println("----------Online Course Details-----");
		System.out.println("    Platform  : "+platform);
		System.out.println("    Duration  : "+duration);
	}
	
	public void isEligible() {
		if(duration >= dura && 0 < duration) {
			System.out.println(" Congrats! :) You are eligible for 'Certification' ");
		}
		else {
			System.out.println(" Sorry :( You are not eligible for 'Certification' because You Spending Only "+duration+"Months");
		}
	}
	
}

public class Main1 {

	public static void main(String[] args) {

		OnlineCourse c1 = new OnlineCourse("Java fs","Mohana priya","good","Google meet",4);
		c1.display();
		
		c1.isEligible();
		
	}

}
