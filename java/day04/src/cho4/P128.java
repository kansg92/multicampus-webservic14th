package cho4;

import java.util.Random;
import java.util.Scanner;

public class P128 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input cmd(w1,w2,q) ...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if (cmd.equals("w1")) {
				while(true) {
					System.out.print("ù ��° ���� :");
					String sc1 = sc.next();
					System.out.print("�� ��° ���� :");
					String sc2 = sc.next();
					double num1 = 0.0;
					double num2 = 0.0;
					try {
						num1 = Double.parseDouble(sc1);
						num2 = Double.parseDouble(sc2);
						if ((num1 < 0 || num1 > 99) || (num2 < 0 || num2 > 99) ) {
							System.out.println("0~99���� ���ڸ� �Է� �����մϴ�.");
						}else if ( num1 > num2) {
						System.out.println("ù��° ���ڴ� �ι�° ���ں��� �۾ƾ� �մϴ�.");
						}else {
							double sum = 0;
							for (int i = 0; i <= num2; i++) {
								if (num1 < i) {
									sum += i;
								}	
							}
							System.out.println(" ù��°���ں��� �ι�° ������ �� :" + (num1+sum));
							System.out.println(" ù��°���ں��� �ι�° ������ ��� :" + (num1+sum) / (num2 - num1 +1) );
							break;
						}

					} catch (Exception e) {
						System.out.println("���ڸ� �Է°����մϴ�.");
						continue;
					}
				}
			}else if (cmd.equals("w2")) {
				while(true) {
					System.out.print("���ڸ� �Է��ϼ��� :");
					String sc1 = sc.next();
					Random r = new Random();
					int num = 0;
					try {
						num = Integer.parseInt(sc1);
						if ((num < 10 || num > 99) ) {
							System.out.println("10~99 ���ڸ� �Է� �����մϴ�.");
							continue;
						}
						System.out.println("�Է��� ��:" + num );
						int randnum = r.nextInt(num -1) + 2 ;
						System.out.println("���� :" + randnum);
						int randsum = 0;
						int count = 0;
						for ( int i =2; i <= randnum; i += 2) {
								if (i % 2 == 0) {
									randsum += i;
									count++;
								}
						}
						System.out.println("�������� ¦���� ��:" + randsum);
						System.out.println("�������� ¦���� ���:" + randsum / count );
						break;
						} catch (Exception e) {
							System.out.println("���ڸ� �Է°����մϴ�.");
							sc.close();
							continue;
						}
				}	

			}
		}
	}

}
