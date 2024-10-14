package testPackage;

public class Car {

	public String name = "Van";
	public int NoOfWheels = 4;
	public String gear="5 gear";

	public void run() {
		System.out.println("running from parent class");
	}
	
	public void brake() {
		System.out.println("braking from parent class");
	}

	public static void main(String[] args) {

	}
}
