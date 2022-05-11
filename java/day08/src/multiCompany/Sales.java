package multiCompany;

public class Sales extends Employee{
	private String region;
	private double goal;
	private double challenge;
	
	public Sales() {
	}

	public Sales(String id, String name, double salary, String region, double goal, double challenge) {
		super(id, name, salary);
		this.region = region;
		this.goal = goal;
		this.challenge = challenge;
	}
	

	
	public double incentive () {
		double incen = 0.0;
		if(goal <= challenge) {
			incen = goal * 0.3;
			incen += 500;
		}
		return incen;
	}
	
	public double annsalary() {
		return salary * 12 + incentive();
	}

	@Override
	public String toString() {
		return "Sales [region=" + region + ", goal=" + goal + ", challenge=" + challenge + ", Id=" + getId()
				+ ", Name=" + getName() + ", Salary=" + getSalary() + "]";
	}
	
	
	
	
}
