package simCar;

public abstract class Car {
	private String name;
	private String color;
	private String kind;
	private String serial;
	private int power;
	private String status;
//	private int maxPeople;
//	private int madeYear;
//	private int year;

	
	// constructor
	public Car() {
	}

	public Car(String name, String color, String kind, String serial, int power) {
		this.name = name;
		this.color = color;
		this.kind = kind;
		this.serial = serial;
		this.power = power;
		this.status = "Park";
	}
	

	public Car(String name, String color, String kind, String serial, int power, String status) {
		this.name = name;
		this.color = color;
		this.kind = kind;
		this.serial = serial;
		this.power = power;
		this.status = status;
	}

	// getter, setter
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public String getKind() {
		return kind;
	}

	public String getSerial() {
		return serial;
	}

	public int getPower() {
		return power;
	}

	
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", kind=" + kind + ", serial=" + serial + ", power=" + power
				+ ", status=" + status + "]";
	}
	
	
	//method
	public abstract void go (int distance); 
//		System.out.printf("Go %dkm. \n", distance);
//		setStatus("Go");
	public abstract void back (int distance);
//		System.out.printf("back %dkm. \n", distance);
//		setStatus("Stop");
	
	public void stop () {
		setStatus("Stop");
	}
	public void park() {
		setStatus("Park");
	}
	
	
	
}
