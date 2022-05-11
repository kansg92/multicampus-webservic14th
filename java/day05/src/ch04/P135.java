package ch04;

import java.util.Scanner;



public class P135 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start...");
		String snum1 = "";
		String snum2 = "";
		double balance = 0.0;
		while(true) {
			System.out.print("Input cmd(d,w,s,i,q) ... :");
			String cmd = sc.next();
			String error1 = "�����Դϴ�. �ٽ������ϼ���.";
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if (cmd.equals("d")) {
				System.out.println("Deposit ..");
				System.out.print("Amount:");
				snum1 = sc.next();
				System.out.printf("%s���� �Ա� �Ǿ����ϴ�. \n", snum1);
				int amount = Integer.parseInt(snum1);
				if (amount < 0) {
					System.out.println(error1);
					continue;
				}
				balance += amount;
				System.out.printf("�ܾ� : %.2f \n", balance);
			}else if (cmd.equals("w")) {
				System.out.println("Withdraw ..");
				System.out.print("Amount:");
				snum2 = sc.next();
				System.out.printf("%s���� ��� �Ǿ����ϴ�. \n", snum2);
				int amount = Integer.parseInt(snum2);
				if (amount < 0) {
					System.out.println(error1);
					continue;
				}
				if (amount > balance) {
					System.out.println("�ܾ׺���. �ٽ������ϼ���.");
					continue;
				}
				balance -= amount;
				System.out.printf("�ܾ� : %.2f \n", balance);
			}else if (cmd.equals("s")) {
				System.out.printf("�ܾ� : %.2f \n", balance);
			}else if (cmd.equals("i")) {
				// �������� �Է� �ϸ� ���ڰ� �� ������ ��� �Ͻÿ�.
				System.out.println("������ �Է�.");
				System.out.print("Amount:");
				String snum = sc.next();
				double interestRate = Double.parseDouble(snum);
				double interest = balance * (interestRate / 100);
				System.out.printf("�ܾ� : %.2f ����:%.2f ������:%.2f%%  \n " ,balance,interest,interestRate);
			}
		}
		sc.close();
	}

}