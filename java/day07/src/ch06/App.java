package ch06;

public class App {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.toString()); 
		Car c2 = new Car();
		// 자바에서 자동적으로 출력을 할때 toString()을 지원해주기 때문에 안써도 무방.
		System.out.println(c2);

	}

}
