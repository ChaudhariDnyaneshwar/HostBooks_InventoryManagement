<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>create user account</title>
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
 
  <form action="creatUser">
     <h1>User Registration Form</h1>
    <div class="form-group">
      <label for="salutation">Select Salutation:</label>
      <select name="salutation" required>
        <option>Mr.</option>
        <option>Mrs.</option>
        <option>Ms.</option>
      </select>
    </div>
    
    <div class="form-group">
      <label for="fname">Enter First Name:</label>
      <input type="text" class="form-control"  placeholder="Enter First Name" name="fname"  required>
    </div>

    <div class="form-group">
      <label for="lname">Enter Last Name:</label>
      <input type="text" class="form-control"  placeholder="Enter Last Name" name="lname" required>
    </div>
    
    <div class="form-group">
      <label for="geneder">Select Gender:</label><br>
      Male <input type="radio"    name="gender"  value="Male" required>
      FeMale <input type="radio"  name="gender"  value="FeMale" required>
    </div>

   <div class="form-group">
      <label for="mobile">Enter Mobile Number : </label>
      <input type="text" class="form-control"  placeholder="Enter Mobile Number" name="mob" required>
    </div>
   
   <div class="form-group">
      <label for="email">Enter email:</label>
      <input type="email" class="form-control"  placeholder="Enter email" name="mail" required>
    </div>
       
<div class="form-group">
      <label for="address">Enter Address:</label>
      <input type="text" class="form-control"  placeholder="Enter address" name="address" required>
    </div>
    
    <div class="form-group">
      <label for="role">Enter role:</label>
      <input type="text" class="form-control"  placeholder="Enter role" name="role" required>
    </div>
    
    <div class="form-group">
      <label for="status">Enter status:</label>
      <input type="text" class="form-control"  placeholder="Enter status" name="status" required>
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