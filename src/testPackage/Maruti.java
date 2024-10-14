package testPackage;

public class Maruti extends Car {

	public String name = "Maruti";
	public int NoOfWheels = 4;

	public void run() {
		System.out.println("Maruti is running");
		
	}
	
	public void test() {
		//super.run();
	}
	
	public void test(int a) {
		System.out.println("Test running from Maruti class");
	}
	public static void main(String[] args) {
		Maruti m = new Maruti();
		Car c=new Car();
		System.out.println(m.name);
		System.out.println(m.NoOfWheels);
		m.run();
		//System.out.println(super.run());
		c.run();
		m.brake();
		m.test();
		m.test(12);
		

	}

}
