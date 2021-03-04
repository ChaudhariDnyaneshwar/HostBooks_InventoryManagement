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
<jstl:if test="${not empty list}">  
  <jstl:forEach var="list" items="${list}">

<div class="card" style="width:400px;margin-top:100px;margin-left:400px;background-color:rgba(116, 208, 251, 0.67);">
  <img class="card-img-top" src='getItemImage?id=${list.itemId}' alt="Card image">
  <div class="card-body">
    <h4 class="card-title">Item Name : ${list.itemName } </h4>
    <p class="card-text">Item Category : ${list.itemCategory }</p> 
     <p class="card-text">Item Quantity: ${list.itemQuantity }</p>      
    <p class="card-text">Item Unit : ${list.itemUnit }</p>
    <p class="card-text"> Item Unit Price : ${list.itemUnitPrice } </p>
    <p class="card-text"> Item Status : ${list.itemStatus }</p>
    <p class="card-text">
       <a href="#" class="btn btn-success">ACCEPT</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="#" class="btn btn-danger">REJECT</a> 
			
    </p>
       
  </div>
</div>
</jstl:forEach>
  </jstl:if>
  
  <jstl:if test="${!not empty list}">
  <br><br><h3>Sorry ,Items is not  available</h3>
  </jstl:if>
 

</body>
</html>