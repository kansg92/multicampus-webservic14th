package ch03;

public class Ws0405 {

	public static void main(String[] args) {
		double a = 5.0;
		double b = 7.0;
		double c = 0.0;
		
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) );
		System.out.println((double)Math.round(c*100)/100);
		
		long result = 10000000000L;
		
		System.out.println(String.format("%,d", result));
					
		

	}

}
