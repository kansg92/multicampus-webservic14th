package p422;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		String num = sc.next();
		int n = 0;
		int result = 0;
		try {
			n = Integer.parseInt(num);
			result = 100 / n ;
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("���ڰ� �ƴմϴ�.");	
		} catch (ArithmeticException e) {
			System.out.println("�и� 0 �Դϴ�.");
		} finally {
			sc.close();
			System.out.println("end");
		}
		
		
		
	}

}
