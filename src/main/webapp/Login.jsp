<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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

<div class="row" style="margin-top:150px;color: white;"> 
  <div class="col-md-4"></div>
   <div class="col-md-4">
  
 <div class="container" style="background-color: #ef8172;padding:50px;border-radius: 25px;">
 
  <form action="getValidate">
    
       <h1>Login form</h1>
     
    <div class="form-group">
      <label for="fname">Enter First Name:</label>
      <input type="text" class="form-control"  placeholder="Enter First Name" name="fname"  required>
    </div>
   
   <div class="form-group">
      <label for="email">Enter email:</label>
      <input type="email" class="form-control"  placeholder="Enter email" name="mail" required>
    </div>
       
    
    <button type="submit" class="btn btn-primary">Submit</button>
    <a href="CreateUserAccount.jsp" class="btn btn-success">Create Account</a> 
   ${msg }
  </form>
</div>
   </div>
<div class="col-md-4"></div>
</div>


</body>
</html>