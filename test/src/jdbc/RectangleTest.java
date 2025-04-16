package jdbc;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle org = new Rectangle(1, 1, 9, 9);
		Rectangle cpy;

		try {
			cpy = (Rectangle) org.clone();

			org.showPosition();
			cpy.showPosition();

			cpy.chagePos(2, 2, 8, 8);

			org.showPosition();
			cpy.showPosition();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
