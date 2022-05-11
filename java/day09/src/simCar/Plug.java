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
	// 모드 전환 알고리즘 수정 필요. distance줄고 배터리 끝나면 기림으로 모드전환.
	public void go(int distance) {
		if (cBattery > distance / batteryE ) {
			setStatus("Go");
			cBattery -= distance / batteryE;
			System.out.printf("Go %dkm. \n", distance);	
			System.out.println("현재 배터리:"+ cBattery);
		}else if (cBattery < distance / batteryE) {
				distance -= cBattery * batteryE;				
				System.out.printf("Emod : Go %.1fkm. \n", (cBattery * batteryE));	
				cBattery -= (cBattery * batteryE) / batteryE;
				System.out.println("현재 기름양:"+ cfsize);
				System.out.println("현재 배터리:"+ cBattery);
				System.out.println("전기를 모두 사용하여 모드를 전환합니다.");
				seteMod(false);			
			if(cfsize >= (distance / fuelE) ) {
				setStatus("Go");		
				cfsize -= distance / fuelE;
				System.out.printf("Fmod : Go %dkm. \n", distance);	
				System.out.println("현재 기름양:"+ cfsize);
				System.out.println("현재 배터리:"+ cBattery);
			}else if ( cfsize < (distance / fuelE) ) {
				distance -= cfsize * fuelE;			
				setStatus("Stop");
				System.out.printf("Fmod : Go %.1fkm. \n", (cfsize * fuelE));	
				System.out.println("남은거리 :"+ distance+"km");
				cfsize -= (cfsize * fuelE) /fuelE;
				System.out.println("갈 수 있는기름이 없습니다. 기름을 넣어주세요.");
				System.out.println("현재 기름양:"+ cfsize);
				System.out.println("현재 배터리:"+ cBattery);
			}
		}	
	}
	
	@Override 
	public void back(int distance) {
		if (cBattery > distance / batteryE ) {
			setStatus("Back");
			cBattery -= distance / batteryE;
			System.out.printf("Back %dkm. \n", distance);	
			System.out.println("현재 배터리:"+ cBattery);
		}else if (cBattery < distance / batteryE) {
				distance -= cBattery * batteryE;				
				System.out.printf("Emod : Back %.1fkm. \n", (cBattery * batteryE));	
				cBattery -= (cBattery * batteryE) / batteryE;
				System.out.println("현재 기름양:"+ cfsize);
				System.out.println("현재 배터리:"+ cBattery);
				System.out.println("전기를 모두 사용하여 모드를 전환합니다.");
				seteMod(false);			
			if(cfsize >= (distance / fuelE) ) {
				setStatus("Back");		
				cfsize -= distance / fuelE;
				System.out.printf("Fmod : Back %dkm. \n", distance);	
				System.out.println("현재 기름양:"+ cfsize);
				System.out.println("현재 배터리:"+ cBattery);
			}else if ( cfsize < (distance / fuelE) ) {
				distance -= cfsize * fuelE;			
				setStatus("Stop");
				System.out.printf("Fmod : Back %.1fkm. \n", (cfsize * fuelE));	
				System.out.println("남은거리 :"+ distance+"km");
				cfsize -= (cfsize * fuelE) /fuelE;
				System.out.println("갈 수 있는기름이 없습니다. 기름을 넣어주세요.");
				System.out.println("현재 기름양:"+ cfsize);
				System.out.println("현재 배터리:"+ cBattery);
			}
		}	
	}
	
	public void addFuel(int amount) {
		if (fsize < cfsize + amount) {
			System.out.println("fsize보다 많은양을 주유할 수 없습니다. fsize:"+fsize);
			System.out.println("현재 기름양:"+ cfsize);
		}else {
			setStatus("Park");
			cfsize += amount;
			System.out.println("주유 완료, 현재 기름양:"+ cfsize);
		}
	}
	
	public void charge(int amount) {
		seteMod(true);	
		if(batterySize < cBattery + amount) {
			setStatus("Park");
			cBattery = batterySize;
			System.out.println("100% 충전되었습니다.");
			System.out.println("현재 배터리:"+ cBattery);
		}else {
			setStatus("Park");
			cBattery += amount;
			System.out.printf("%d만큼 충전되었습니다.\n" , amount);
			System.out.println("cBattery:"+ cBattery);
		}

	}

}
