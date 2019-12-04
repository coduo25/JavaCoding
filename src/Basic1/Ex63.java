package Basic1;

import java.util.Scanner;

public class Ex63 {

	//Write a Java program that accepts two integer values from the user and return the larger values. However if the two values are the same, return 0 and return the smaller value if the two values have the same remainder when divided by 6
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type first value: ");
		int number1 = input.nextInt();
		
		System.out.print("Type second value: ");
		int number2 = input.nextInt();
		
		int result = number1 - number2;
		
		if(result > 0) {
			System.out.println("Result: " + number1);
		}
		else if(result < 0) {
			System.out.println("Result: " + number2);
		}
		else if(result == 0) {
			System.out.println("Result: " + 0);
		}
		else if(number1 % 6 == number2 % 6) {
			int result2 = ((number1 -number2)>0) ? number1 : number2;
			System.out.println("Result: " + result2);
		}
		
		
		
		
		
	}

}
