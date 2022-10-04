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

			Use current location <input type="text" name="geoLoc" id="geoLoc" placeholder="placeholder for geoloc"/><br>
			Add by zip code <input type="text" name="zipCode" id="zipCode" placeholder="48047"/><br>
			Year <input type="text" name="year" id="year" placeholder="1912"/><br>
			Data <input type="text" name="hxData" id="hxData" placeholder="enter data here"/><br>

			<br>
			<br>
			<input type="submit" value="Submit" />
		</form>
</body>
</html>