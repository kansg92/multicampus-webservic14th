package company;

public class CompanyApp {

	public static void main(String[] args) {
		Employee e = new Employee("100","james", 300);
		System.out.println(e);
		System.out.println(e.annsalary());
		
		Manager m = new Manager("101","lee",300,500);
		System.out.println(m);
		System.out.println(m.annsalary());
		System.out.println(m.getBonusTex());
	}

}
