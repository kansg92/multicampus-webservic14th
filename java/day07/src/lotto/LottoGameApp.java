package lotto;

import java.util.Arrays;
import java.util.Scanner;

public class LottoGameApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ζ� ��ȣ �����ϰ� ��ȣ ���߱�.");
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
				System.out.println("�ζ� ��ȣ ������ ...");
				lotto.createlottonum(ar);
				System.out.println("\n���ʽ� ��ȣ ������ ...");
			}else if (cmd.equals("s")) {
				System.out.println("�ζ� ��ȣ�� �Է��ϼ���.");
				for (int i = 0; i < 6; i++) {		
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
			}else if (cmd.equals("a")) {
				System.out.println("��ȣ üũ ��....");
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
				System.out.println("����� �Է��� �ζ� ��ȣ:" + Arrays.toString(user));
				if (count == 6) {
					System.out.println("1�� ��÷");
				}else if (count == 5 && bonus == 1) {
					System.out.println("2�� ��÷");
				}else if (count == 4) {
					System.out.println("3�� ��÷");
				}else if (count == 3 ) {
					System.out.println("4�� ��÷");
				}else if (count == 2 ) {
					System.out.println("5�� ��÷");
				}
				System.out.println("�ƽ����ϴ�... ������ �����ϼ���.");
				System.out.print("�ζ� ���� ��ȣ:");
				for (int i = 0; i < 6; i++) {
					if(i!=0) {
						System.out.print(", ");
					}
					System.out.print(lotto.getLottonum()[i] );
				}
				System.out.println("\n�ζ� ���ʽ� ��ȣ:" + lotto.getLottonum()[6]);
					
			}
		}
		
		sc.close();
		System.out.println("End ...");
	}

}
