package ch05;

public class P151 {

	public static void main(String[] args) {
		int ar [] = {1,2,3,4,5,6,7,8,9};
		
		// 배열에 홀수 번째 값들의 합을 구하시오
		double odsum = 0;
		int count = 0;
		for (int i = 0; i < ar.length; i += 2 ) {
			odsum += ar[i];
			System.out.print(ar[i]);
			count++;
		}
		System.out.println("");
		System.out.println(odsum);
		System.out.println(odsum / count);
	}

}
