package saturdayTest_28_09_24;

// Q3. Write a Java program to create a class called "GymMembership" with attributes 
//		for member name, membership type, and duration. Create a subclass "PremiumMembership" 
//		that adds attributes for personal trainer availability and spa access. Implement
//		methods to calculate membership fees and check for special offers based on membership type.

class GymMembership{
	String name;
	String type;
	double duration;
	
	GymMembership(String name,String type, double duration){
		this.name = name;
		this.type = type;
		this.duration = duration;
	}
	
	 void displayMemberInfo() {
	        System.out.println("Member Name: " + name);
	        System.out.println("Membership Type: " + type);
	        System.out.println("Membership Duration: " + duration + " months");
	    }
	 
	 void checkSpecialOffers() {
	        if (type.equals("Basic")) {
	            System.out.println("Special offer: Get 10% off on personal training sessions.");
	        } else if (type.equals("Premium")) {
	            System.out.println("Special offer: Free access to group classes.");
	        } else {
	            System.out.println("No special offers available.");
	        }
	    }
	 double calculateFees() {
			double monthlyFee;
			if (type.equalsIgnoreCase("Basic")) {
					monthlyFee = 500; // Basic membership costs 500 per month
		     } else {
		    	   	monthlyFee = 800; // Premium membership costs 800 per month
		     	}
		    return monthlyFee * duration; // Total fee for the duration
		}

}

class PremiumMembership extends GymMembership{
	boolean personalTrianer;
	boolean spaAccess;
	
	PremiumMembership(String name,String type, double duration, boolean personalTrainer, boolean spaAccess){
		super(name,type,duration);
		this.personalTrianer = personalTrainer;
		this.spaAccess = spaAccess;
	}
	
	
	
}

public class Main2 {

	public static void main(String[] args) {

		PremiumMembership p1 = new PremiumMembership("Sakthivel","Basic",12,true,true);
		double fees = p1.calculateFees();
		System.out.println(fees);
		p1.checkSpecialOffers();
		p1.displayMemberInfo();
		
	}

}
