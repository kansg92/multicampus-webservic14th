package multiCompany;

public class Manager extends Employee {
	private double bonus;

	public Manager() {
	}

	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}



	public double incentive() {
		return (this.salary * 2) * 1;
	}
	
	
	public double annsalary() {
		double sum = 0.0;
		sum = super.annsalary() +this.bonus;
		return sum;
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", " + super.toString() + "]";
	}

	


	
	
	
}
