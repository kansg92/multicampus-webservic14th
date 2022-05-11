package cho4;

public class P130 {

	public static void main(String[] args) {
		// 10부터 1까지 출력하시오
//		for (int i = 10; i >= 1; i--) {
//			System.out.println("For Loop:" + i);
//		}
		// 7일때 까지만 실행해라.
		// i가 짝수 일때만 출력해라.
		for (int i = 1; i <= 10; i++) {
			if ( i % 2 == 0) {
				System.out.println("Forr Loop:" + i);		
			}
			if ( i == 7) {
				break;
			}
		}
		System.out.println("------------");
		int s = 1;
		while ( s <= 10) {
			System.out.println("While Loop :" + s);
			if ( s == 7) {
				break;
			}
			s++;
		}
		

	}

}
