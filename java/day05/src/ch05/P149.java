package ch05;


public class P149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ar [] = new int[4]; // 객체가 4개인 int 배열 생성.
		ar[0] = 0;
		ar[1] = 1;
		ar[2] = 2;
		ar[3] = 3;

		System.out.println(ar); //주소값이 찍힌다.		
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]); // 각 배열의 값 출력.
		}
	}

}
