package ch04;

import java.util.Scanner;

public class P110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number1...");
		String input1 = sc.next();
		int n1 = Integer.parseInt(input1);
		int result = 0;
		double avg = 0.0;
		
		if (n1 < 10 || n1 > 99) {
			System.out.println("10 ~ 99 ���̿� ���ڸ� �Է����ּ���.");
			sc.close();
			return;
		}		
		for ( int i = 0; i <= n1; i++ ) {
			result += i;
		}
		avg = (double)result / n1 ;
		System.out.println("�� :" + result);
		System.out.println("��� :" + avg);
		
		sc.close();
	}
}
