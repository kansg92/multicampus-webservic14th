package ch06;

public class Car {
	// Attribute(속성, 필드)
	String name;
	String color;
	int size;
	int fsize;
	int cfsize;
	
	//Constructor(생성자)
	public Car() {
		
	}

	
	public Car(String name, String color, int size, int fsize, int cfsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize;
		this.cfsize = cfsize;
 	}
	
	
	
	// Operation(동작, 매소드)
	public void go() {
		System.out.println("Go !");
	}	

	public void stop() {
		System.out.println("Stop !");
	}
	
	public void addFules(int f) {
		cfsize += f ;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", fsize=" + fsize + ", cfsize=" + cfsize
				+ "]";
	}
}
