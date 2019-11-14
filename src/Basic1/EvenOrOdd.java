//ex 49
package Basic1;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		
		int number1 = input.nextInt();
		
		if(number1 % 2 == 0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
		
	}

}
