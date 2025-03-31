package vo1;

public class CalcArea {

	static void calcArea(Result result) {
		
		if(result instanceof Triangle) {
			Triangle t = (Triangle)result;
			System.out.println("삼각형의 값:\t" + (t.width *t.height) / 2);
		}
		
		else if(result instanceof Circle) {
			Circle c = (Circle)result;
			System.out.println("원의 값:\t" + (int) (c.r1 * c.r2 * 3.14));
		}
		
		else if(result instanceof Rectangle) {
			Rectangle r = (Rectangle)result;
			System.out.println("사각형의 값:\t" + r.width * r.height);
		}
		
	}
	
	void calcArea(Triangle triangle) {
		
	}
	void calcArea(Circle circle) {
		
	}
	void calArea(Rectangle rectangle) {
		
	}
}
