package company;

public class Manager extends Employee {
	private double bonus;

	public Manager() {
	}

	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}
	
	

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	// ¿Á¡§¿« - overriding
	@Override
	public double annsalary() {
		double sum = 0.0;
//		sum = salary * 12 + this.bonus;
		sum = super.annsalary() + this.bonus;
		return sum;
	}
	public double getBonusTex() {
		double tex = 0.0 ;
		tex = this.bonus * 1.1 ;
		return tex;
	}
	
	
	
	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
	}

	
	


	
}
