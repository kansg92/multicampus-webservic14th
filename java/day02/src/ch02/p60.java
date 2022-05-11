package ch02;

public class p60 {

	public static void main(String[] args) {
		byte b1 = 10;
		float f1 = 2.5F;
		double d2 = 2.5;
		
//		byte bb = b1 + b1;
		byte bb = (byte)(b1 + b1);
		System.out.println(bb);
		
		int result = 5 + b1;
		float ff = 5 + f1;
		double dd = 5 + d2;
//		int reslut2 = 100 + d2;
		int reslut = 100 + (int)d2;
		
		System.out.println(result);
		System.out.println(ff);
		System.out.println(dd);
		
	}

}
