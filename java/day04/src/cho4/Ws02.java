package cho4;

import java.util.Random;
import java.util.Scanner;

public class Ws02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sc1 = sc.next();
		Random r = new Random();
		int num = 0;
		try {
			num = Integer.parseInt(sc1);
			if ((num < 10 || num > 99) ) {
				System.out.println("10~99 ���ڸ� �Է� �����մϴ�.");
				sc.close();
				return;
			}
			System.out.println("�Է��� ��:" + num );
			int randnum = r.nextInt(num -1) + 2 ;
			System.out.println("���� :" + randnum);
			int randsum = 0;
			int count = 0;
			for ( int i =1; i <= randnum; i++) {
					if (i % 2 == 0) {
						randsum += i;
						count++;
					}
			}
			System.out.println("�������� ¦���� ��:" + randsum);
			System.out.println("�������� ¦���� ���:" + randsum / count );
		
			} catch (Exception e) {
			System.out.println("���ڸ� �Է°����մϴ�.");
			sc.close();
			return;
		}
		
		
		sc.close();
	}

}
