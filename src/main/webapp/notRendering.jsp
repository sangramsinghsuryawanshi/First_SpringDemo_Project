<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to jsp page</h1>
	<form action="/jsp1" >
		<label>Id: </label><br>
		<br> <input type="number" name="id" placeholder="Enter your id"
			required="required"> <br>
		<br> <label>Name: </label><br>
		<br> <input type="text" name="name" placeholder="Enter your name"
			required="required"> <br>
		<br> <label>Email: </label><br>
		<br> <input type="email" name="email"
			placeholder="Enter your email" required="required"> <br>
		<br>
		<button type="submit">submit</button>
	</form>
</body>
</html>