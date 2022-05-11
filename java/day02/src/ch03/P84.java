package ch03;

public class P84 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int result; // b값이 0이여서 아래 if문이 실행이 되지않아 오류가 발생된다. result = 0; 으로 초기화를 해주어야 오류가 안남.
		if (b != 0) {
			result = a / b;
		}
//		double result = (double)a / (double)b ;
//		System.out.println(result);
	}

}
