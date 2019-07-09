<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>mailprocess</title>
<%
	// jsp 내장함수
	// request, response의 개념을 이해
	// request(요청) -> HttpServletRequest
	// response(응답) -> HttpServletResponse
	// 요청한 정보를 출력
	String reip = request.getRemoteAddr(); // 클라이언트의 ip 반환
	System.out.println("reip" + reip);
	// 한글 처리
	request.setCharacterEncoding("euc-kr");
	// 나이 Integer처리
	int age = Integer.parseInt(request.getParameter("age"));
%>
<style>

table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
table {
	width: 300px;
}
table > tbody > tr > td:nth-child(1){
	width:100px; background: orange;
}
#wrap { width: 300px; margin: auto; }

</style>
</head>
<body>
	<div id="wrap">
	<table>
	<tr>
		<th colspan="2">메일링 리스트</th>
	</tr>
	<tr>
		<td>이름</td>
		<td><%= request.getParameter("name") %></td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><%= request.getParameter("email") %></td>
	</tr>
	<tr>
		<td>나이</td>
		<td><%= age %></td>
	</tr>
	<tr>
		<th colspan="2"><input type="button" value="가입 폼"></th>
	</tr>
	</table>
	<br/>
	<table>
		<%
		for(int i = 0; i < age; i++){
		%>
		<tr><td><%= i %></td></tr>
		<%
		}
		%>
	</table>
	</div>
</body>
</html>