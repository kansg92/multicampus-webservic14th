package cho4;

public class P130 {

	public static void main(String[] args) {
		// 10���� 1���� ����Ͻÿ�
//		for (int i = 10; i >= 1; i--) {
//			System.out.println("For Loop:" + i);
//		}
		// 7�϶� ������ �����ض�.
		// i�� ¦�� �϶��� ����ض�.
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
