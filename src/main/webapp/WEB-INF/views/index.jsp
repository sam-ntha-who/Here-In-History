<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Here In History</title>
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
Here In History
<br>
<br>
<br>
<form action="/results" method="post">
			<input type="text" name="zipCode" id="zipCode" placeholder="48047"/> Find by zip code
			
			<br>
			<br>
			<input type="submit" value="Submit" />
		</form>
		<a href="/addData">Add new data</a><br> <br>
</body>
</html>