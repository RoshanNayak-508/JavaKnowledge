package testPackage;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class array {

	public static void main(String[] args) {
		
		String[] al=new String[5];
		
		al[0]="Ram";
		al[1]="Shyam";
		al[2]="Ghanshyam";
		
		
		System.out.println(al[2]);
		ArrayList ar= new ArrayList();
		ar.add("Roshan");
		ar.add("Sanjeev");
		ar.add("Deepak");
		ar.add(32);

		System.out.println(ar.size());
		System.out.println(ar.indexOf("Deepak"));
		System.out.println(ar);
		ar.remove("Deepak");
		System.out.println("After removed Deepak " +ar);
		
		

	}

}
