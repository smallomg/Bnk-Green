package vo;

public class Unit {
// 이름
// 에너지 초기값
// 유닛 공격하다 공격 메소드
// 유닛 공격받으면 에너지 감소 감소 메소드
	String name;
	int energy;
	Unit unit;
	
	public Unit() {
		energy = 10;
	}

	
	
	void attack(Unit unit) {
		unit.decrease();
	}
	
	int decrease() {
		return energy--;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	
}
