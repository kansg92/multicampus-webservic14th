package p440;

public class Calc {
	public int div(int a, int b) throws Exception {
		int result = 0;
		try {
			result = a / b;		
		} catch (Exception e) {
			throw e;
		}
		return result;
	}
}
