package day19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regx_uc1 {
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the first name");
		String firstname = sc.next();
		System.out.println("Enter the last name");
		String lastname = sc.next();
		/**
		 * checking if the given name starts with capital letter and has min 3 letters
		 */
		boolean result = Pattern.matches("[A-Z][a-z]{3,}", firstname);
		/**
		 * checking if the given name starts with capital letter and has min 3 letters
		 */
		boolean result2 = Pattern.matches("[A-Z][a-z]{3,}", lastname);
		/**
		 * if two cases are true print valid else invalid
		 */
		if(result && result2) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
		sc.close();
	}

}
