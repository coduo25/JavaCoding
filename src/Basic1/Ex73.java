package Basic1;

public class Ex73 {

	public static void main(String[] args) {
		
		String str1 = "Python";
		
		String str2 = "Test";		

		char ch = ' ';
		char ch1 = ' ';
		char ch2 = 'p';
		
		ch = str1.charAt(0);
		ch1 = str1.charAt(3);
		
		System.out.println(ch); 			// 'P'
		System.out.println("char + char = " + ch + ch1); 		// 'P'+'h' = 80+104
		System.out.println("char2 = " + ch2);
		System.out.println( ch2 + ch2);
		
		System.out.println("Str1 = " + str1);
		System.out.println("Str2 = " + str2);
		
		System.out.println("String + String = " + str1 + str2);
		
		
	}

}
