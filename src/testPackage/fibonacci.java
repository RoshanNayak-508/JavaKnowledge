package testPackage;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int a=0;int b=1;
		int next,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of terms");
		int terms=sc.nextInt();
		System.out.print(a +" "+b);
		
		for (i=2; i<=terms;i++ ) {
			next=a+b;
			System.out.print(" "+next);
			a=b;
			b=next;
			
		}

	}

}
