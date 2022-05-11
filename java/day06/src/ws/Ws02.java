package ws;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ws02 {

	public static void main(String[] args) {
		// Lotto Game
		// �ζ� ���ڸ� �Է� �޴´�. 6�ڸ�.
		// ���δٸ� ���ڸ� �Է��ϰ� ��ȣȮ��!
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		// 1. 6�ڸ� �迭 �����.
		int ar [] = new int [6];
		int user [] = new int [6];	
		
		// 2. �ζ� ��ȣ ����.(1~45) 
		for (int i = 0; i < ar.length; i++) {
			ar [i] = r.nextInt(45)+1;
			// �ߺ� �� ����.
			for (int j = 0; j < i ; j++) {
				if (ar[i] == ar[j] ) {
					i--;
				}
			}		
		}// [1,2,3,4,5,6]
		//3. ��ȣ �Է�.
		for (int i = 0; i < ar.length; i++) {		
			// ���ܻ�Ȳ ����.
			try {
				System.out.println("�ζ� ��ȣ�� �Է��ϼ���." + (i+1) + "��:" );
				String snum = sc.next();
				int num = Integer.parseInt(snum);
				
				user[i] = num;
				// ���� ���� ���� (1~45�� �Է�)
				if ( num < 0 || num > 45 ) {
					System.out.println("1~45 ���ڸ� �Է� �����մϴ�.");
					i--;
					continue;
				}
				// �ߺ� �Է½� ���Է�.
				for (int j = 0; j < i; j++) {
					if (user[i] == user[j] ) {
						System.out.println("�ߺ��� ��ȣ�Դϴ� �ٽ� �Է��ϼ���.");
						i--;
					}
				}
				// ���� ���Է½� �ٽ� �ش� ��ȣ �Է�.
			} catch (Exception e) {
				System.out.println("���ڸ� �Է� �����մϴ�.");
				i--;
				continue;
			}
		}		
		//4.���� ��ȣ���� ���ϱ�.
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] == user [i]) {
				count++;
			}
		}		
		//5. �� �� \���� Ȯ���ϱ�.
		System.out.println("����� �Է��� �ζ� ��ȣ:" + Arrays.toString(user));
		System.out.println(count);
		if (count == 6) {
			System.out.println("1�� ��÷");
		}else if (count == 5) {
			System.out.println("2�� ��÷");
		}else if (count == 4) {
			System.out.println("3�� ��÷");
		}else if (count == 3 ) {
			System.out.println("4�� ��÷");
		}
		System.out.println("�ƽ����ϴ�... ������ �����ϼ���.");
		System.out.println("�ζ� ���� ��ȣ:" + Arrays.toString(ar));

		
		sc.close();
				
	}

}
