 package ch03;

public class P85 {

	public static void main(String[] args) {
		int a = 100;
		double b = 0.0;
		double result = 0.0;
		
		result = a / b;
		
		String result2 = (Double.isInfinite(result)) ?  "�и� 0.0 �Դϴ�." : Double.toString(result) ;
		
		System.out.println(result2);
	}

}
