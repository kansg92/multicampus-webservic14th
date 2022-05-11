package cho4;

public class P120 {

	public static void main(String[] args) {
		// 1 ~ 10까지의 합을 구하시오.
		int avg = 0;
		int count = 0;
		int sum = 0;
		for ( int i = 1; i <= 10; i++) {
			sum += i ;
			avg = sum / i;
			count++;
		}
		System.out.println(sum);		
		System.out.println(avg);
		System.out.println(sum / count);
		
		int s = 1;
		int sum2 = 0;
		while (s <= 10) {
			sum2 += s;
			s++;
		}
		System.out.println(sum2);
		System.out.println(s); // 마지막 s++ 되면서 s값은 10+1 이되어서 11이됨.
		System.out.println(sum2 / (s-1));
	}

}
