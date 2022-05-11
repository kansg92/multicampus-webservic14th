package ch02;

public class P39 {

	public static void main(String[] args) {
		byte b1 = 127; // byte는 -128 ~ 127 까지만 처리할 수 있다.
		System.out.println(b1);
		
		char c1 = 'A';  //character는 한글자만 가능하다. 작은따옴표 ' ' 안에 있어야만 한다.
		System.out.println(c1);
		
		char c2 = '\uAC00'; // 유니코드 한글 '가'
		System.out.println(c2);
	}

}
