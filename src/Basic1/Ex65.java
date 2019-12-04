package Basic1;

import java.util.Scanner;

//Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
public class Ex65 {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Input the second number: ");
		int num2 = input.nextInt();
		
		
		
		int result = num1 - (num2*(num1/num2));
		
		System.out.println("Result: " + result);
		
		
	}

}
