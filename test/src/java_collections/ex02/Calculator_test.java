package ex02;

public class Calculator_test {

	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 2;
		
		Calculator calculator = new Calculator();
		
		System.out.println(num1 + " + " + num2 + " = " + calculator.add(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " + calculator.sub(num1, num2));
		System.out.println(num1 + " * " + num2 + " = " + calculator.mul(num1, num2));
		System.out.println(num1 + " / " + num2 + " = " + calculator.div(num1, num2));
	
		System.out.println("// ================================= //");
		// ================================= //
		
		int num_abs1 = 11;
		int num_abs2 = -11;
		Calculator2 calculator2 = new Calculator2();
		System.out.println(calculator2.abs(num_abs1));
		System.out.println(calculator2.abs(num_abs2));
		
		System.out.println("// ================================= //");
		// ================================= //
		
		int num_power1 = 2;
		int num_power2 = 3;
		System.out.println(num_power1 + " ^ " + num_power2 + " = " + calculator.power(num_power1, num_power2));
		System.out.println(num_power2 + " ^ " + num_power1 + " = " + calculator.power(num_power2, num_power1));
		
		
	}

}
// VO = VALUE OBJECT : 값을 저장하는 오브젝트, getter-setter 필수 
// DTO = 뗴이터 전속 객체 : 데이터를 전달하는 객체, 데이터 변경이 일어나면 안됨