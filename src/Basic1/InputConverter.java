//51
package Basic1;

import java.util.Scanner;

public class InputConverter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a number(String): ");
		
		String str1 = input.nextLine();
		
		int result = Integer.parseInt(str1);
		
		System.out.println(result);
		
		
	}

}
