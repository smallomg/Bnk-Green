package ex02.service;

import java.util.List;

import ex02.dao.MemberDAO;
import ex02.vo.MemberVO;

public class MemberService {
		MemberDAO memberdao = new MemberDAO();
		MemberVO member = new MemberVO();
		
		public void f() {
			// 파라미터로 받은 데이터 가지고 해볼 만 한것들
			// 1. 유호성검사
			memberdao.insert(member);
		}
		
		public List<MemberVO> selectAll() {
			// db에 요청
			List<MemberVO>list = memberdao.selectAll();
			return list;
		}
		
		
}
