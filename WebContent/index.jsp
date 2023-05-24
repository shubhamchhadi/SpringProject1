<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
     <!-- tag library include here -->
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
	<form action="./test">
		<input type="submit" value="SUBMIT" >
	
			<!-- OBNL [ Object-Graph Navigation Language ] -->
		<h2>${msg}</h2>
		<h2>${msg2}</h2>
	
		<c:forEach var = "i" begin = "1" end = "3">
			<c:out value="${PersonList}"/><p>
		</c:forEach>

      </form>
      
      <form action="./test2" method="post">
      			<!--  here[ value attribute ] for [form backup] -->
      	Enter Name<input type="text" name="name" value="${NameValue}"/><div style="color: red;">${NameError}</div><br>
      	Enter Age<input type="text" name="age" value="${AgeValue}"/><div style="color: red;">${AgeError}</div><br>
      	Enter Phone<input type="text" name="phone" value="${PhoneValue}"/><div style="color: red;">${PhoneError}</div><br>
      	
      	<h2 style="color: green">${SuccessMessage}</h2>
      	<input type="submit" value="SUBMIT">
      	
      </form>
</body>
</html>

	<!-- 
	 <c:forEach var = "i" begin = "1" end = "5">
         Item <c:out value = "${i}"/><p>
      </c:forEach>
       -->