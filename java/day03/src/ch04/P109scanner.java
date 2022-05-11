package ch04;

import java.util.Scanner;

public class P109scanner {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
//		System.out.println("Input Number 1..?");
//		String n1 = sc.next();
//		System.out.println("Input Number 2..?");
//		String n2 = sc.next();	
//		
//		// �Է� ���� ���ڰ� ���ڸ� ���� �ƴϸ� ����.
//		if ( n1.length() > 1 || n2.length() > 1 ) {
//			System.out.println("���ڸ����� �Է� �����մϴ�.");
//			sc.close();
//			return;
//		}
//		
//		// ���ڸ� �Է� �޴´�.
//		// "1" -> '1'
//		char c1 = n1.charAt(0);
//		char c2 = n2.charAt(0);
//		if ( !(c1 >= '1' && c1 <= '9') || !(c2 >= '1' && c2 <='9') ) {
//			System.out.println("���ڸ� �Է� �����մϴ�.");
//			sc.close();
//			return;
//		}		

//		System.out.printf("�Է��� ���ڴ� %s, %s �Դϴ�.\n", n1,n2);
		
		System.out.println("Input Number1 ....");
		String a1 = sc.next();
		System.out.println("Input Number2 ....");
		String a2 = sc.next();
		System.out.println("Input arithmetic operater ....");
		String am = sc.next();
		String regExp = "^[0-9]*$"; // ����ǥ���� ��� ���ڸ� ����Ŵ.
		System.out.printf("�Է��� ������ %s, %s, %s �Դϴ�.\n", a1,a2,am);
		
		// input�� ���ڰ� �ƴϸ� �����.		
		if ( ! a1.matches(regExp) || ! a2.matches(regExp) ) {
			System.out.println("ù��°, �ι�°�� ���ڸ� �Է� �����մϴ�.");
			sc.close();
			return;
		}
		
		double da1 = Double.parseDouble(a1);
		double da2 = Double.parseDouble(a2);
		double result = 0.0 ;	
		
		// ������ �����Ͽ� da1, da2 ���.
		if	(am.equals("+")) {
			result = (double)Math.round((da1 + da2) * 100)/100 ;
			System.out.println(result);
		}else if (am.equals("-")) {
			result = (double)Math.round((da1 - da2) * 100)/100;
			System.out.println(result);
		}else if (am.equals("/")) {
			result = (double)Math.round((da1 / da2)*100)/100;
			System.out.println(result);
		}else if (am.equals("*")) {
			result = (double)Math.round((da1 * da2)*100)/100;
			System.out.println(result);
		}else {
			System.out.println("�����ڴ� '+, -, /, *' �� �Է� �����մϴ�.");
			sc.close();
			return;
		}
		
		//����, ��� ���͸�
		System.out.println((result > 0) ? "���" : "����");
	
		
		//ū��,�߰���, ������ ���͸�
		System.out.println((result >= 10 ) ? "ū��" : (result >= 5) ? "�߰���" : "������" );
		

		sc.close();
		System.out.println("End");
	}

}
