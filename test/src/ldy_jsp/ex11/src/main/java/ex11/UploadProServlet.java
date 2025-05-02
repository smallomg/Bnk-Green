package ex11;

// 서블릿 관련 라이브러리 import
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;

/**
 * 파일 업로드를 처리하는 서블릿 클래스
 */

// 파일 업로드 설정
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 1, // 1MB 이상이면 디스크에 임시 저장
		maxFileSize = 1024 * 1024 * 10, // 업로드 파일 최대 크기: 10MB
		maxRequestSize = 1024 * 1024 * 15 // 요청 전체 최대 크기: 15MB
)
@WebServlet("/UploadPro") // 이 서블릿은 "/UploadPro" URL로 요청이 오면 동작함
public class UploadProServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; // 버전 관리용 (직렬화 ID)

	// 기본 생성자
	public UploadProServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	// GET 요청이 들어왔을 때 처리하는 메소드 (여기서는 테스트용 간단 응답)
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// POST 요청 (실제 파일 업로드) 처리 메소드
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. 파일 저장 경로 설정
		String uploadPath = request.getServletContext().getRealPath("/images/");
		System.out.println("uploadPath : " + uploadPath);
		// 예: 프로젝트 배포 폴더 안의 images 폴더 경로를 얻음

		// 2. 일반 파라미터(desc) 처리
		String desc = request.getParameter("desc");
		System.out.println("desc : " + desc);
		// 업로드와 함께 입력한 설명(desc)값을 읽어옴

		// 3. 파일 데이터 처리
		Part part = request.getPart("imgfile"); // form에서 'imgfile' 이라는 input에 해당하는 파일 가져오기
		long size = part.getSize(); // 업로드한 파일의 크기(byte 단위)

		if (size > 0) { // 파일이 존재하는 경우
			// 파일을 지정한 경로에 저장
			part.write(uploadPath + "/" + part.getSubmittedFileName());

			// 업로드 완료 후 임시 저장 파일 삭제
			part.delete();

			// 업로드 성공 후 저장된 파일 이름을 request에 저장
			request.setAttribute("filename", part.getSubmittedFileName());

			// success.jsp로 forward (업로드 성공 페이지로 이동, 데이터 전달 가능)
			request.getRequestDispatcher("success.jsp").forward(request, response);
		} else {
			// 파일이 없는 경우 실패 페이지로 리다이렉트
			response.sendRedirect("fail.jsp");
		}
	}
}
/*
 * 클라이언트가 <form method="post" enctype="multipart/form-data"> 로 파일 업로드 요청을 보냄
 * 
 * UploadProServlet의 doPost() 메소드가 호출됨
 * 
 * 서버가 업로드 경로(images 폴더)를 준비
 * 
 * 폼 데이터 중 일반 데이터(desc)와 파일(imgfile)을 각각 추출
 * 
 * 파일의 크기가 0보다 크면:
 * 
 * 서버의 지정 경로에 파일 저장
 * 
 * 임시 저장 파일 삭제
 * 
 * 업로드 성공 정보를 request에 저장하고 success.jsp로 이동
 * 
 * 파일이 없으면:
 * 
 * 실패 페이지 fail.jsp로 이동
 */
