package vo1;

public class Mouse_main {

	public static void main(String[] args) {

		Mouse m1 = new Mouse();
		WheelMouse wm1 = new WheelMouse();
		OpticalMouse om1 = new OpticalMouse();

		Mouse[] m = new Mouse[3];

		m[0] = m1;
		m[1] = wm1;
		m[2] = om1;

		for (int i = 0; i < 3; i++) {
			m[i].clickL();
			m[i].clickR();
			if (m[i] instanceof WheelMouse) {
				((WheelMouse) m[i]).scroll();
			}

			if (m[i].getClass() == WheelMouse.class) {
				((WheelMouse) m[i]).scroll();
			}
		}

		System.out.println("\n");
		for (int i = 0; i < m.length; i++) {
			if (m[i].getClass() == WheelMouse.class) {
				System.out.println("WheelMouse임둥");
			} else if (m[i].getClass() == Mouse.class) {
				System.out.println("Mouse임둥");
			} else if (m[i].getClass() == OpticalMouse.class) {
				System.out.println("OpticalMouse임둥");
			} else {
				System.out.println("없습니둥");
			}
		}
		System.out.println("\n");
		for (int i = 0; i < m.length; i++) {
			if (m[i] instanceof Mouse) {
				System.out.println("Mouse임둥");
			} else if (m[i] instanceof WheelMouse) {
				System.out.println("WheelMouse임둥");
			} else if (m[i] instanceof OpticalMouse) {
				System.out.println("OpticalMouse임둥");
			} else {
				System.out.println("없습니둥");
			}
		}
		System.out.println("\n");
		for (int i = 0; i < m.length; i++) {
			if (m[i] instanceof OpticalMouse) {
				System.out.println("OpticalMouse임둥");
			} else if (m[i] instanceof WheelMouse) {
				System.out.println("WheelMouse임둥");
			} else if (m[i] instanceof Mouse) {
				System.out.println("Mouse임둥");
			} else {
				System.out.println("없습니둥");
			}
		}

	}

}
