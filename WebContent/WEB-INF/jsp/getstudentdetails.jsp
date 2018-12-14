<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product's Details</title>
</head>


<jsp:include page="header.jsp"/>
	<body>
		
	<div class="fh5co-loader"></div>
	
	<div id="page">
	
	<div id="fh5co-product">
		<div class="container">
			<div class="row">
			
				<div class="col-md-4 prod text-center animate-box">
                                    
                                
	
					<div class="product" style="background-image: url(images/${studentdetails.phone})">
						<a href="#" class="view">
							<i class="icon-plus"></i>
						</a>
</div>



	Product ID : ${studentdetails.id} <br/>

   <table align="center" cellpadding="10px" width="50%" cellspacing="50px">
<form:form action="addspringstudent.jsp" method="GET" modelAttribute="student">
<input type="hidden" name="id" value="${studentdetails.id}" />
<tr>
<td>Name :</td>
<td><input name="fname" value="${studentdetails.fname}" /></td>
</tr>
<tr>
<td>Description :</td>
<td><textarea rows="4"  name="lname" >${studentdetails.lname}</textarea></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="Save"/></td>
</tr>
</form:form>
</table>	

<br/>
                                        
				</div>
	
			</div>
		</div>
	</div>

	<jsp:include page="footer.jsp"/>
</div>
	</body>





</html>