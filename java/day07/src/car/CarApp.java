package car;

import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start...");
		Car car = null;
				
		while(true) {
			System.out.println("Input cmd(c,a,s,g,t,q) ...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			
			}else if (cmd.equals("a")) {
				System.out.println("Input Fuels Size ..");
				double fs = Double.parseDouble(sc.next());
				car.setCfsize(fs);
			
			}else if (cmd.equals("c")) {
				System.out.println("Input name ..");
				String name = sc.next();
				System.out.println("Input fsize ..");
				double fsize = Double.parseDouble(sc.next());
				System.out.println("Input fe ..");
				double fe = Double.parseDouble(sc.next());
				
				car = new Car(name, fsize, fe);
				System.out.println(car);			
				
			}else if (cmd.equals("g")) {
				System.out.println("Input km ..");
				double km = Double.parseDouble(sc.next());
				car.go(km);
				
			}else if (cmd.equals("t")) {
				car.stop();
		    }else if (cmd.equals("s")) {
		    	System.out.println(car);
		    }
		}
		sc.close();
		System.out.println("End ...");
		
	}

}
