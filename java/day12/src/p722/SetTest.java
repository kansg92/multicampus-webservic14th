package p722;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Random rd = new Random();
		while(set.size() <= 6) {
			int num = rd.nextInt(45) + 1;
			set.add(num);
			System.out.println("cnt");
		}
		
		for (Integer i : set) {
			System.out.println(i);
		}

	}

}
