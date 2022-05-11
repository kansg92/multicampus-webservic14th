package day06;

import java.util.Arrays;
import java.util.Random;

public class Ws2 {

	public static void main(String[] args) {
		Random r = new Random();
		int ar [] = new int [6];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i ;
		}		
		for (int i = 0; i < ar.length; i++) {
			ar [i] = r.nextInt(9)+1;
			for (int j = 0; j < i ; j++) {
				if (ar[i] == ar[j] ) {
					i--;
				}
			}
			sum -= ar[i];			
		}		
		System.out.println(Arrays.toString(ar));
		System.out.println(sum);
	}

}
