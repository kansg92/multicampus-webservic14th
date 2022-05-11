package ws;

import java.util.Random;


public class Ws03 {

	public static void main(String[] args) {
		Random r = new Random();
		int ar [] = new int [5];
		for (int i = 0; i < ar.length; i++) {
			ar [i] = r.nextInt(99)+1;
			for (int j = 0; j < i ; j++) {
				//ar[i]와 중복하면 다시 반복
				if (ar[i] == ar[j] ) {
					i--;
				}
			}				
		}
	}

}
