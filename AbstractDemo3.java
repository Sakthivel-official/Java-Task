//Q3. Write a Java program to create an abstract class Person with abstract 
//	  methods eat() and exercise(). Create subclasses Athlete and LazyPerson 
//	  that extend the Person class and implement the respective methods to describe
abstract class Person{
	abstract void eat();
	abstract void exercise();
}

class Athlete extends Person{
	int eat;
	int exercise;
	
	Athlete(){
		System.out.println("Athlete");
	}
	void eat() {
		System.out.println("Eating....");
		eat++;
	}
	void exercise() {
		System.out.println("Exercising....");
		exercise++;
	}
	
	void calculate() {
		System.out.println("-----------Athlete-----------");
		System.out.println("    Eat     : "+eat+" times");
		System.out.println("    Exercise: "+exercise+" times");
		System.out.println("-----------------------------");
	}
}

class LazyPerson extends Person{
	int eat;
	int exercise;
	
	LazyPerson(){
		System.out.println("LazyPerson");
	}
	
	void eat() {
		System.out.println("Eating....");
		eat++;
	}
	void exercise() {
		System.out.println("Exercising....");
		exercise++;
	}
	
	void calculate() {
		System.out.println("------------LazyPerson-----------");
		System.out.println("    Eat     : "+eat+" times");
		System.out.println("    Exercise: "+exercise+" times");
		System.out.println("---------------------------------");
	}
}

public class AbstractDemo3 {

	public static void main(String[] args) {
		
		Athlete p1 = new Athlete();
		p1.eat();
		p1.eat();
		p1.eat();
		p1.exercise();
		p1.calculate();
		
		LazyPerson l1 = new LazyPerson();
		l1.eat();
		l1.eat();
		l1.exercise();
		l1.calculate();

	}

}
