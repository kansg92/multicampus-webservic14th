package ws;

import java.util.Arrays;


public class Ws04 {

	public static void main(String[] args) {
		int[][] ar = {
				{100,98,80,70},
				{98,91,83,72},
				{89,96,82,75},
		};
		double sum1 = 0.0;
		double sum2 = 0.0;
		double sum3 = 0.0;	
		for (int i = 0; i <= ar.length; i++) {
			sum1 += ar[0][i];
			sum2 += ar[1][i];
			sum3 += ar[2][i];
		}
		double sum = sum1 + sum2 + sum3 ;
		System.out.printf("a학생 전체점수: %.2f, 평균점수: %.2f \n", sum1, sum1/4);
		System.out.printf("b학생 전체점수: %.2f, 평균점수: %.2f \n", sum2, sum2/4);
		System.out.printf("c학생 전체점수: %.2f, 평균점수: %.2f \n", sum3, sum3/4);
		System.out.println("전체 점수 합 :" + sum);
		System.out.println("전체 평균 :" + Math.round(sum / 12*100) / 100D);
		
		double ar2 []  = new double[3];
		ar2[0] = sum1/4 ;
		ar2[1] = sum2/4 ;
		ar2[2] = sum3/4 ;
		System.out.println("학생별 평균 점수 :" + Arrays.toString(ar2));
		
		
	}

}
