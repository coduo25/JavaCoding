package Basic1;

public class Ex75 {

	//Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2.
	public static void main(String[] args) {
		
		int[] number = {50, -20, 0, 30, 40, 60, 10};
		
		System.out.println(number[0] == number[number.length-1]);
		
		
	}

}
