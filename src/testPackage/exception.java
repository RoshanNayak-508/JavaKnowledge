package testPackage;

public class exception {

	public static void main(String[] args) {
		int a=6;
		int b=(Integer) null;
		a=b;
		try {
			System.out.println(a/0);
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
			e.printStackTrace();
		}
		

	}

}
