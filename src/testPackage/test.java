package testPackage;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter First Name");
			String FirstName = sc.next();
			System.out.println("Enter Last Name");
			String LastName = sc.next();
			System.out.println("Hello " + FirstName + " "+LastName + ", Welcome To Espire Family");

			String[] name = new String[3];
			name[0] = "Ranjit1";
			name[1] = "Ranjit2";
			name[2] = "Ranjit3";
			System.out.println((name));
			int[] numbers = { 2, 5, 6, 8, 9 };
			for (int i = numbers.length - 1; i >= 0; i--) {
				System.out.println((numbers[i]));
			}
		}

	}

}
