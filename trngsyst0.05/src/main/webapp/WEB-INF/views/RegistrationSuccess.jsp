<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Success</title>
<style type="text/css">
span {
	display: inline-block;
	width: 100px;
	margin: 5px 5px 5px 5px;
	text-align: left;
}
</style>
</head>
<body>

	<div align="center">
		<h2>Training Addition Succeeded!</h2>
		<table border="10">
			<tr>
				<td>Training Id:</td>
				<td>${training.id}</td>
			</tr>
			<tr>
				<td>Training Name:</td>
				<td>${training.name}</td>
			</tr>
			<tr>
				<td>Training Requester name:</td>
				<td>${training.rname}</td>
			</tr>


		</table>
	</div>
</body>
</html>


