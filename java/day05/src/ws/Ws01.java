package ws;

import java.util.Arrays;
import java.util.Random;

public class Ws01 {

	public static void main(String[] args) {
		// double형 배열 사이즈 5인 배열을 만들고 0~10 사이의 랜덤한 값을 넣는다.
		Random r = new Random();
		double ar [] = new double [5];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = Math.floor(r.nextDouble()*11);
		}
		System.out.println(Arrays.toString(ar));
		//값을 출력한다.
		

	}

}
