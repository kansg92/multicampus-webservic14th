package ch02;

public class P43 {

	public static void main(String[] args) {
		int v1 = 10;   // 10����ǥ�� 10
		int v2 = 012;  // 8����ǥ�� 10
		int v3 = 0xA;  // 16����ǥ�� 10
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		byte b1 = 100;
		byte b2 = 30;
		byte b3 = (byte) (b1 + b2);	//  "="�� �������� ���׽���ǰ� ������ �����. ������ ��Ģ������ �Ͼ�� �ڹٿ����� ������ int������ �ν��Ѵ�.
		System.out.println(b3);
		
		long vi1 = 15000000000L;
		long vi2 = 15000000000L;
		long result = vi1 + vi2;
		System.out.println(result);
	}

}
