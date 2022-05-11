package bank;

import java.util.Random;
import java.util.Scanner;

public class AccountApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start...");
		Account acc = null;
		String accNo ="";
		Random r = new Random();	
		
		while(true) {
			System.out.println("Input cmd(c,d,w,s,q) ...");
			String cmd = sc.next();
			try {	
				if(cmd.equals("q")) {
					System.out.println("Bye");
					break;
				}else if (cmd.equals("c")) {
					System.out.println("���� �����մϴ� ...");
					System.out.println("���� ������ ...");
					// 000000-00-000000
					int accNo1 =r.nextInt(1000000);
					int accNo2 =r.nextInt(100);
					int accNo3 =r.nextInt(1000000);
					accNo = new String(accNo1 + "-" + accNo2 + "-"+ accNo3);
					acc = new Account(accNo);
					System.out.println("���°� �����Ǿ����ϴ�.");				
					System.out.println("����� ���¹�ȣ: " + accNo);			
				}else if (cmd.equals("d")) {
					System.out.println("�Ա� �ݾ��� �Է��ϼ���.");
					double dm = Double.parseDouble(sc.next());
					acc.deposit(dm);
					System.out.println("�Ա� �ݾ� :" + dm ); 
					System.out.println("���� �ܾ� :" + acc.getBalance()); 
				}else if (cmd.equals("w")) {
					System.out.println("��� �ݾ��� �Է��ϼ���.");
					double wm = Double.parseDouble(sc.next());
					acc.withdraw(wm);
					System.out.println("��� �ݾ� :" + wm ); 
					System.out.println("���� �ܾ� :" + acc.getBalance());
				}else if  (cmd.equals("s")) {
					System.out.println("�� ���¹�ȣ:" + accNo );
					System.out.println("���� �ܾ� :" + acc.getBalance());			
				}
			
				} catch (Exception e) {
					System.out.println("���ڸ� �Է� �����մϴ�. �ٽ� �����ϼ���.");
					continue;
			}
			
		}
		
		sc.close();
		System.out.println("End ...");

	}

}
