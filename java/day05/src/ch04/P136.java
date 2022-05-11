package ch04;

import java.util.Scanner;



public class P136 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start...");
		int num1 = 0;
		int num2 = 0;
		String snum1 = "";
		String snum2 = "";
		while(true) {
			System.out.print("Input cmd(d,w,s,q) ... :");
			String cmd = sc.next();
//			num1 += num1;
//			System.out.printf("통장 잔고 : %d원 \n", (num1-num2));
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if (cmd.equals("d")) {
				System.out.println("Deposit ..");
				System.out.print("Amount:");
				snum1 = sc.next();
				System.out.printf("%s원이 입금 되었습니다. \n", snum1);
				num1 = Integer.parseInt(snum1);
			}else if (cmd.equals("w")) {
//				if(num1 < num2) {
//					System.out.println("");
//				}
				System.out.println("Withdraw ..");
				System.out.print("Amount:");
				snum2 = sc.next();
				System.out.printf("%s원이 출금 되었습니다. \n", snum2);
				num2 = Integer.parseInt(snum2);
			}else if (cmd.equals("s")) {
				System.out.printf("%s원이 남아있습니다.", (num1-num2) );
			}
		}
		sc.close();
	}

}