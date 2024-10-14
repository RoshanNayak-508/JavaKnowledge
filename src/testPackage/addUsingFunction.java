package testPackage;

import java.util.Scanner;

public class addUsingFunction {
	static String s1= "This is my name. That was my name";
	static String s2= s1.replace('a','D' );
	static String s3=s1.toUpperCase();

	static void add(double a, double b) {
		double sum = a + b;
		System.out.println("Sum of 2 number: " + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter 1st number");
		double firstNum = sc.nextDouble();
		
		System.out.println("enter 2nd number");
		double secondNum = sc.nextDouble();

		add(firstNum, secondNum);
		System.out.println(s2);
		System.out.println(s3);

	}

}
