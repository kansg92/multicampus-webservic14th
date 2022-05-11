package multiCompany;

public class EmployeeApp {

	public static void main(String[] args) {
		//1. 사원 별 객체를 생성하고 출력하시오.
		Employee e[] = new Employee[4];
		e[0] = new Employee("100","kim",350);
		e[1] = new Secretary("101","lee",400,"이재용");
		e[2] = new Sales("103","park",280,"강남",10000,12550);
		e[3] = new Manager("104","hong",600,1000);
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
		System.out.println("");
		//2. 모든 사원의 연봉 정보를 출력하시오.
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].getClass().getSimpleName() + "'s 연봉: " + e[i].annsalary());
		}
		System.out.println("");
		//3. 모든 사원에게 인센티브를 지급. 
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].getClass().getSimpleName() + "'s 인센티브: "+e[i].incentive());
		}		
	}

}
