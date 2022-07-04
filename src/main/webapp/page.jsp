<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
public void jspInit(){
	String data = getInitParameter("data");
	ServletContext context = getServletContext();
	context.setAttribute("datafrompage", data);
}
%>
	<%response.sendRedirect("page2.jsp"); %>

</body>
</html>