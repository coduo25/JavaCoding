package Basic1;

//Write a Java program to compute the sum of the first 100 prime numbers.
public class Ex66 {

	public static void main(String[] args) {

		int count = 0;
		int n = 0;
		int sum = 1;

		while (count < 100) {
			n++; // n=1로 시작
			// 짝수 걸러내기, n이 홀수이면
			if (n % 2 != 0) {
				// 홀수 중에서 Prime 넘버 찾기 -> prime 넘버 맞으면 합하기
				if (is_Prime(n)) {
					sum += n;
				}
			}
			count++;
		}
		System.out.println("Result: " + sum);
	}

	public static boolean is_Prime(int num) {
		// 홀수 인 숫자들 1,3,5,7,9,11....
		// 중에서 제곱해서 나온 숫자들 제거(9, 16, 25....)
		// ex) 9<=9 조건 만족 -> 9%3 은 ==0 이기 때문에 Prime 넘버가 되지 못한다.
		for (int i = 3; i * i <= num; i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
