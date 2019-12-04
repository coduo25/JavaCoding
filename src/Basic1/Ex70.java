package Basic1;

public class Ex70 {

	//Write a Java program to create a string in the form short_string + long_string + short_string from two strings. The strings must not have the same length.
	public static void main(String[] args) {
		
		String str1 = "Python";
		String str2 = "Tutorial";
		
		String short_string = (str1.length() > str2.length() ? str2 : str1);
		String long_string = (str1.length() > str2.length() ? str1 : str2);
		
		System.out.println(short_string + long_string + short_string);

	}

}
