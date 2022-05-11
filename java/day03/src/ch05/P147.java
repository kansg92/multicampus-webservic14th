package ch05;

public class P147 {

	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = new String("ABC"); // String의 새로운 HEAP's 데이터인 주소를 만듦
		String s3 = "ABC";
		String s4 = new String("ABC"); // String의 새로운 HEAP's 데이터인 주소를 만듦
		
		if (s1 == s2) {
			System.out.println("Equals Reference");
		}else {
			System.out.println("Not equals refernece");
		}// 결과값 : Not equals refernece
		
		if (s1 == s3) {
			System.out.println("Equals Reference");
		}else {
			System.out.println("Not equals refernece");
		}// 결과값 : Equals Reference
		
		if (s2 == s4) {
			System.out.println("Equals Reference");
		}else {
			System.out.println("Not equals refernece");
		}// 결과값 : Not equals String
		
		
		if (s1.equals(s2)) {
			System.out.println("Equals String");
		}else {
			System.out.println("Not equals String");
		}// 결과값 : Equals String
		

		
	}

}
