package graphic;

public class DrawPanel {
	
	public void draw(Shape shape) {
		System.out.println(shape.toString());
		if(shape instanceof Circle) {
			Circle c = (Circle)shape;
			c.setColor("blue");
		}
	}
}
