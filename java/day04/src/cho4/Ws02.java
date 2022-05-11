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
				System.out.println("10~99 숫자만 입력 가능합니다.");
				sc.close();
				return;
			}
			System.out.println("입력한 수:" + num );
			int randnum = r.nextInt(num -1) + 2 ;
			System.out.println("난수 :" + randnum);
			int randsum = 0;
			int count = 0;
			for ( int i =1; i <= randnum; i++) {
					if (i % 2 == 0) {
						randsum += i;
						count++;
					}
			}
			System.out.println("난수까지 짝수의 합:" + randsum);
			System.out.println("난수까지 짝수의 평균:" + randsum / count );
		
			} catch (Exception e) {
			System.out.println("숫자만 입력가능합니다.");
			sc.close();
			return;
		}
		
		
		sc.close();
	}

}
