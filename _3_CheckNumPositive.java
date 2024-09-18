import java.util.Scanner;

public class _3_CheckNumPositive {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=in.nextInt();
		
		if(num>0) 
			System.out.println("The Num is Positive: "+num);
		else if(num<0) 
			System.out.println("The num is Negative: "+num);
		else 
			System.out.println("The Num is Zero: "+num);
		
		in.close();
		
	}

}
