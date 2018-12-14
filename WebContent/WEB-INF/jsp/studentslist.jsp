<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students List</title>
</head>


<jsp:include page="header.jsp"/>
	<body>
		
	<div class="fh5co-loader"></div>
	
	<div id="page">
	
	<div id="fh5co-product">
		<div class="container">
		
			<div class="row">
			<c:forEach var="student" items="${studentsList}">
		
				<div class="col-md-4 prod text-center animate-box">
					<div class="product" style="background-image: url(images/${student.phone})">
						<a href="#" class="view">
							<i class="icon-plus"></i>
						</a>
					</div>
					
	<form action="getstudentdetails.jsp"  method="get">
	<input name="id" type=hidden value="${student.id}" />
	<h3>Product Name: ${student.fname}</h3>
	<input type="submit" value="See details" > 
</form> 
<p>

					
                                                              	           
          	</div>                              
	</c:forEach>
			</div>
			
				
				
				
		</div>
		                  
	</div>
	
	
	  
                   

	<jsp:include page="footer.jsp"/>
</div>
	</body>
	
	
</html>