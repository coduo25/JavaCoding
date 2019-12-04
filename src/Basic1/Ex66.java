package Basic1;

//Write a Java program to compute the sum of the first 100 prime numbers.
public class Ex66 {

	public static void main(String[] args) {

		int count = 0;
		int n = 0;
		int sum = 1;

		while (count < 100) {
			n++; // n=1�� ����
			// ¦�� �ɷ�����, n�� Ȧ���̸�
			if (n % 2 != 0) {
				// Ȧ�� �߿��� Prime �ѹ� ã�� -> prime �ѹ� ������ ���ϱ�
				if (is_Prime(n)) {
					sum += n;
				}
			}
			count++;
		}
		System.out.println("Result: " + sum);
	}

	public static boolean is_Prime(int num) {
		// Ȧ�� �� ���ڵ� 1,3,5,7,9,11....
		// �߿��� �����ؼ� ���� ���ڵ� ����(9, 16, 25....)
		// ex) 9<=9 ���� ���� -> 9%3 �� ==0 �̱� ������ Prime �ѹ��� ���� ���Ѵ�.
		for (int i = 3; i * i <= num; i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
