package ch05;


import java.util.Random;

public class P153 {

	public static void main(String[] args) {
		int ar [][] = new int [3][];
		ar[0] = new int[3];
		ar[1] = new int[3];
		ar[2] = new int[3];
		Random r =new Random();
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = r.nextInt(9)+1;
			
			}
		}
		//출력
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.printf("%d \t",ar[i][j]);
			}
			System.out.println("");
		}
		
		//for문을 이용하여 합과 평균을 구하시오
		double sum = 0.0;
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				count++;
				sum +=ar[i][j];
			}
		}
		System.out.println(sum);
		System.out.println(sum / count );
	
		
	}

}
