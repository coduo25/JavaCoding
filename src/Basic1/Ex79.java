package Basic1;

import java.util.Arrays;

public class Ex79 {

	//Write a Java program to rotate an array (length 3) of integers in left direction.
	public static void main(String[] args) {
		
		int[] number = {20, 30, 40};
		
		System.out.println("Original Array: " + Arrays.toString(number));
		
		int[] number2 = new int[3];
		
		number2[0] = number[2];
		number2[1] = number[0];
		number2[2] = number[1];
		
		System.out.println("Roated Array: " + Arrays.toString(number2));

	}

}
