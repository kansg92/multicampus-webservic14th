package lotto;

import java.util.Arrays;
import java.util.Scanner;

public class LottoGameApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("로또 번호 생성하고 번호 맞추기.");
		LottoGame lotto = new LottoGame();
		int ar[] = new int [7];
		int user[] = new int [6];
		
		while(true) {
			System.out.println("Input cmd(c,s,a,q) ...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if (cmd.equals("c")) {
				System.out.println("로또 번호 생성중 ...");
				lotto.createlottonum(ar);
				System.out.println("\n보너스 번호 생성중 ...");
			}else if (cmd.equals("s")) {
				System.out.println("로또 번호를 입력하세요.");
				for (int i = 0; i < 6; i++) {		
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
			}else if (cmd.equals("a")) {
				System.out.println("번호 체크 중....");
				int count = 0;
				int bonus = 0;
				for (int i = 0; i < 6; i++) {
					if(ar[i] == user [i]) {
						count++;			
				}
					if(ar[6] == user [i] ) {
						bonus++;
					}
				}
				System.out.println("당신이 입력한 로또 번호:" + Arrays.toString(user));
				if (count == 6) {
					System.out.println("1등 당첨");
				}else if (count == 5 && bonus == 1) {
					System.out.println("2등 당첨");
				}else if (count == 4) {
					System.out.println("3등 당첨");
				}else if (count == 3 ) {
					System.out.println("4등 당첨");
				}else if (count == 2 ) {
					System.out.println("5등 당첨");
				}
				System.out.println("아쉽습니다... 다음에 도전하세요.");
				System.out.print("로또 최종 번호:");
				for (int i = 0; i < 6; i++) {
					if(i!=0) {
						System.out.print(", ");
					}
					System.out.print(lotto.getLottonum()[i] );
				}
				System.out.println("\n로또 보너스 번호:" + lotto.getLottonum()[6]);
					
			}
		}
		
		sc.close();
		System.out.println("End ...");
	}

}
