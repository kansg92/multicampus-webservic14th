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
					System.out.print("첫 번째 숫자 :");
					String sc1 = sc.next();
					System.out.print("두 번째 숫자 :");
					String sc2 = sc.next();
					double num1 = 0.0;
					double num2 = 0.0;
					try {
						num1 = Double.parseDouble(sc1);
						num2 = Double.parseDouble(sc2);
						if ((num1 < 0 || num1 > 99) || (num2 < 0 || num2 > 99) ) {
							System.out.println("0~99까지 숫자만 입력 가능합니다.");
						}else if ( num1 > num2) {
						System.out.println("첫번째 숫자는 두번째 숫자보다 작아야 합니다.");
						}else {
							double sum = 0;
							for (int i = 0; i <= num2; i++) {
								if (num1 < i) {
									sum += i;
								}	
							}
							System.out.println(" 첫번째숫자부터 두번째 숫까지 합 :" + (num1+sum));
							System.out.println(" 첫번째숫자부터 두번째 숫까지 평균 :" + (num1+sum) / (num2 - num1 +1) );
							break;
						}

					} catch (Exception e) {
						System.out.println("숫자만 입력가능합니다.");
						continue;
					}
				}
			}else if (cmd.equals("w2")) {
				while(true) {
					System.out.print("숫자를 입력하세요 :");
					String sc1 = sc.next();
					Random r = new Random();
					int num = 0;
					try {
						num = Integer.parseInt(sc1);
						if ((num < 10 || num > 99) ) {
							System.out.println("10~99 숫자만 입력 가능합니다.");
							continue;
						}
						System.out.println("입력한 수:" + num );
						int randnum = r.nextInt(num -1) + 2 ;
						System.out.println("난수 :" + randnum);
						int randsum = 0;
						int count = 0;
						for ( int i =2; i <= randnum; i += 2) {
								if (i % 2 == 0) {
									randsum += i;
									count++;
								}
						}
						System.out.println("난수까지 짝수의 합:" + randsum);
						System.out.println("난수까지 짝수의 평균:" + randsum / count );
						break;
						} catch (Exception e) {
							System.out.println("숫자만 입력가능합니다.");
							sc.close();
							continue;
						}
				}	

			}
		}
	}

}
