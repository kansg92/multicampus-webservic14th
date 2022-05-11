package cho4;

import java.util.Scanner;

public class P122 {

	public static void main(String[] args) {
		// Scanner �� �̿��Ͽ� 2 ~ 99������ ������ �Է¹޴´�.
		// ������ ����� ���α׷��� ����.
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
		// 1���� �Է� ���� �������� �հ� ����� ��� �Ͻÿ� While ���

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
