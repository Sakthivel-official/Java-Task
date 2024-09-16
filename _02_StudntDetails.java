import java.util.Scanner;

public class _02_StudntDetails {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		StudentDetails student=new StudentDetails();  //create a object
		
		System.out.print("Enter Student id: ");
		int id=in.nextInt();
		
		System.out.print("Enter Student Name: ");
		String name=in.next();
		
		System.out.print("Enter Tamil Mark: ");
		float tam=in.nextFloat();
		
		System.out.print("Enter English Mark: ");
		float eng=in.nextFloat();
		
		System.out.print("Enter Maths Mark: ");
		float maths=in.nextFloat();
		
		System.out.print("Enter Science Mark: ");
		float sci=in.nextFloat();
		
		System.out.print("Enter Social Science Mark: ");
		float ssci=in.nextFloat();
		
		in.close();
		
		student.insertIdName(id, name);
		student.insertMarks(tam,eng,maths,sci,ssci);
		student.display();
		student.Avrage();
		

	}
	
}
	
	class StudentDetails{   //creating a class
		int ID;
		String Name;
		float Tamil;
		float English;
		float Maths;
		float Science;
		float Social_science;
		
		void insertIdName(int id,String name) {
			ID=id;
			Name=name;
		}
		
		void display() {
			System.out.println("\n+-------------------+");
			System.out.println("Student Details");
			System.out.println("+-------------------+");
			System.out.println("ID    :"+ID);
			System.out.println("Name  :"+Name);
			System.out.println("\n+-------------------+");
			System.out.println("Mark Details");
			System.out.println("+-------------------+");
			System.out.println("Tamil         :"+Tamil);
			System.out.println("English       :"+English);
			System.out.println("Maths         :"+Maths);
			System.out.println("Science       :"+Science);
			System.out.println("Social Science:"+Social_science);
//			System.out.println("The Avrage is:",Avrage());
			System.out.println("+-------------------+");

		}
		
		void insertMarks(float tam,float eng,float maths,float sci,float social_sci) {
			Tamil=tam;
			English=eng;
			Maths=maths;
			Science=sci;
			Social_science=social_sci;
		}
		
		void  Avrage() {
			float avrage=(Tamil+English+Maths+Social_science+Science)/5;
			System.out.println("The Avrage is: "+avrage);
		}

}
