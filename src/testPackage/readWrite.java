package testPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class readWrite {

	public static void main(String[] args) throws IOException {
		/*String textfile = "Hi, My Name is Roshan Nayak";

		FileWriter f = new FileWriter("D:\\WriteToFile.txt");
		try (BufferedWriter writer = new BufferedWriter(f)) {
			writer.write(textfile);
			writer.append("\nThis is 2nd line");
			System.out.println("File created successfully");*/

			System.out.println("**********************************");

			/*
			 * File f1 = new File("D:\\WriteToFile.txt"); Scanner sc = new Scanner(f1);
			 * while (sc.hasNextLine()) System.out.println(sc.nextLine());
			 */
			
			FileReader fr=new FileReader ("D:\\\\WriteToFile.txt");
			BufferedReader br=new BufferedReader(fr);
			String st;
			
			while((st=br.readLine())!= null){
				System.out.println(st);
			}

		}

	}


