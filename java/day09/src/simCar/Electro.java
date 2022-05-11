package simCar;

public class Electro extends Car {
	private double batterySize;
	private double cBattery;
	private double batteryE;
	
	
	// constructor
	public Electro() {
	}

	public Electro(String name, String color, String kind, String serial, int power, double batterySize,
			 double batteryE) {
		super(name, color, kind, serial, power);
		this.batterySize = batterySize;
		this.cBattery = 0;
		this.batteryE = batteryE;
	}



	public Electro(String name, String color, String kind, String serial, int power) {
		super(name, color, kind, serial, power);
	}

	public Electro(String name, String color, String kind, String serial, int power, String status) {
		super(name, color, kind, serial, power, status);
	}



	public double getcBattery() {
		return cBattery;
	}



	public void setcBattery(double cBattery) {
		this.cBattery = cBattery;
	}



	public double getBatterySize() {
		return batterySize;
	}



	public double getBatteryE() {
		return batteryE;
	}



	@Override
	public String toString() {
		return "Elcetronic [batterySize=" + batterySize + ", cBattery=" + cBattery + ", batteryE=" + batteryE
				+ ", " + super.toString() + "]";
	}


	@Override
	public void go(int distance) {
		if (cBattery >= distance / batteryE ) {
			setStatus("Go");
			cBattery -= distance / batteryE;
			System.out.printf("Go %dkm. \n", distance);
		}else if ( cBattery < distance / batteryE ) {
			System.out.println("전기가 부족합니다. 충전해주세요.");
			System.out.println("현재 충전양:"+ cBattery);
		}
	}
	
	@Override
	public void back(int distance) {
		if (cBattery >= distance / batteryE ) {
			setStatus("Back");
			cBattery -= distance / batteryE;
			System.out.printf("Back %dkm. \n", distance);
		}else if ( cBattery < distance / batteryE ) {
			System.out.println("전기가 부족합니다. 충전해주세요.");
			System.out.println("현재 충전양:"+ cBattery);
		}
	}
	
	public void charge(int amount) {
		if(batterySize < cBattery + amount) {
			cBattery = batterySize;
			System.out.println("100% 충전되었습니다.");
		}else {
			setStatus("Park");
			cBattery += amount;
			System.out.printf("%d만큼 충전되었습니다.\n" , amount);
			System.out.println("cBattery:"+cBattery);
		}

	}

}
