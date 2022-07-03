<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	request parameter data is <%= request.getParameter("data") %> <br>
	request attribute data is <%= request.getAttribute("data") %> <br>
	ServletContext    data is <%= application.getAttribute("data") %> <br>
	HttpSession       data is <%= session.getAttribute("data") %> <br>
</body>
</html>