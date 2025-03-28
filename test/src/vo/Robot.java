package vo;

public class Robot {

	private String name;
	static int num = 5;
	
	public Robot() {
		
	}
	
	
	public Robot(int n) {
		if (n == 1) {
			System.out.println("칭찬하였습니다");
			System.out.println("로봇의 기분이 +1 UP");
			num = num+1;
			if(num>=11) {
				num = 10;
			}
		}
		else if (n == 0) {
			num = num-2;
			System.out.println("꾸중하였습니다");
			System.out.println("로봇의 기분이 -2 DOWN");
			if(num<0) {
				num = 1;
			}
		}
		else {System.out.println("잘못 입력하셨습니다");}
		if(num<=2) {
			System.out.println("로봇은 울적해요");
		}
		if(num>=7) {
			System.out.println("로봇은 하늘을 나는 기분이에요");
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


	
}
