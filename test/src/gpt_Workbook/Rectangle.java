package gpt_Workbook;

public class Rectangle {
	int width;
	int height;
	
	Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
	
	int getArea() {
		
				return width*height;
	}
	
	int getPerimeter() {
		
				return (width+height)*2;
	}
}
