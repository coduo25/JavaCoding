package Basic1;

//Write a Java program to insert a word in the middle of the another string. Go to the editor
//Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
public class Ex67 {

	public static void main(String[] args) {
		
		String main_string = "Python 3.0"; //0 1 2 3 4 5 6 7 8 9
		String insert_string = "Tutorial"; //0 1 2 3 4 5 6 7
		
		System.out.println(main_string.substring(0, 7) + insert_string + main_string.substring(6));
		
	}

}
