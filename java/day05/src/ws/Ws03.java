package ws;

import java.util.Random;


public class Ws03 {

	public static void main(String[] args) {
		Random r = new Random();
		int ar [] = new int [5];
		for (int i = 0; i < ar.length; i++) {
			ar [i] = r.nextInt(99)+1;
			for (int j = 0; j < i ; j++) {
				//ar[i]�� �ߺ��ϸ� �ٽ� �ݺ�
				if (ar[i] == ar[j] ) {
					i--;
				}
			}				
		}
	}

}
