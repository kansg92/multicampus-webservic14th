package cho4;

import java.util.Random;

public class P121 {

	public static void main(String[] args) {
		//Random�� ���� 2~99������ ������ �߻���Ų��.
			Random r = new Random();
			int n = r.nextInt(98)+2;
			System.out.println(n);
		//1 ���� ���������� �հ� ����� ��� �Ѵ�.
			double sum = 0;
			double count = 0;
			for (int i = 1; i <= n; i++) {
				sum += i ;
				count++;
			}
			System.out.println(sum);
			System.out.println(sum / count);
	}
}
