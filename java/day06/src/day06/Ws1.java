package day06;

import java.util.Arrays;
import java.util.Random;

public class Ws1 {

	public static void main(String[] args) {
		Random r = new Random();
		int ar [] = new int [5];
		int max = 0;
		int min = 0;		
		for (int i = 0; i < ar.length; i++) {
			ar [i] = r.nextInt(9)+1;
			if (min == 0) {
				min = ar[i];
			} else if (min > ar[i]) {
				min = ar[i];
			}			
			if (max < ar[i]) {
				max = ar[i];
			}				
		}
		System.out.println(Arrays.toString(ar));
		System.out.printf("최댓값:%d, 최소값:%d \n", max,min);
	}

}
