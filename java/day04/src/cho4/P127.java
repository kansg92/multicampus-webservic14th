package cho4;

import java.util.Scanner;

public class P127 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start...");
		
		while(true) {
			System.out.println("Input cmd(w1,w2,q) ...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if (cmd.equals("w1")) {
				System.out.println("w1 Input number ..");
				String snum = sc.next();
				System.out.println(snum);
			}else if (cmd.equals("w2")) {
				System.out.println("w1 Input number ..");
				String snum = sc.next();
				System.out.println(snum);

			}
		}
		
		sc.close();
		System.out.println("End ...");
	}

}

