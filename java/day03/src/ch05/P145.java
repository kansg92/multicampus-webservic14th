package ch05;

public class P145 {

	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "ABC";
		String s3 = s2.toLowerCase(); // s2의 주소의 값을 소문자로 변경한 후 s3에 담아라.
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		char c = s3.charAt(0);
		System.out.println(c);
	}

}
