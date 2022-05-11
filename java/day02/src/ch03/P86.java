package ch03;

public class P86 {

	public static void main(String[] args) {
		String str = "NaN";
		char c = 'A';
		double a = Double.valueOf(str); // 스트링을 정수로 바꾸어주는 함수
		double result = 5.0;
		
		if (Double.isNaN(a)) {
			System.out.println("입력 오류");
		}else {
			result = a * 100;
		}
		
		
		int b = (int)c ; // int에는 정수형값이 들어갈 수 있다. 결과값 : 65
		// int a (int)str; // int type 에는 "" type이 들어올수 없어 에러가난다.
		
		System.out.println(b);
		System.out.println(result);
	}

}
