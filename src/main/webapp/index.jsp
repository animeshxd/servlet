<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Servlet</title>
</head>
<body>

	<%! //for declaration
	public int add(int a, int b){
		return a + b;
	}
	%>
	
	
	<% 
	int a = 1;
	int b = 2;
	int c = a + b;
	out.println("the sum is " + c);
	%> 
	
	<br>
	The sum is <%= c %>
	
	<br>
	add(a, b) = <%= add(a, b) %>
	<br>
	add(555, 555) = <%= add(555, 555) %>
	<br>
	<% 
		for(int i = 0; i < 5; i++){
			out.println("value -> " + i + "<br>");
		}
	%>
	
	<%
	for(int i = 0; i < 5; i++) {
	%>
		Value -> <%= i %> <br>
	<%
	} 
	%>
	
	
</body>
</html>