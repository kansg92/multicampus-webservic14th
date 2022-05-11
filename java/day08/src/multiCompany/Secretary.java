package multiCompany;

public class Secretary extends Employee{
	private String boss;

	public Secretary() {
	}
	
	
	
	
	public Secretary(String id, String name, double salary, String boss) {
		super(id, name, salary);
		this.boss = boss;
	}




	public double incentive()	{
		return (salary * 2) * 0.6;
	}
	
	
	public double annsalary() {
		return salary * 12 + incentive();
	}




	@Override
	public String toString() {
		return "Secretary [boss=" + boss + ", Id=" + getId() + ", Name=" + getName() + ", Salary="
				+ getSalary() + "]";
	}

	
	
	
	
}
