 package ch03;

public class P85 {

	public static void main(String[] args) {
		int a = 100;
		double b = 0.0;
		double result = 0.0;
		
		result = a / b;
		
		String result2 = (Double.isInfinite(result)) ?  "분모가 0.0 입니다." : Double.toString(result) ;
		
		System.out.println(result2);
	}

}
