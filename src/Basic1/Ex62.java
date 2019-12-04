package Basic1;

import java.util.Scanner;

public class Ex62 {

	// Write a Java program that accepts three integer values and 
	// return true if one of them is 20 or more and less than the 
	// substractions of others.
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type first number: ");
		int input1 = input.nextInt();
		
		System.out.print("Type second number: ");
		int input2 = input.nextInt();
		
		System.out.print("Type third number: ");
		int input3 = input.nextInt();
		
		System.out.println(Math.abs(input1-input2)>=20 || Math.abs(input1-input3)>=20 || Math.abs(input2-input3)>=20);
		

	}

}
