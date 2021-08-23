<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="Dto.NoticeDto"%>
<%@page import="Dao.NoticeDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// JSP 파일 업로드 하기 [파일 --> 서버]
		// 1. COS 라이브러리 추가
		
		// 2. 업로드 된 파일을 저장할 폴더 경로 설정
		String realFolder = "C:/Users/me/git/study/Front/src/main/webapp/upload";
	
		// 3. 파일 요청 클래스
		MultipartRequest multi = new MultipartRequest ( request , realFolder , 1024*1024*10,  "UTF-8" , new DefaultFileRenamePolicy() );
																//  1. 요청방식, 2.저장경로	3. 파일 최대용랴에[10mb], 4.인코딩 타입 5. 보안[동일한 이름이 있을 경우 파일명 뒤에 숫자를 붙여줌]
																		// [bit -> byte -> kb -> mb]
		
		// 4. form 태그 속성 enctype="multipart/form-data"
		
		int nno =Integer.parseInt( multi.getParameter("nno") );
		String ntitle = multi.getParameter("title");
		String ncontents = multi.getParameter("contents");
		
			// 내용에 줄바꿈 처리를 <br> 변경해서 저장하기
			ncontents = ncontents.replace("\r\n", "<br>");
			
			
		String nfile = multi.getFilesystemName("file");
										// getFilesystemName : 첨부파일에 있는 파일명 요청
		String nfile2 = multi.getParameter("file2");
										
		// 만약에 첨부파일이 없을경우 기존 첨부파일 사용
		if( nfile == null ){
			nfile = nfile2; // 기존파일 요청해서 파일명에 넣어주기
		}else{ // 새로운 첨부파일이 있을경우 기존 첨부파일 폴더에서 삭제
			File file = new File( "C:/Users/me/git/study/Front/src/main/webapp/upload/"+nfile2);
			file.delete();
			
		}
	%>


	<%
	// jsp 태그 : java 스트크립트문
	
	/*String ntitle = request.multipartRequest("title");
	String ncontents = request.multipartRequest("contents");
	String nfile = request.multipartRequest("file");*/
	
	//객체
	NoticeDto noticeDto = new NoticeDto(ntitle , ncontents, "우원재" , 0 , nfile);
	
	// DB
	NoticeDao noticeDao = NoticeDao.getinstance();
	
	int result = noticeDao.noticewrite(noticeDto);
	
	if ( result == 1){
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<script>");
		printWriter.println("alert('글 작성 등록')");
		printWriter.println("location.href='boardlist.jsp'");
		printWriter.println("</script>"); // 
	}
	else{
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<script>");
		printWriter.println("alert('글 작성 실패[관리자에게 문의]')");
		printWriter.println("location.href='boardlist.jsp'");
		printWriter.println("</script>");
	}
	
	%>
</body>
</html>