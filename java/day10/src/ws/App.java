package ws;

import java.util.ArrayList;
import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start...");
		// OracleDAO�� �ֱ����ؼ��� Ŭ���� �ʱ�ȭ �ʿ�. ��, ����Ŭ�� �����Ǵ� ���α׷����� ������. 
		OracleDAO oracledao = new OracleDAO();
		DAO dao = oracledao;
		Search search = oracledao;
		while(true) {
			System.out.println("Input cmd(i,d,s,u,a,f,q) ...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if (cmd.equals("i")) {
				System.out.println("Input todolist ..");
				System.out.println("Input order..");
				String id = sc.next();
				System.out.println("Input when..");
				String pwd = sc.next();
				System.out.println("Input what..");
				String name = sc.next();
				// customerVO ��ü ����
				ToDoVO c = new ToDoVO(id, pwd, name);
				// OracleDAO�� insert��� ����.
				dao.insert(c);
			}else if (cmd.equals("d")) {
				System.out.println("Input order:");
				String id = sc.next();
				dao.delete(id);
			}else if (cmd.equals("s")) {
				System.out.println("Input order:");
				String id = sc.next();
				ToDoVO c = dao.select(id);
				System.out.println(c);
			}else if (cmd.equals("a")) {
				ArrayList<ToDoVO>list = dao.select();
				for (ToDoVO c : list) {
					System.out.println(c);
				}
			}else if (cmd.equals("u")) {
				System.out.println("Input order:");
				String id = sc.next();			
				ToDoVO c = dao.update(id);
				System.out.println(c);
			}else if (cmd.equals("f")) {
				System.out.println("Input when:");
				String when = sc.next();
				ArrayList<ToDoVO> list = search.search(when);
				for (ToDoVO c : list) {
					System.out.println(c);
				}
			}
		}
		
		sc.close();
		System.out.println("End ...");
		

	}

}
