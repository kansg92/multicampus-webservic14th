package p440;

public class App {

	public static void main(String[] args) {
		Calc calc = new Calc();
		int a = 10;
		int b = 0;
		int result = 0;
//		try {
//			result = calc.div(a, b);
//			System.out.println(result);
//		} catch (ArithmeticException e) {
//			System.out.println("�и� 0�Դϴ�.");
//		}
		try {
			result = calc.div(a,b);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("�и� 0�Դϴ�.");
		}
		
	}

}
