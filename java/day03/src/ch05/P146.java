package ch05;

public class P146 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		if(a > b) {
			System.out.println("OK");
		}else {
			System.out.println("NO");
		}
		
		String s1 = "abc";
		String s2 = "abc";	
		if(s1 == s2) { // 주소(reference)를 비교하는것.
			System.out.println("Equals Reference ..");
		} 	
		if (s1.equals(s2)) { // String 안의 값(value)을 비교하는것
			System.out.println("Equals String..");
		}

	}

}
