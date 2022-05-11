package ws;

import java.util.Arrays;
import java.util.Random;

public class Ws02 {

	public static void main(String[] args) {
		int ar [] = new int [10];
		Random r = new Random();
		double sum = 0;
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(99)+1;
			if (ar[i] % 2 == 1) {
				sum += ar[i];
				count++;	
			}
		}
		System.out.println("ar[]:" + Arrays.toString(ar));
		System.out.println("Че: " + sum);
		System.out.println("ЦђБе:" + sum/count);
	}

}
