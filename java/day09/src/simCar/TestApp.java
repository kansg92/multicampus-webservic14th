package simCar;

public class TestApp {

	public static void main(String[] args) {
		Car c1 = new Gas("k3", "silver", "중형","1111", 100, 100, 20);
		Car c2 = new Plug("niro","red","suv", "2222", 150, 60, 15, 100, 20);
		Car c3 = new Electro("ionic", "white", "중형", "3333", 100, 100, 25);
		Gas k3 = (Gas)c1;
		Plug niro = (Plug)c2;
		Electro ionic = (Electro)c3;
	
		niro.addFuel(40);
		niro.charge(120);
		niro.go(2800);
		System.out.println(niro.toString());
		
		
	}

}
