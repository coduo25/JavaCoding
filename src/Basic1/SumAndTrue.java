//52 & 53
package Basic1;

import java.util.Scanner;

public class SumAndTrue {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the first number: ");
		int number1 = input.nextInt();
		
		System.out.print("Input the second number: ");
		int number2 = input.nextInt();
		
		System.out.print("Input the third number: ");
		int number3 = input.nextInt();
		
		System.out.print("The result is: " + test(number1, number2, number3, true));
		System.out.print("\n");

	}
	
	
	public static boolean test(int a, int b, int c, boolean number1number2number3) {
		if(number1number2number3) 
			return (c > a);
		
		return (b > c && c > b);
	}

}
