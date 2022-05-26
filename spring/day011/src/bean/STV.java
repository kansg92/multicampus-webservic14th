package bean;

import frame.TV;

public class STV implements TV {

	public STV() {
		System.out.println("Create SAMSUNG TV BEAN ...");
		
	}
	
	
	@Override
	public void on() {
		System.out.println("SAMSUNG TV on .....");

	}

	@Override
	public void off() {
		System.out.println("SAMSUNG TV off .....");
	}

}
