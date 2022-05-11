package simCar;

public class Plug extends Car {
	private String fuelType;
	private double fsize;
	private double cfsize;
	private double fuelE;
	private double batterySize;
	private double cBattery;
	private double batteryE;
	private boolean eMod;
	
	public Plug() {
	}
	
	public Plug(String name, String color, String kind, String serial, int power, double fsize,
			 double fuelE, double batterySize, double batteryE) {
		super(name, color, kind, serial, power);
		this.fuelType = "gas";
		this.fsize = fsize;
		this.cfsize = 0;
		this.fuelE = fuelE;
		this.batterySize = batterySize;
		this.cBattery = 0;
		this.batteryE = batteryE;
		this.eMod = true;
	}

	public Plug(String name, String color, String kind, String serial, int power) {
		super(name, color, kind, serial, power);
	}

	public Plug(String name, String color, String kind, String serial, int power, String status) {
		super(name, color, kind, serial, power, status);
	}
	
	public boolean iseMod() {
		return eMod;
	}

	public void seteMod(boolean eMod) {
		this.eMod = eMod;
	}

	public String getFuelType() {
		return fuelType;
	}

	public double getFsize() {
		return fsize;
	}

	public double getCfsize() {
		return cfsize;
	}

	public double getFuelE() {
		return fuelE;
	}

	public double getBatterySize() {
		return batterySize;
	}

	public double getcBattery() {
		return cBattery;
	}

	public double getBatteryE() {
		return batteryE;
	}

	
	@Override
	public String toString() {
		return "Plug [fuelType=" + fuelType + ", fsize=" + fsize + ", cfsize=" + cfsize + ", fuelE=" + fuelE
				+ ", batterySize=" + batterySize + ", cBattery=" + cBattery + ", batteryE=" + batteryE + ", eMod="
				+ eMod + ", " + super.toString() + "]";
	}

	@Override
	// ��� ��ȯ �˰��� ���� �ʿ�. distance�ٰ� ���͸� ������ �⸲���� �����ȯ.
	public void go(int distance) {
		if (cBattery > distance / batteryE ) {
			setStatus("Go");
			cBattery -= distance / batteryE;
			System.out.printf("Go %dkm. \n", distance);	
			System.out.println("���� ���͸�:"+ cBattery);
		}else if (cBattery < distance / batteryE) {
				distance -= cBattery * batteryE;				
				System.out.printf("Emod : Go %.1fkm. \n", (cBattery * batteryE));	
				cBattery -= (cBattery * batteryE) / batteryE;
				System.out.println("���� �⸧��:"+ cfsize);
				System.out.println("���� ���͸�:"+ cBattery);
				System.out.println("���⸦ ��� ����Ͽ� ��带 ��ȯ�մϴ�.");
				seteMod(false);			
			if(cfsize >= (distance / fuelE) ) {
				setStatus("Go");		
				cfsize -= distance / fuelE;
				System.out.printf("Fmod : Go %dkm. \n", distance);	
				System.out.println("���� �⸧��:"+ cfsize);
				System.out.println("���� ���͸�:"+ cBattery);
			}else if ( cfsize < (distance / fuelE) ) {
				distance -= cfsize * fuelE;			
				setStatus("Stop");
				System.out.printf("Fmod : Go %.1fkm. \n", (cfsize * fuelE));	
				System.out.println("�����Ÿ� :"+ distance+"km");
				cfsize -= (cfsize * fuelE) /fuelE;
				System.out.println("�� �� �ִ±⸧�� �����ϴ�. �⸧�� �־��ּ���.");
				System.out.println("���� �⸧��:"+ cfsize);
				System.out.println("���� ���͸�:"+ cBattery);
			}
		}	
	}
	
	@Override 
	public void back(int distance) {
		if (cBattery > distance / batteryE ) {
			setStatus("Back");
			cBattery -= distance / batteryE;
			System.out.printf("Back %dkm. \n", distance);	
			System.out.println("���� ���͸�:"+ cBattery);
		}else if (cBattery < distance / batteryE) {
				distance -= cBattery * batteryE;				
				System.out.printf("Emod : Back %.1fkm. \n", (cBattery * batteryE));	
				cBattery -= (cBattery * batteryE) / batteryE;
				System.out.println("���� �⸧��:"+ cfsize);
				System.out.println("���� ���͸�:"+ cBattery);
				System.out.println("���⸦ ��� ����Ͽ� ��带 ��ȯ�մϴ�.");
				seteMod(false);			
			if(cfsize >= (distance / fuelE) ) {
				setStatus("Back");		
				cfsize -= distance / fuelE;
				System.out.printf("Fmod : Back %dkm. \n", distance);	
				System.out.println("���� �⸧��:"+ cfsize);
				System.out.println("���� ���͸�:"+ cBattery);
			}else if ( cfsize < (distance / fuelE) ) {
				distance -= cfsize * fuelE;			
				setStatus("Stop");
				System.out.printf("Fmod : Back %.1fkm. \n", (cfsize * fuelE));	
				System.out.println("�����Ÿ� :"+ distance+"km");
				cfsize -= (cfsize * fuelE) /fuelE;
				System.out.println("�� �� �ִ±⸧�� �����ϴ�. �⸧�� �־��ּ���.");
				System.out.println("���� �⸧��:"+ cfsize);
				System.out.println("���� ���͸�:"+ cBattery);
			}
		}	
	}
	
	public void addFuel(int amount) {
		if (fsize < cfsize + amount) {
			System.out.println("fsize���� �������� ������ �� �����ϴ�. fsize:"+fsize);
			System.out.println("���� �⸧��:"+ cfsize);
		}else {
			setStatus("Park");
			cfsize += amount;
			System.out.println("���� �Ϸ�, ���� �⸧��:"+ cfsize);
		}
	}
	
	public void charge(int amount) {
		seteMod(true);	
		if(batterySize < cBattery + amount) {
			setStatus("Park");
			cBattery = batterySize;
			System.out.println("100% �����Ǿ����ϴ�.");
			System.out.println("���� ���͸�:"+ cBattery);
		}else {
			setStatus("Park");
			cBattery += amount;
			System.out.printf("%d��ŭ �����Ǿ����ϴ�.\n" , amount);
			System.out.println("cBattery:"+ cBattery);
		}

	}

}
