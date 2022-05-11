package ch06;

public class Car {
	private String name;
	private String color;
	private int size;
	private int serial;
	
	// class의 유일한 변수
	static int cnt = 1000;

	public Car() {
	}

	
	
	public Car(String name) {
		this(name,"red",1000,cnt);
		cnt++;
	}	
	
	
	public Car(String name, String color) {
		this(name,color,1000);
	}


	public Car(String name, String color, int size) {
		this.name = name;
		this.color = color;
		this.size = size;
	} 
	
	
	public Car(String name, String color, int size, int serial) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.serial = serial;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}

	

	public int getSerial() {
		return serial;
	}



	public String getName() {
		return name;
	}

	public void go() {
		System.out.println(this.name + ": Go!!");
	}
	
	public void go(int a) {
		System.out.println(this.name + ":"+ a +"km Go!!" );
	}



	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", serial=" + serial + "]";
	}
	

	
	
}
