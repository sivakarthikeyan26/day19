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
		System.out.println("Enter the email id");
		String email = sc.next();
		System.out.println("Enter the phone number");
		String phno = sc.next();
		System.out.println("Enter the password");
		String pass = sc.next();
		/**
		 * checking if the given name starts with capital letter and has min 3 letters
		 */
		boolean result = Pattern.matches("[A-Z][a-z]{3,}", firstname);
		/**
		 * checking if the given name starts with capital letter and has min 3 letters
		 */
		boolean result2 = Pattern.matches("[A-Z][a-z]{3,}", lastname);
		
		/**
		 * Checking for the email id.
		 */
		boolean result3 = Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$",email);
		/**
		 * checking phono
		 */
		boolean result4 = Pattern.matches("^[0-9]{2}+(\s)+[6-9][0-9]{9}",phno);
		/**
		 * checking password
		 */
		boolean result5 = Pattern.matches("[a-z]{8,}",pass);
		if(result4) {
			System.out.println("true");
		}
		
		/**
		 * if two cases are true print valid else invalid
		 */
		
		if(result && result2 && result3 && result4 && result5) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
		sc.close();
	}

}
