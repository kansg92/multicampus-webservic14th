package ch04;

import java.util.Scanner;

public class P109scanner {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
//		System.out.println("Input Number 1..?");
//		String n1 = sc.next();
//		System.out.println("Input Number 2..?");
//		String n2 = sc.next();	
//		
//		// 입력 받은 숫자가 한자리 수가 아니면 종료.
//		if ( n1.length() > 1 || n2.length() > 1 ) {
//			System.out.println("한자리수만 입력 가능합니다.");
//			sc.close();
//			return;
//		}
//		
//		// 숫자만 입력 받는다.
//		// "1" -> '1'
//		char c1 = n1.charAt(0);
//		char c2 = n2.charAt(0);
//		if ( !(c1 >= '1' && c1 <= '9') || !(c2 >= '1' && c2 <='9') ) {
//			System.out.println("숫자만 입력 가능합니다.");
//			sc.close();
//			return;
//		}		

//		System.out.printf("입력한 숫자는 %s, %s 입니다.\n", n1,n2);
		
		System.out.println("Input Number1 ....");
		String a1 = sc.next();
		System.out.println("Input Number2 ....");
		String a2 = sc.next();
		System.out.println("Input arithmetic operater ....");
		String am = sc.next();
		String regExp = "^[0-9]*$"; // 정규표현식 모든 숫자를 가르킴.
		System.out.printf("입력한 내용은 %s, %s, %s 입니다.\n", a1,a2,am);
		
		// input이 숫자가 아니면 종료됨.		
		if ( ! a1.matches(regExp) || ! a2.matches(regExp) ) {
			System.out.println("첫번째, 두번째는 숫자만 입력 가능합니다.");
			sc.close();
			return;
		}
		
		double da1 = Double.parseDouble(a1);
		double da2 = Double.parseDouble(a2);
		double result = 0.0 ;	
		
		// 연산자 대입하여 da1, da2 계산.
		if	(am.equals("+")) {
			result = (double)Math.round((da1 + da2) * 100)/100 ;
			System.out.println(result);
		}else if (am.equals("-")) {
			result = (double)Math.round((da1 - da2) * 100)/100;
			System.out.println(result);
		}else if (am.equals("/")) {
			result = (double)Math.round((da1 / da2)*100)/100;
			System.out.println(result);
		}else if (am.equals("*")) {
			result = (double)Math.round((da1 * da2)*100)/100;
			System.out.println(result);
		}else {
			System.out.println("연산자는 '+, -, /, *' 만 입력 가능합니다.");
			sc.close();
			return;
		}
		
		//음수, 양수 필터링
		System.out.println((result > 0) ? "양수" : "음수");
	
		
		//큰수,중간수, 작은수 필터링
		System.out.println((result >= 10 ) ? "큰수" : (result >= 5) ? "중간수" : "작은수" );
		

		sc.close();
		System.out.println("End");
	}

}
