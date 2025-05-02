package dao;

public class SingletonDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDAO dao = MemberDAO.getIntstance();
		
		System.out.print(dao);
	}

}
