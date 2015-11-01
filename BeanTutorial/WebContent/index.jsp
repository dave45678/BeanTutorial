<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
The canonical approach, however, is to make the URL domain-relative so that you don't need to fix the URLs once again when you happen to move the JSP files around into another folder.

<form action="${pageContext.request.contextPath}/BeanTutorial">
</form>
</body>
</html>