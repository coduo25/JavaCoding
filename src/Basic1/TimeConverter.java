//ex 55
package Basic1;

import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input seconds: ");
		
		int seconds = input.nextInt();
		
		int second = secondRemainder(seconds);
		
		int mins = secondTomin(seconds);
		
		int hours = secondTohour(seconds);
		
		System.out.println( hours + " : " + mins + " : " + second);
		
	}
	
	public static int secondRemainder(int second) {
		
		int seconds = second % 60;
		return seconds;
	}
	
	public static int secondTomin(int second) {
		
		int min = second % 60;
		return min;
	}
	
	public static int secondTohour(int second) {
		
		int hour = second/3600;
		return hour;
	}

}
