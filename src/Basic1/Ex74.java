package Basic1;

public class Ex74 {

	//Write a Java program to test if 10 appears as either the first or last element 
	//of an array of integers. The length of the array must be greater than or equal to 2.
	public static void main(String[] args) {
		
		int[] number = {10, -20, 0, 30, 40, 60, 10};

		System.out.println(number[0] == 10 || number[number.length-1] == 10);
	  
	}

}
