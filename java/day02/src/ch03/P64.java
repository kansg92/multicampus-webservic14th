package ch03;

public class P64 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 20;
		
		//���� ������
		int aa = -a;
		int bb = ++b;
		int cc = c++;
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(c);
		
		int d = 10;
		int e = 10;
		int sum = d++ + ++e;
		System.out.println(sum);
		System.out.println(d);
		System.out.println(e);
		
		// ���׿�����
		int result = a % b ;
		System.out.println(result);
		int data = 100;
		// data = data + 1;
		data += 1;
		System.out.println(data);
		
		//�񱳿�����
		int a1 = 10;
		int a2 = 20;
		
		if (a1 <= a2) {
			System.out.println("OK");
		}else {
			System.out.println("FAIL");
		}
		
		//��������
		int b1 = 10;
		int b2 = 20;
		int d1 = 10;
		int d2 = 20;
		if( (b1 > b2) && (d1 < d2++) ) {
			System.out.println("OK");
		}else {
			System.out.println("FAIL");
			System.out.println(d2);
		}
		if( !(b1 > b2) ) {
			System.out.println("b2�� ũ��.");
		}else {
			System.out.println("b1�� ũ��.");
		}
		
		
		// ���׿���
		int e1 = 10;
		int e2 = 20;
		int eresult = 0;
		
		if (e1 <= e2) {
			eresult = 100;
		}else {
			eresult = 200;
		}
		System.out.println(eresult);
		
		int eresult2 = (e1 <= e2) ? 100 : 200;
		
		System.out.println(eresult2);
		
	}

}
