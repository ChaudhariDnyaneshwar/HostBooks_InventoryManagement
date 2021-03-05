<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>      
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
<%@ include file="UserHome.jsp" %>
<div class="container">
  <h2>All Users</h2>     
  <table class="table table-bordered" style="width:1500px;">
    <thead>
      <tr>
        <th>User Id</th>
        <th>Salutation</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Geneder</th>
        <th>Mobile Number</th>
        <th>Email</th>
        <th>Address</th>
        <th>Role</th>
        <th>Status</th>
        <th>Operation</th>
      </tr>
    </thead>
    <tbody>
    
     <jstl:if test="${not empty list}">  
  <jstl:forEach var="list" items="${list}">
     
    
      <tr>
        <td>${list.uid}</td>
        <td>${list.salutation}</td>
        <td>${list.fname}</td>
        <td>${list.lname}</td>
        <td>${list.geneder}</td>
        <td>${list.mob}</td>
        <td>${list.mail}</td>
        <td>${list.address}</td>
        <td>${list.role}</td>
        <td>${list.status}</td>
        
        <td>
         <a href="UpdateUser.jsp" class="btn btn-success">Update</a> 
         <a href="deleteUser?id=${list.uid}" class="btn btn-danger">Delete</a> 
	
        </td>
        
      </tr>
    </tbody>
    </jstl:forEach>
  </jstl:if>
  
    
  </table>
</div>


</body>
</html>