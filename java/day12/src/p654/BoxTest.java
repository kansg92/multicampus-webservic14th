package p654;

import java.util.ArrayList;

public class BoxTest {

	public static void main(String[] args) {
		Box box = new Box();
		box.setBox(new ItemVO(100,"pants",10000));
		
		ItemVO item = (ItemVO)box.getBox();
		System.out.println(item);
	}

}
