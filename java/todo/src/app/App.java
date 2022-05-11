package app;

import java.util.List;
import java.util.Scanner;

import dao.ToDoDAO;
import frame.DAO;
import vo.ToDoVO;


public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start...");
		// OracleDAO�� �ֱ����ؼ��� Ŭ���� �ʱ�ȭ �ʿ�. ��, ����Ŭ�� �����Ǵ� ���α׷����� ������. 
		ToDoDAO oracledao = new ToDoDAO();
		DAO<String, ToDoVO> dao = oracledao;
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
				try {
					dao.insert(c);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}else if (cmd.equals("d")) {
				System.out.println("Input order:");
				try {
					dao.delete();
				} catch (Exception e) {
					System.out.println(e.getMessage()); 
				}
			}else if (cmd.equals("s")) {
				System.out.println("Input order:");
				String id = sc.next();
				Object c;
				try {
					c = dao.select(id);
					System.out.println(c.toString());                                                            
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}else if (cmd.equals("a")) {
				List<ToDoVO> list;
				try {
					list = dao.select();
					for (ToDoVO c : list) {
						System.out.println(c.toString());
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}else if (cmd.equals("u")) {
				System.out.println("Input order:");
				String id = sc.next();			
				Object c;
				try {
					c = dao.update(id);
					System.out.println(c);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}else if (cmd.equals("f")) {
				System.out.println("Input when:");
				String when = sc.next();
				List<ToDoVO> list;
				try {
					list = dao.search(when);
					for (ToDoVO c : list) {
						System.out.println(c);
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());;
				}

			}
		}
		
		sc.close();
		System.out.println("End ...");
		

	}

}
