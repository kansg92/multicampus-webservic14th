package ch04;

import java.util.Scanner; 

public class P108 {

	public static void main(String[] args) {
		System.out.println("Start ....");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number:");
		String num = sc.next();
		// �Է��� ���ڰ� 0�̸� ���α׷� ����, �׷��� ������ ���
		// 1���� ũ�� 10������ ���ڰ� �ƴϸ� ����.
		
		int nm = Integer.parseInt(num);
		
		if((nm > 10 || nm < 1) ) {
			System.out.println("Bye");
			sc.close();
			return;
		}
		// printf ( %d, %s, %f) ����, ����, �Ǽ�
		System.out.printf("�Է��� ���� %d \n",nm);		
		
		if(nm%2 == 0) {
			System.out.printf("�Է��� �� %d�� ¦�� �Դϴ�. \n",nm);
		}else {
			System.out.printf("�Է��� �� %d�� Ȧ�� �Դϴ�. \n",nm);
		}
		
		// ��,��,�� �Դϴ�.
		
//		if(nm >= 7) {
//			System.out.println("��");
//		}else if (nm >= 3) {
//			System.out.println("��");
//		}else {
//			System.out.println("��");
//		}

		
		System.out.println((nm >= 7)  ? "��" : (nm >= 3) ? "��" : "��" );
		
		sc.close();
		System.out.println("End ....");

	}

}
