package cho4;

public class P120 {

	public static void main(String[] args) {
		// 1 ~ 10������ ���� ���Ͻÿ�.
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
		System.out.println(s); // ������ s++ �Ǹ鼭 s���� 10+1 �̵Ǿ 11�̵�.
		System.out.println(sum2 / (s-1));
	}

}
