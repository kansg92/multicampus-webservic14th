package cho4;

import java.util.Scanner;

public class Ws01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sc1 = sc.next();
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
			}

		} catch (Exception e) {
			System.out.println("숫자만 입력가능합니다.");
			sc.close();
			return;
		}
		sc.close();

		
	}

}
