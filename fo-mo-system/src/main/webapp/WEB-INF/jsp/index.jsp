<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Fo Mo System</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="js/fomosystem.js"></script>
  <link rel="stylesheet" href="css/fomosystem.css">
</head>
<body>
<% String role = String.valueOf(request.getSession().getAttribute("role")); %>
<nav class="navbar navbar-inverse">
  <div class="container-fluid" id="fomoheader">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#"><span class="glyphicon glyphicon-picture">&nbsp;OfficeApp</span></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a id="homeId">Home</a></li>
        <% if("admin".equalsIgnoreCase(role)){
            %>
        	<li><a id="foId">FOSystem</a></li>
            <li><a id="moId">MOSystem</a></li>
            <%
        }
        %>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="/fomosystem/logout"><span class="glyphicon glyphicon-user"></span>Log Out</a></li>
      </ul>
    </div>
  </div>
</nav>
  
<div class="container">
<span>${message}</span>
  <% 
  //String role = request.getParameter("role");
  if("FO".equalsIgnoreCase(role)){ %>
	  <%@ include file="fopage.jsp" %>
  <% }else if("MO".equalsIgnoreCase(role)){ %>
	  <%@ include file="mopage.jsp" %>
  <% 
  }else{
	  %>
	  <div id="view" style="background-color: #E6E6FA;"></div>
	  <%
	  }
  %>
</div>

</body>
</html>
