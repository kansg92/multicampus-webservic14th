package cho4;

public class P131 {

	public static void main(String[] args) {
		// 10���� 1���� ����Ͻÿ�
//		for (int i = 10; i >= 1; i--) {
//			System.out.println("For Loop:" + i);
//		}
		// i�� ¦�� �϶��� ����ض�.
		for (int i = 1; i <= 10; i++) {
			if ( i % 2 == 1) {
				continue;
			}
			System.out.println("Foor Loop:" + i);
		}
		System.out.println("------------");
		int s = 1;
		while ( s <= 10) {
			if ( s % 2 == 1) {
				s++;
				continue;
			}
			System.out.println("While Loop :" + s);
			s++;
		}
		

	}

}
