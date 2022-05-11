package multiCompany;

public class EmployeeApp {

	public static void main(String[] args) {
		//1. ��� �� ��ü�� �����ϰ� ����Ͻÿ�.
		Employee e[] = new Employee[4];
		e[0] = new Employee("100","kim",350);
		e[1] = new Secretary("101","lee",400,"�����");
		e[2] = new Sales("103","park",280,"����",10000,12550);
		e[3] = new Manager("104","hong",600,1000);
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
		System.out.println("");
		//2. ��� ����� ���� ������ ����Ͻÿ�.
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].getClass().getSimpleName() + "'s ����: " + e[i].annsalary());
		}
		System.out.println("");
		//3. ��� ������� �μ�Ƽ�긦 ����. 
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].getClass().getSimpleName() + "'s �μ�Ƽ��: "+e[i].incentive());
		}		
	}

}
