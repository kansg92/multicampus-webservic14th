package ch05;

public class P147 {

	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = new String("ABC"); // String�� ���ο� HEAP's �������� �ּҸ� ����
		String s3 = "ABC";
		String s4 = new String("ABC"); // String�� ���ο� HEAP's �������� �ּҸ� ����
		
		if (s1 == s2) {
			System.out.println("Equals Reference");
		}else {
			System.out.println("Not equals refernece");
		}// ����� : Not equals refernece
		
		if (s1 == s3) {
			System.out.println("Equals Reference");
		}else {
			System.out.println("Not equals refernece");
		}// ����� : Equals Reference
		
		if (s2 == s4) {
			System.out.println("Equals Reference");
		}else {
			System.out.println("Not equals refernece");
		}// ����� : Not equals String
		
		
		if (s1.equals(s2)) {
			System.out.println("Equals String");
		}else {
			System.out.println("Not equals String");
		}// ����� : Equals String
		

		
	}

}
