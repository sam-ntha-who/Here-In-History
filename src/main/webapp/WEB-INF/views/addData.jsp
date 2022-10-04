<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add History</title>
<link rel="stylesheet" type="text/css" href="style.css" />

</head>
<body>
Add Historical Data Here
<br>
<br>
<form action="/dataAdded" method="post">

			<input type="text" name="geoLoc" id="geoLoc" placeholder="placeholder for geoloc"/> Use current location <br>
			<input type="text" name="zipCode" id="zipCode" placeholder="48047"/> Add by zip code <br>
			<input type="text" name="data" id="data" placeholder="enter data here"/> Data <br>

			<br>
			<br>
			<input type="submit" value="Submit" />
		</form>
</body>
</html>