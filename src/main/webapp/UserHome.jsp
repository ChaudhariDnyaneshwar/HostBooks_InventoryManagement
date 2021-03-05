<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Show all Item</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
   
   <% 
  if(session.getAttribute("uname")==null)
	{
	response.sendRedirect("Login.jsp");
	}
	%>
           
			  
            
   <nav class="navbar bg-light">
  <ul class="nav nav-tabs">
     
     <li class="nav-item">
    <a href="UserHome.jsp" class="btn btn-primary">Home</a>
    </li>
     
    <li class="nav-item">
    <a href="AddItem.jsp" class="btn btn-primary">Add Item</a>
    </li>
    
    <li class="nav-item">
    <a href="showAllItem" class="btn btn-primary">Show All Item</a>
    </li>
   
    <li class="nav-item">
    <a href="UpdateItem.jsp" class="btn btn-primary">Update Item</a>
    </li>
   
    <li class="nav-item">
    <a href="getAllUser" class="btn btn-primary">Get ALL User</a> 
    </li>
     
     <li class="nav-item">
    <a href="userLogout" class="btn btn-primary">LogOut</a> 
    </li>
  </ul>
</nav>

   
     
</body>
</html>