<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Training record addition</title>
<style type="text/css">
	label {
		display: inline-block;
		width: 200px;
		margin: 5px 5px 5px 5px;
		text-align: left;
	}
	input[type=text], input[type=password], select {
		width: 200px;
	}
	button {
		margin: 5px 5px 5px 5px;
		padding: 10px;
	}
	input[type=checkbox] {
		display: inline-block;
		margin-right: 190px;
	}
	input[type=radio] {
		display: inline-block;
		margin-left: 45px;
	}	
</style>
</head>
<body>
	<div align="center">
		<h1>${headerMessage}</h1>
		<h1>Training add form</h1>
		<form:errors path="training.*"/>
		
			<form:form action="add" method="post" modelAttribute="training">
			<form:label path="id">Training Id:</form:label>
			<form:input path="id"/><br/>
			
			<form:label path="name">Training Name:</form:label>
			<form:input path="name"/><br/>
			
			<form:label path="rname">Training Requester Name:</form:label>
			<form:input path="rname"/><br/>
			
			<form:button>add</form:button>						
		</form:form>		
	</div>
</body>
</html>