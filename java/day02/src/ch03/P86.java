package ch03;

public class P86 {

	public static void main(String[] args) {
		String str = "NaN";
		char c = 'A';
		double a = Double.valueOf(str); // ��Ʈ���� ������ �ٲپ��ִ� �Լ�
		double result = 5.0;
		
		if (Double.isNaN(a)) {
			System.out.println("�Է� ����");
		}else {
			result = a * 100;
		}
		
		
		int b = (int)c ; // int���� ���������� �� �� �ִ�. ����� : 65
		// int a (int)str; // int type ���� "" type�� ���ü� ���� ����������.
		
		System.out.println(b);
		System.out.println(result);
	}

}
