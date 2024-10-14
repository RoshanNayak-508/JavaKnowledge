package testPackage;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		sc.close();
		
		if (number%2==0) {
			System.out.println(number +" is even");
		}
		else {
			System.out.println(number +" is odd");
		}
			

	}

}
