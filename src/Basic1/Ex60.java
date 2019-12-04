package Basic1;

import java.util.Scanner;

public class Ex60 {

	//Write a Java program to find the penultimate (next to last) word of a sentence.
	//Input: The quick brown fox jumps over the lazy dog.  
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a String: ");
		String userInput = input.nextLine();
		
		String[] words = userInput.split("[ ]+");

		System.out.println("Split output: " + words[words.length - 2]);
		
		System.out.print("Input a String2: ");
		String userInput2 = input.nextLine();
		
		String[] words2 = userInput2.split(";");
		
		System.out.println("Split output2: "  + words2[words.length - 1]);
		
		
		
		
		

	}

}
