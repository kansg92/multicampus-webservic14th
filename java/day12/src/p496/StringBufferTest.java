package p496;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcdef");
		sb.append("ghi");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(2, 4);
		System.out.println(sb);
	}

}
