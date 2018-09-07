<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 	<head>
              <meta charset="utf-8">
			  <meta name="viewport" content="width=device-width, initial-scale=1">
			  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
			  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
			  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
			  <script src="js/fomosystem.js"></script>
              <title>Login</title>
	</head>
	<body>
	        <div class="container">
	        <div class="jumbotron">	
	         <div class="panel panel-primary">
			      <div class="panel-heading">Login</div>
			      <div class="panel-body">
                <table align="center">
                    <tr>
                        <td>
                            <label for="username"><b>Username</b></label>
                        </td>
                        <td>
                            <input type="text"  id="username" placeholder="Enter Username" name="username" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label for="password"><b>Password</b></label>
                        </td>
                        <td>
                           <input type="password" id="password" placeholder="Enter Password" name="password" required>
                        </td>
                    </tr>
                    <tr>
                      <td><label for="application"><b>Application</b></label></td>
				      <td>
				           <select name="application" id="application">
							    <option value="recontool">recontool</option>
							    <option value="fo">fo</option>
							    <option value="mo">mo</option>
  							</select>
				      </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left">
                             <button type="button" id="login">Login</button>
                        </td>
                    </tr>
                    <tr></tr>
                </table>
                <div  align="center"id ="message" style="font-style: italic; color: red;"></div>
			      </div>
	    	</div>
	    	</div>
	    	</div>
            
	 </body>
 </html>