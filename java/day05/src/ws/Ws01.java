package ws;

import java.util.Arrays;
import java.util.Random;

public class Ws01 {

	public static void main(String[] args) {
		// double�� �迭 ������ 5�� �迭�� ����� 0~10 ������ ������ ���� �ִ´�.
		Random r = new Random();
		double ar [] = new double [5];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = Math.floor(r.nextDouble()*11);
		}
		System.out.println(Arrays.toString(ar));
		//���� ����Ѵ�.
		

	}

}
