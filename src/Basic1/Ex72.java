package Basic1;

//Write a Java program to create a new string taking first three characters 
//from a given string. If the length of the given string is less than 3 use "#" 
//as substitute characters.
public class Ex72 {

	public static void main(String[] args) {

		String str1 = "pyth";
		int length = str1.length();
		if(length >= 3) {
			System.out.println(str1.substring(0, 3));
			System.out.println(str1.substring(3));
			System.out.println(str1.charAt(3));
		}
		else {
			System.out.println("###");
		}
		
	}

}
 