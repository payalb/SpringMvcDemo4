<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${students}" var="student">
	<c:out value="${student.name}"></c:out>
	<c:out value="${student.age}"></c:out>
	<c:out value="${student.dob}"></c:out>
	<c:out value="${student.gender}"></c:out>
	<c:forEach items="${student.subjects}" var="subject">
		<c:out value="${subject}"></c:out>
	</c:forEach>
	<c:out value="${student.address}"></c:out>
	<c:out value="${student.address.hno}"></c:out>
	<c:out value="${student.address.city}"></c:out>
	<c:out value="${student.address.pincode}"></c:out>
</c:forEach>
</body>
</html>