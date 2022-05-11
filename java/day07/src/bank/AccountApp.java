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
					System.out.println("계좌 생성합니다 ...");
					System.out.println("계좌 생성중 ...");
					// 000000-00-000000
					int accNo1 =r.nextInt(1000000);
					int accNo2 =r.nextInt(100);
					int accNo3 =r.nextInt(1000000);
					accNo = new String(accNo1 + "-" + accNo2 + "-"+ accNo3);
					acc = new Account(accNo);
					System.out.println("계좌가 생성되었습니다.");				
					System.out.println("당신의 계좌번호: " + accNo);			
				}else if (cmd.equals("d")) {
					System.out.println("입금 금액을 입럭하세요.");
					double dm = Double.parseDouble(sc.next());
					acc.deposit(dm);
					System.out.println("입금 금액 :" + dm ); 
					System.out.println("현재 잔액 :" + acc.getBalance()); 
				}else if (cmd.equals("w")) {
					System.out.println("출금 금액을 입럭하세요.");
					double wm = Double.parseDouble(sc.next());
					acc.withdraw(wm);
					System.out.println("출금 금액 :" + wm ); 
					System.out.println("현재 잔액 :" + acc.getBalance());
				}else if  (cmd.equals("s")) {
					System.out.println("내 계좌번호:" + accNo );
					System.out.println("현재 잔액 :" + acc.getBalance());			
				}
			
				} catch (Exception e) {
					System.out.println("숫자만 입력 가능합니다. 다시 선택하세요.");
					continue;
			}
			
		}
		
		sc.close();
		System.out.println("End ...");

	}

}
