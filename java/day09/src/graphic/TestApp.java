package graphic;

public class TestApp {

	public static void main(String[] args) {
		// Shape s = new Shape();
		Shape s [] = new Shape[3];
		s[0] = new Rectangle(1, 3, 10, 20);
		s[1] = new Triangle(2, 2, 20, 20);
		s[2] = new Circle(3, 3, 15);
		
		for (Shape shape : s) {
			System.out.println(shape.getArea());
			System.out.println(shape.getCircum());
			if (shape instanceof Circle) {
				Circle circle = (Circle)shape;
				circle.setColor("red");
			}
		}
		
	}

}
