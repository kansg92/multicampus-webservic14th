package ch02;

public class P43 {

	public static void main(String[] args) {
		int v1 = 10;   // 10진수표현 10
		int v2 = 012;  // 8진수표현 10
		int v3 = 0xA;  // 16진수표현 10
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		byte b1 = 100;
		byte b2 = 30;
		byte b3 = (byte) (b1 + b2);	//  "="가 있을때는 우항실행되고 좌항이 실행됨. 정수의 사칙연산이 일어나면 자바에서는 무조건 int형으로 인식한다.
		System.out.println(b3);
		
		long vi1 = 15000000000L;
		long vi2 = 15000000000L;
		long result = vi1 + vi2;
		System.out.println(result);
	}

}
