package testPackage;

import java.util.Scanner;

public class myBank {
	static double balance = 0;

	static void CheckBalance() {

		System.out.println("Your current balance is : " + balance);
	}

	static void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount to deposit: ");
		double deposit = sc.nextDouble();
		balance = balance + deposit;
		CheckBalance();
	}

	static void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount to withdraw: ");
		double withdraw = sc.nextDouble();
		if (balance < withdraw) {
			System.out.println("Your balance is not sufficient");
		} else {
			balance = balance - withdraw;

		}
		CheckBalance();

	}

	static void exit() {
		System.out.println("Thank You for Banking With Us \nRoshan Nayak \nJava Bank");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int option = 0;
		while (option != 4) {
			System.out.println("-----------------------------------");
			System.out.println("***Welcome to JAVA Bank***");
			System.out.println("-----------------------------------");
			System.out.println("Please select Below Option:");
			System.out.println("-----------------------------------");
			System.out.println("1. Balance");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Exit");
			option = scanner.nextInt();
			

			switch (option) {
			case 1:
				CheckBalance();
				break;
			case 2:
				withdraw();
				break;
			case 3:
				deposit();
				break;
			case 4:
				exit();
				break;;
				
				

			}
			
		}

	}
}
