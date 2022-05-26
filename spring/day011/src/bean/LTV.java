package bean;

import frame.TV;

public class LTV implements TV {

	public LTV() {
		System.out.println("Create LG TV BEAN ...");
		
	}
	
	
	@Override
	public void on() {
		System.out.println("LG TV on ....");

	}

	@Override
	public void off() {
		System.out.println("LG TV off ....");
	}

}
