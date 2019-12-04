package Basic1;

public class Ex76 {

	//Write a Java program to test if the first and the last element of two array of integers are same. The length of the array must be greater than or equal to 2.
	public static void main(String[] args) {
		
		int[] number1 = {50, -20, 0, 30, 40, 60, 12};
		int[] number2 = {45, 20, 10, 20, 30, 50, 11};
		
		if(number1.length >= 2 && number2.length >=2) {
			System.out.println(number1[0] == number1[number1.length-1] && number2[0] == number2[number2.length-1]);
		}
	}

}
