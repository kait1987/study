<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.File"%>
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
		// 1. 파일 이름 가져오기
		String filename = request.getParameter("file");
		
		// 2. 해당 파일 java 파일 클래스로 변환
		File file = new File("C:/Users/me/git/study/Front/src/main/webapp/upload/" + filename);
		
		// 3. 첨부파일 형식[화면창] 으로 열기 [브라우저 마다 다름]
		response.setHeader("Content-Disposition", "attachment;filename="+filename+";");
		
		// 4. 입출력 스트림이용한 파일 출력
		byte[] b = new byte [ (int)file.length() ]; // 2번에서 가져온 파일의 실제 킉가 배열의 길이
		
		// 5. 스트림 내보내기
		if ( file.isFile() ){
			
			// 입력스트림
			BufferedInputStream inputStream = new BufferedInputStream( new FileInputStream(file) );
			// 출력스트림
			BufferedOutputStream outputStream = new BufferedOutputStream( response.getOutputStream() );
			
			int count;
			while( (count = inputStream.read(b) ) != -1 ){ // 입력스트림에서 파일의 바이트가 없을때까지 배열에 저장
				outputStream.write( b, 0 , count) ; // 읽어온 바이트 배열에서 처음부터 count(읽어온 바이트의개수) 까지)
			}
			inputStream.close(); // 스트림 닫기
			outputStream.close();// 스트림 닫기
		}
	%>

</body>
</html>