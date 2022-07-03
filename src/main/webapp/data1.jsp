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
	String data = request.getParameter("data");
	String type = request.getParameter("type");
	%>
	<%
	if (type != null)
	switch(type){
		case "0":
			break;
		case "1":
			response.sendRedirect("data2.jsp");
			break;
		default:
			break;
	}
	%>
	
	<% if(data == null) {%>
		<form>
			<input type="text" name="data"/><br>
			<input type="submit" value="submit"/>
		</form>
	<% } else { %>
	
		
		<%
		// HttpServletRequest
		request.setAttribute("data", data);
		
		// ServletContext
		application.setAttribute("data", data);
		
		//HttpSession
		session.setAttribute("data", data);
		
		//ServletConfig config
		%>
		<form>
			<input type="radio" name="type" value="0"> None <br>
			<input type="radio" name="type" value="1"> Redirect to /data2.jsp <br>
			<input type="submit" value="submit"/>
		</form>
	  <%} %>
	
	
	request parameter data is <%= request.getParameter("data") %> <br>
	request attribute data is <%= request.getAttribute("data") %> <br>
	ServletContext    data is <%= application.getAttribute("data") %> <br>
	HttpSession       data is <%= session.getAttribute("data") %> <br>
	

</body>
</html>