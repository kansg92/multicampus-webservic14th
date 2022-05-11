package p346;

import java.util.ArrayList;
import java.util.Scanner;

import p345.CustomerVO;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start...");
		// OracleDAO�� �ֱ����ؼ��� Ŭ���� �ʱ�ȭ �ʿ�. ��, ����Ŭ�� �����Ǵ� ���α׷����� ������. 
		// CRUD
		DAO dao = new OracleDAO();
		// SEarch
		Search search = new OracleDAO();
		while(true) {
			System.out.println("Input cmd(i,d,s,u,a,q) ...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if (cmd.equals("i")) {
				System.out.println("Input Customer info ..");
				System.out.println("Input Customer id:");
				String id = sc.next();
				System.out.println("Input Customer pwd:");
				String pwd = sc.next();
				System.out.println("Input Customer name:");
				String name = sc.next();
				// customerVO ��ü ����
				p346.CustomerVO c = new p346.CustomerVO(id, pwd, name);
				// OracleDAO�� insert��� ����.
				dao.insert(c);
			}else if (cmd.equals("d")) {
				System.out.println("Input Customer id:");
				String id = sc.next();
				dao.delete(id);
			}else if (cmd.equals("s")) {
				System.out.println("Input Customer id:");
				String id = sc.next();
				p346.CustomerVO c = dao.select(id);
				System.out.println(c);
			}else if (cmd.equals("a")) {
				ArrayList<p346.CustomerVO>list = dao.select();
				for (p346.CustomerVO c : list) {
					System.out.println(c);
				}
			}else if (cmd.equals("u")) {
				System.out.println("Input Customer id:");
				String id = sc.next();
				System.out.println("Input Customer pwd:");
				String pwd = sc.next();
				System.out.println("Input Customer name:");
				String name = sc.next();			
				p346.CustomerVO c = new p346.CustomerVO(id, pwd, name);
				dao.update(c);
			}
		}
		
		sc.close();
		System.out.println("End ...");
		

	}

}
