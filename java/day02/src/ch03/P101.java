package ch03;

public class P101 {

	public static void main(String[] args) {
		int sum = 75;
		char result = 0;
		// 90 이상이면 'A'
		// 80 이상이면 'B'
		// 80 미만이면 'C'
		
//		if (sum >= 90) {
//			result = 'A';
//		}else if (sum >= 80) {
//			result = 'B';
//		}else{
//			result = 'C';
//		}
		//삼항 연산자로 구현 하시오
		
		result = (sum >= 90 ) ? 'A' :  (sum >= 80) ?  'B' : 'C' ;
		
		System.out.println(result);
	}

}
