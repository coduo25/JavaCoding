package Basic1;

public class Ex80 {

	// Write a Java program to get the larger value between first and last
	// element of an array (length 3) of integers .
	public static void main(String[] args) {

		int[] array = {20, 30, 40};
		
		if(array[0] > array[array.length-1]) {
			System.out.println(array[0]);
		}
		else {
			System.out.println(array[array.length-1]);
		}
		
	}

}
