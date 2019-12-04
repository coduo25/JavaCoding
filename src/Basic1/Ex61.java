package Basic1;

import java.util.Scanner;

public class Ex61 {

	//Write a Java program to reverse a word.
	//input: qwer
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type a input: ");
		String user_input = input.nextLine();
		
		String[] split_input = user_input.split("");

		//System.out.print(split_input[1]);
		
//		for(int i=0; i<= user_input.length(); i++) {
//			System.out.print(split_input[i] + " ");
//		}
		
		for(int j=3; j<= user_input.length(); j--) {
			System.out.print(split_input[j] + " ");
		}
		

	}

}
