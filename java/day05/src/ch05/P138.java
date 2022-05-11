package ch05;

public class P138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
//		String s4 = new String("abc");
		String s5 = null;
		
		System.out.println(s5);
		
		char c = s1.charAt(1);
		System.out.println(c);
		
		int len = s2.length();
		System.out.println(len);
		
		String ns = s3.toUpperCase();
		System.out.println(ns);
				
	}

}
