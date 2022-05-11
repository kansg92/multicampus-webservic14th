package simCar;

public class Gas extends Car {
	private boolean auto;
	private String fuelType;
	private double fsize;
	private double cfsize;
	private double fuelE;
		
	// constrctor
	public Gas() {
	
	}
	
	public Gas(String name, String color, String kind, String serial, int power, 
			double fsize, double fuelE) {
		super(name, color, kind, serial, power);
		this.auto = true;
		this.fuelType = "gas";
		this.fsize = fsize;
		this.cfsize = 0;
		this.fuelE = fuelE;
	}
	
	public Gas(String name, String color, String kind, String serial, int power) {
		super(name, color, kind, serial, power);
		
	}



	public Gas(String name, String color, String kind, String serial, int power, String status) {
		super(name, color, kind, serial, power, status);
		
	}

	//getter setter

	public double getCfsize() {
		return cfsize;
	}

	public void setCfsize(int cfsize) {
		this.cfsize = cfsize;
	}

	public boolean isAuto() {
		return auto;
	}

	public String getFuelType() {
		return fuelType;
	}

	public double getFsize() {
		return fsize;
	}

	public double getFuelE() {
		return fuelE;
	}
	
	

	@Override
	public String toString() {
		return "Gas [auto=" + auto + ", fuelType=" + fuelType + ", fsize=" + fsize + ", cfsize=" + cfsize + ", fuelE="
				+ fuelE + ", " + super.toString() + "]";
	}
	
	@Override
	public void go(int distance) {
		if( cfsize <= (distance / fuelE)) {
			distance -= cfsize * fuelE;	
			setStatus("Go");
			System.out.printf("Go %.1fkm. \n", (cfsize * fuelE));	
			System.out.println("�����Ÿ� :"+ distance+"km");
			cfsize -= (cfsize * fuelE) /fuelE;
			setStatus("Stop");
			System.out.println("�� �� �ִ±⸧�� �����ϴ�. �⸧�� �־��ּ���.");
			System.out.println("���� �⸧��:"+ cfsize);
		}else {
			setStatus("Go");		
			cfsize -= distance / fuelE;
			System.out.printf("Go %dkm. \n", distance);	
		}
			
	}
	
	@Override
	public void back(int distance) {
		if( cfsize < (distance / fuelE)) {
			System.out.println("�� �� �ִ� �⸧�� �����մϴ�. �⸧�� �־��ּ���.");
			System.out.println("���� �⸧��:"+ cfsize);
		}else {
			setStatus("Back");		
			cfsize -= distance / fuelE;
			System.out.printf("Back %dkm. \n", distance);	
		}
	}
	
	public void addFuel(int amount) {
		if (fsize < cfsize + amount) {
			System.out.println("fsize���� �������� ���� �� �� �����ϴ�. fsize:"+fsize);
		}else {
			setStatus("Park");
			cfsize += amount;
		}
	}
}
