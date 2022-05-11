package ws;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ws02 {

	public static void main(String[] args) {
		// Lotto Game
		// 로또 숫자를 입력 받는다. 6자리.
		// 서로다른 숫자를 입력하고 번호확인!
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		// 1. 6자리 배열 만들기.
		int ar [] = new int [6];
		int user [] = new int [6];	
		
		// 2. 로또 번호 생성.(1~45) 
		for (int i = 0; i < ar.length; i++) {
			ar [i] = r.nextInt(45)+1;
			// 중복 수 제거.
			for (int j = 0; j < i ; j++) {
				if (ar[i] == ar[j] ) {
					i--;
				}
			}		
		}// [1,2,3,4,5,6]
		//3. 번호 입력.
		for (int i = 0; i < ar.length; i++) {		
			// 예외상황 방지.
			try {
				System.out.println("로또 번호를 입력하세요." + (i+1) + "번:" );
				String snum = sc.next();
				int num = Integer.parseInt(snum);
				
				user[i] = num;
				// 숫자 범위 지정 (1~45만 입력)
				if ( num < 0 || num > 45 ) {
					System.out.println("1~45 숫자만 입력 가능합니다.");
					i--;
					continue;
				}
				// 중복 입력시 재입력.
				for (int j = 0; j < i; j++) {
					if (user[i] == user[j] ) {
						System.out.println("중복된 번호입니다 다시 입력하세요.");
						i--;
					}
				}
				// 숫자 미입력시 다시 해당 번호 입력.
			} catch (Exception e) {
				System.out.println("숫자만 입력 가능합니다.");
				i--;
				continue;
			}
		}		
		//4.같은 번호인지 비교하기.
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] == user [i]) {
				count++;
			}
		}		
		//5. 몇 등 \인지 확인하기.
		System.out.println("당신이 입력한 로또 번호:" + Arrays.toString(user));
		System.out.println(count);
		if (count == 6) {
			System.out.println("1등 당첨");
		}else if (count == 5) {
			System.out.println("2등 당첨");
		}else if (count == 4) {
			System.out.println("3등 당첨");
		}else if (count == 3 ) {
			System.out.println("4등 당첨");
		}
		System.out.println("아쉽습니다... 다음에 도전하세요.");
		System.out.println("로또 최종 번호:" + Arrays.toString(ar));

		
		sc.close();
				
	}

}
