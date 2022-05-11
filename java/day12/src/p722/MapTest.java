package p722;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100,"A");
		map.put(102,"B");
		map.put(103,"C");
		map.put(104,"D");
		map.put(105,"E");
		map.put(107,"f");
		
		System.out.println(map.toString());
		map.remove(102);
		System.out.println(map.toString());
		System.out.println(map.get(103));
		

	}

}
