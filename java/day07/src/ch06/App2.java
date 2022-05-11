package ch06;

public class App2 {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.toString());
		
		Car c2 = new Car("k3","white",1000,50,0);
		System.out.println(c2.toString());
		
	}

}
