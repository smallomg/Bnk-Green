package ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JDBC_Member_Service mService = new JDBC_Member_Service();
		JDBC_Board_Service bService = new JDBC_Board_Service();
		SessionStorage session = new SessionStorage();
		
		while(true) {
			System.out.println("행동을 선택하세요");
			System.out.print("1:[회원가입] 2:[로그인] 3:[게시글 조회] 4:[게시글 작성] 5:[게시글 조회] >>");
			String choose = sc.next();
			
			if(choose.equals("1")) {
				// 회원가입
				System.out.println("==회원가입==");
			    String id, pw, name, phone;
			    char grade = 'C';
				
			    while(true) {
			    	System.out.print("아이디 입력 >> ");
					id = sc.next();
					
					if(mService.isDuplicatedId(id)) {
						System.out.println("중복인 아이디입니다.");
					} else {
						break;
					}
			    }
				System.out.print("패스워드 입력 >> ");
				pw = sc.next();
				System.out.print("이름 입력 >> ");
				name = sc.next();
				System.out.print("연락처 입력 >> ");
				phone = sc.next();
				
				Member member = new Member();
				member.setId(id);
				member.setPw(pw);
				member.setName(name);
				member.setPhone(phone);
				member.setGrade(grade);
				
				int result = mService.insert(member);

				if (result > 0) {
			        System.out.println("회원가입 성공!!");
			    } else {
			        System.out.println("회원가입 실패!!");
			    }
			} else if(choose.equals("2")) {
				// 로그인
				System.out.println("==로그인==");
				String id;
				String pw;
				
				System.out.print("아이디 입력 : ");
				id = sc.next();
				System.out.print("패스워드 입력 : ");
				pw = sc.next();
				
				Member member = mService.select(id, pw);
				
				if(member != null) {
					int sessionId = SessionStorage.cnt++;  // 세션 ID 발급
					session.memberMap.put(sessionId, member);
                    session.currentSessionId = sessionId;
			        
					System.out.println("로그인 성공! 환영합니다, " + member.getName() + "님");
			    } else {
			        System.out.println("로그인 실패: 아이디 또는 비밀번호가 틀렸습니다.");
			    }
			} else if(choose.equals("3")) {
				System.out.print("==게시글 조회==");
				List<Board> list = null;
				
				// 게시글 조회 - 전체, 선택
				if(session.currentSessionId == -1) {
					System.out.println("로그인 후 사용가능");
				} else {
					System.out.print("1:[전체조회] 2:[선택조회] >> ");
					String choose_select_type = sc.next();
					
					if(choose_select_type.equals(1)) {
						System.out.println("==전체 조회==");
						list = bService.selectAll();
						
						for(Board board : list) {
							System.out.println(board);
						}
					} else if(choose_select_type.equals(2)) {
						System.out.println("==선택 조회==");
						System.out.print("조회할 제목을 작성하세요 >> ");
						String choose_select_title = sc.next();
						
						list = bService.select(choose_select_title);
						
						for(Board board : list) {
							System.out.println(board);
						}
					} else {
						System.out.print("올바르지 않은 입력입니다");						
					}
					
				}
			} else if(choose.equals("4")) {
				System.out.println("==게시글 작성==");
				
				// 게시글 작성
				if(session.currentSessionId == -1) {
					System.out.println("로그인 후 사용가능");
				} else {
					System.out.print("제목을 입력하세요 >> ");
					String title = sc.next();
					
					System.out.print("내용을 입력하세요 >> ");
					String content = sc.next();
					
					int bno = Board.cnt++;
					
					Member member = session.memberMap.get(session.currentSessionId);
					String writer = member.getName();
					
					Board board = new Board();
					board.setBno(bno);
					board.setTitle(title);
					board.setContent(content);
					board.setWriter(writer);
					
					bService.insert(board);
				}
				
			} else if(choose.equals("5")) {
				// 로그아웃
				if(session.currentSessionId == -1) {
					System.out.println("로그인 후 사용가능");
				} else {
					
				}
			} else if(choose.equals("0")) {
				// 프로그램 종료
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				// 예외
				System.out.println("올바르지 않은 입력입니다.");
			}
			
			System.out.println();
		}
		
	}

	
}
/*

게시판 구현
로그인 구현

기능 메뉴
1. 회원가입 
2. 로그인
3. 게시글 작성 - 로그인한 경우만 가능 -> 비회원일 경우 안내메세지 출력


로그인 했는지 판별하는 클래스 구현
클래스명
SessionStorage
멤버
HashMap : public	- 로그인한 유저는 맵에다가 저장한다
로그인할대 -> 해쉬맵에 추가
로그아웃할때 -> 해쉬맵에 제거

// =========================================== //

요구사항
1. 회원만 게시글을 작성할 수 있다
2. 회원만 게시글을 조회할 수 있다
3. 자신의 게시글만 수정 또는 삭제할 수 있다
4. 회원가입 시 아이디 중복확인을 해야 한다
	- 아이디를 입력 후 다른 회원이 사용중인 아이디로 확인되면 '이미 사용중인 아이디 입니다'라고 알려준다
	- 아이디가 중복되지 않았으면 '사용 가눙한 아이디 입니다.' 라고 알려준다
5. 로그인 상태를 확인하기 위해 SessionStorage 클래스의 HashMap 또는 Set 타입의 멤버변수를 활용한다
6. 회원은 자신의 정보외에는 확인할 수 없다
7. 관리자는 모든 회원의 정보를 확인할 수 있다.


가능한 목록
1, 2, 3, 4

좀 힘들것 같다
5, 6, 7 



회원정보를 담을 클래스를 만들어서 회원정보를 저장한다
저장한 회원정보를 DB에 저장한다

게시글 정보를 담을 클래스(Board)를 만들어서 게시글 정보를 저장한다
저장한 게시글 정보를 DB에 저장한다
(이때, 주의할 사항은 회원아이디, 게시글 번호는 DB에 저장할 때 중복되어서는 안된다)

회원가입 시 등록하려는 아이디가 이미 사용중인 아이디인지 확인하기
arrayList에 회원정보를 3개정도 저장해 놓는다
입력받은 아이디가 arrayList에 저장되어 있는 회원정보에 같은 값이 있는지 확인한다

회원가입이 된 상태에서 로그인하기 위해서는 로그인 화면에서 아이디와 패스워드를 입력했을 때
DB에 저장된 회원정보들의 아이디와 패스워드를 비교해서 같을 게 있는지 확인한다



*/