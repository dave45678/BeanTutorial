<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EL and Complex JavaBeans</title>
<style>
	body, td {font-family:verdana;font-size:10pt;}
</style>
</head>
<body>

<h2>EL and Complex JavaBeans</h2>

<table border="1">
	<tr>
		<td>${person.name}</td>
		<td>${person.age}</td>
		<td>${person["address"].line1}</td>
		<td>${person["address"].town}</td>
		<td>${person.address.phoneNumbers[0].std} ${person.address.phoneNumbers[0].number}</td>
		<td>${person.address.phoneNumbers[1].std} ${person.address.phoneNumbers[1].number}</td>
	</tr>
</table>
</body>
</html>

