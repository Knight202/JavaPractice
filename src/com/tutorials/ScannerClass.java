package com.tutorials;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * public final class Scanner
 * extends Object
 * implements Iterator<String>, Closeable
 * 
 * A simple text scanner which can parse primitive types and strings using regular expressions.
 * 
 * A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace. 
 * The resulting tokens may then be converted into values of different types using the various next methods.
 * 
 * @author Kalpan
 *
 */
public class ScannerClass {

	static Scanner scanFile = null;
	//static Scanner scanInputStream = null;
	//static Scanner scanPath =null;
	//static Scanner scanReadable = null;
	static Scanner scanString = null;
	public static void main(String args[]) {
		
		try {
			scanFile = new Scanner(new File("/home/kalpan/CDH/JAVA_Workspace/JavaPractice/doc/ScannerClassSample.txt"));
			//scanFile = new Scanner(new File("/home/kalpan/CDH/JAVA_Workspace/JavaPractice/doc/ScannerClassSample.txt"),"UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		scanString = new Scanner("1  2 5 a b K");
		while (scanFile.hasNextLong()){
			System.out.println("Here -1");
			System.out.println(scanFile.next());
			System.out.println("Here -2");
			while (scanFile.hasNextLong()){
				System.out.println("Here -3");
				System.out.println(scanFile.next());}
			System.out.println("Here -4");
		}
		while (scanFile.hasNextLine()){
			System.out.println("Here -5");
			System.out.println(scanFile.nextLine());
			System.out.println("Here -6");
		}
		//scanInputStream = new Scanner(System.in);
		//scanPath = new Scanner();
		scanFile.close();
		scanString.close();
}

}
