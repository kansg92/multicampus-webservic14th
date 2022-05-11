package p722;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiTest {

	public static void main(String[] args) {
		Properties pr = new Properties();
		String path = PropertiTest.class.getResource("database properties.txt").getPath();
		try {
			pr.load(new FileReader(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = pr.getProperty("url");
		
		System.out.println(url);

	}
	

}
