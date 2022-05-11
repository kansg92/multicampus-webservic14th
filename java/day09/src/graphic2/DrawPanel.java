package graphic2;

public class DrawPanel {
	
	public void draw(Shape shape) {
		System.out.println(shape.toString());
		shape.setColor("blue");
	}
}
