package Basic1;

import java.util.Arrays;

public class Ex77 {

	//Write a Java program to create a new array of length 2 from two arrays 
	//of integers with three elements and the new array will contain the first 
	//and last elements from the two arrays.
	public static void main(String[] args) {
		
		int[] array1 = {50, -20, 0};
		int[] array2 = {5, -50, 10};
		int[] array3 = new int[2];
		
		array3[0] = array1[0];
		array3[array3.length -1] = array2[array2.length - 1];
		
		for(int i=0; i<array3.length; i++) {
			//System.out.print(array3[i] + " ");
			System.out.println(Arrays.toString(array3));
		}		

	}

}
