package ch04;

public class P127 {

	public static void main(String[] args) {
		// �ֻ����� 2�� ������ �ƿ��� ���� ���� 8�� ������ ��츦 ��� �Ͻÿ�.
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if(i+j == 8) {
					System.out.printf("(%d,%d)\n", i,j);
				}
			}
		}
		

	}

}
