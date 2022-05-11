package p457;

public class TestApp {

	public static void main(String[] args) {
		Object o = new String("abc");
		Object o2 = new CustomerVO("id01","pwd01","james");
		
		System.out.println(o2.getClass().getName());
		CustomerVO c = (CustomerVO)o2;
		System.out.println(c.getName());
		
		Object obj3 = 10;
//		Object obj4 = new Integer(10);
		
	}

}
