<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>add item</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<%@ include file="UserHome.jsp" %>
<div class="row" style="margin-top:150px;color: white;"> 
  <div class="col-md-4"></div>
   <div class="col-md-4">
  
 <div class="container" style="background-color: #ef8172;padding:50px;border-radius: 25px;">
 
  <form action="addItem" method="POST" enctype="multipart/form-data">
     <h1>Add Items</h1>
       
    <div class="form-group">
      <label for="itemName">Enter Item Name:</label>
      <input type="text" class="form-control"  placeholder="Enter Item Name" name="iname"  required>
    </div>

    <div class="form-group">
      <label for="ItemImage">Select Item Image:</label>
      <input type="file" class="form-control"  placeholder="select item image" name="image" required>
    </div>
    
    <div class="form-group">
      <label for="itemCategory">Enter Item Category:</label><br>
       <input type="text" class="form-control"  placeholder="Item category" name="icategory" required>
    </div>

   <div class="form-group">
      <label for="itemQuantity">Enter item quantity : </label>
      <input type="number" class="form-control"  placeholder="item quantity" name="iquantity" required>
    </div>
   
   <div class="form-group">
      <label for="itemUnit">Enter item unit:</label>
      <input type="number" class="form-control"  placeholder="Enter item unit" name="iunit" required>
    </div>
       
    <div class="form-group">
        <label for="itemUnitPrice">Enter Item unit price:</label>
        <input type="number" class="form-control"  placeholder="Enter item unit price" name="iunitPrice" required>
    </div>
    
    <div class="form-group">
       <label for="itemStatus">Enter Item Status:</label>
       <input type="text" class="form-control"  placeholder="Enter item status" name="itemStatus" required>
    </div>
    
        
    <button type="submit" class="btn btn-primary">Submit</button>
    ${msg}
  </form>
</div>
   </div>
<div class="col-md-4"></div>
</div>


</body>
</html>