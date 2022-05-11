package p496;

import java.text.DecimalFormat;

public class FormatTest {

	public static void main(String[] args) {
		double num = 1234561111111.789;
		DecimalFormat df = new DecimalFormat("#,###");
		
		String str = df.format(num);
		System.out.println(str);
	}

}
