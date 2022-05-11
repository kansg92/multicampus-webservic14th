package ch04;

public class P126 {

	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {
//		
//			for (int j = 0; j < 5; j++) {
//				System.out.printf("(%d,%d)", i, j );
//			}
//			System.out.println("");
//		}
		int a = 0;
		while(a < 5) {
//			System.out.println("a:"+a);
			int b = 0;
			while(b < 5) {
//				System.out.println("b:" + b);
				System.out.printf("(%d,%d)", a,b );
				b++;
			}
			System.out.println("");
			a++;	
		}
		

	}

}
