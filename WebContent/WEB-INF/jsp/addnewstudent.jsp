<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Product</title>
</head>

<jsp:include page="header.jsp"/>
	<body>
		
	<div class="fh5co-loader"></div>
	
	<div id="page">
	
	<div id="fh5co-product">
		<div class="container">
<table align="center" cellpadding="10px" width="50%" cellspacing="50px">
<form:form action="addspringstudent.jsp" method="GET" modelAttribute="student">
<form:hidden path="id"/>
<tr>
<td>Name :</td>
<td><form:input path="fname"/></td>
</tr>
<tr>
<td>Description :</td>
<td><form:textarea rows="4"  path="lname" /></td>
</tr>
<tr>
<td>Image :</td>
<td><form:input path="phone"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Save"/></td>
</tr>
</form:form>
</table>		

	


	


	</div>
		</div>
	</div>

	<jsp:include page="footer.jsp"/>
</div>
	</body>
</html>