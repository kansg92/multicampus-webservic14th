package ch05;

import java.util.Arrays;
import java.util.Random;

public class P150 {

	public static void main(String[] args) {
		int ar [] = new int[10];

		//for문을 이용하여 1 ~ 9까지 난수를 만들어 배열에 넣어라.
		Random r = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(9)+1;
		}
		// 배열 내용을 출력 하시오.
		System.out.println(Arrays.toString(ar));
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + (double)sum/ar.length);
	}

}
