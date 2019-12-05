package Basic1;

import java.util.Arrays;

public class Ex81 {
	// Write a Java program to swap the first and last elements of an array
	// (length must be at least 1) and create a new array.
	public static void main(String[] args) {

		int[] array = { 20, 30, 40 };

		int[] new_array = new int[3];
		
		new_array[2] = array[0];
		new_array[1] = array[1];
		new_array[0] = array[2];

		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(new_array));
		
	}

}
