package ch04;


public class P124 {

	public static void main(String[] args) {
		outter:
		for (int i = 2; i < 10; i++) {
			if (i%2 == 1 ) {
				continue;
			}
			System.out.println(i + " ´Ü ½ÃÀÛ --------");
			for (int j = 1; j < 10; j++) {
				if ( i * j == 99) {
					break outter;
				}
				System.out.printf("%d * %d = %d \t", i,j,(i*j));
			}
			System.out.println("~~~~~~~~~");
		}

	}

}
