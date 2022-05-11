package cho4;

import java.util.Scanner;

public class P122 {

	public static void main(String[] args) {
		// Scanner 를 이용하여 2 ~ 99까지의 정수를 입력받는다.
		// 범위를 벗어나면 프로그램은 종료.
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int num = 0;
		try {
			num = Integer.parseInt(input);
			if (num < 2 || num > 99) {
				System.out.println("Bye...");
				sc.close();
				return;
			}
		}catch(Exception e) {
			System.out.println("Bye");
			sc.close();
			return;
		}
		// 1부터 입력 받은 수까지의 합과 평균을 출력 하시오 While 사용

		double sum = 0.0;
		int s = 1;
		while (s <= num) {
			sum += s;
			s++;
		}
		System.out.println(sum);
		System.out.println(sum / (s-1));

		sc.close();
	}

}
