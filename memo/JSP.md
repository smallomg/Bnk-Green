요청 : Client request(객체)
응답 : Sever response

스클릿틀릿 : 함수안에다가 쓰는거와 같다
JSP(Java Server Pages) 안에서 Java 코드를 직접 작성할 수 있게 해주는 영역
jsp 파일 <% 자바코드 %>
html 안에 <%= 자바코드%>

쿼리스트링 : 서버한테 보내는 문자열
?속성값 
파라미터 : 서버쪽으로 보내는 데이터
내장객체 : jsp 이미 인스턴스를 만들어져 있는 상태여서 따로 만들필요없다 참조변수가 request로 정해져있음


폼 받는 name 속성값과 속성값을 받은 출력페이지이와 속성값이 같아야한다


웹프로그래밍은 요청(클라이언트)와 응답(서버)로 구성
요청하는 방법 2가지
GET방식
1 Form : 자동 쿼리스트링
2 a태그 쿼리스트링 직접작성
POST방식( 주소창에 파라미터가 보여지지않는다)
요청 몸통(body)에 파라미터를 실어 보낸다

응답(서버 response)
1. 요청을 처리하는 과정에서 view를 지정하는 것
-request 객체를 활용
--request.getRequestDispatcher("페이지 지정");
2. 클라이언트의 요청을 완료한 후 view를 지정하는것
-response 객체를 활용
-- response.sendRedirect("페이지 지정");

==========================================
		데이터(parameter)
클라이언트(view) -----------------------> 서버(Servlet)


		데이터(request영역에 저장)
서버(Servlet)-------------------------------->클라이언트(view)


mvc
서블릿이 요청을 받아서
서비스한테 전달하고
서비스는 dao한테 전달
dao는 db쿼리를 날리고
데이터베이스는  결과집함을 서비스에게 주고
서비스는 받은 자료 서블릿한테 주고
서블릿은 리퀘스트영역에 저장
저장하고 뷰에 전달한다

//parseInt() : 문자열을 숫자로 바꿔줌

Action Tag
안에 내용이 있다면 무조건 </ex>
안에 내용이 없다면 마지막에 <ex/>
- <jsp:forward /> 
- <jsp:include>
- <jsp:param>
- <jsp:useBean>
- <jsp:setProperty>
- <jsp:getProperty>

required

다시 쓰기 type="reset"

샘플데이터로 확인할때는 commit 하자

type : 데이터소스로 사용할 클래스명
initialSize : 풀의 최초 초기화 과정에서 미리 만들어 놓을 연결의 개수( 기본 : 0 )
minIdle : 최소한으로 유지할 연결 개수
maxTotal : 동시에 사용할 수 있는 최대 연결 개수 (기본 : 8)
maxIdle : 풀에 반납할 때 최대로 유지될 수 있는 연결 개수( 기본 : 8)
maxWaitMillis : 새로운 요청이 들어왔을 때 얼마나 대기할지를 밀리초 단위로 기술
name : 생성할 자원이름(풀 이름)


