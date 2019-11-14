//50
package Basic1;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Divided by 3: ");
		for(int i=1; i<101; i++) {
			
			if(i%3 == 0) {
				System.out.print(" " + i + ", ");
			}			
		}

		System.out.println("\n Divided by 5: ");
		for(int i=1; i<101; i++) {
			
			if(i%5 == 0) {
				System.out.print(" " + i + ", ");
			}			
		}

		System.out.println("\n Divided by 3 & 5: ");
		for(int i=1; i<101; i++) {
			
			if(i%3 == 0 && i%5 == 0) {
				System.out.print(" " + i + ", ");
			}			
		}
	}

}
