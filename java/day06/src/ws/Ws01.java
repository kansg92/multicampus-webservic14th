package ws;

import java.util.Random;
import java.util.Scanner;

public class Ws01 {

	public static void main(String[] args) {
		// Number Guess Game 
		// 1 ~ 99 ���������� �Ѱ��� ���ڸ� �޵��.
		// ���ڸ� �Է��ϰ� �ش� ���ں��� ������ down, ������ up
		// 10ȸ �̻� �Է��ϸ� Game over. �ٽ� ���� �ϼ���.
		// ���� ���ڸ� ���߸� �ý��� ����.
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int randnum = 0;
		System.out.println("Game start..");
		String stdIn = "";	
		while (true) {	
			//���� ��Ȳ �Է½� �ݺ�.
			try {
						
				randnum = ran.nextInt(99)+1;
				// �� ���� �� ī��Ʈ �ʱ�ȭ.
				int count = 0;
				for(int i = 0; i <= 10; i++ ) {				
					System.out.print("Guess number(1~99) :");
					System.out.println("");
					stdIn = sc.next();
					int num = Integer.parseInt(stdIn);				
					count++;
					// 10ȸ �Է½� ���� ����
					if ( count == 10) {
						System.out.println("Game over, 10ȸ �̳��� ���߼ž��մϴ�. �ٽõ����ϼ���.");
						break;
					}
					// �Է� ���ڰ� ���� �� down
					if ( num > randnum ) {
						System.out.println("Down");
						continue;
					//�Է� ���ڰ� ���� �� up	
					} else if ( num < randnum) {
						System.out.println("Up");
						continue;
					// ����� ���� �� ���� ���� Ȯ��.
					} else if ( num == randnum) {
						System.out.printf("����! ���ϵ帳�ϴ�. ����Ƚ�� : %dȸ \n", count );
						System.out.println("������ �̾� �Ͻðڽ��ϱ�? (input : yes or no):");
						stdIn = sc.next();
						//yes or no �� �Է� �ޱ�.
						while(true) {
							if ( !(stdIn.equals("yes") ||stdIn.equals("no") ) ) {
							System.out.println("yes or no ���Է� �����մϴ�. �ٽ��Է��ϼ��� :");	
							stdIn = sc.next();
							}
							if ( stdIn.equals("yes")) {
								break;
							} else if(stdIn.equals("no")) {	
								System.out.println("������ ���� �Ǿ����ϴ�.");
								sc.close();
								return;
							}							
						}
					}
					break;
				}
				//���ܻ�Ȳ�� ���� ���Է�.
			} catch (Exception e) {
				System.out.println("���ڸ� �Է����ּ���.");
				continue;
			}
		}		

	}	

}
