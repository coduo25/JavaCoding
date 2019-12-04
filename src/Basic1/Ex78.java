package Basic1;

import java.util.Arrays;

public class Ex78 {

	//Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
	public static void main(String[] args) {

		int[] number = {5, 7};
		
		System.out.println("Original Array: " + Arrays.toString(number));
		if (number[0] == 4 || number[0] == 7) {
			System.out.println("True");
		} else {
			System.out.println( number[1] == 4 || number[1] == 7);
		}
		
		

	}

}
