<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ page isELIgnored="false" %>

<div class="panel panel-info">
<div class="panel-heading">Trade Application Front Office</div>
<div class="panel-body">
		<div style="padding-bottom: 20px;">
	        <form class="form-inline" action="/action_page.php">
			  <div class="form-group">
			    <label for="email">Trade Id</label>
			    <input type="email" class="form-control" id="email">
			  </div>
			  <button type="button" class="btn btn-default">LoadTrade</button>
			</form>
		</div>
		<form:form method = "POST" action = "/HelloWeb/addStudent">
         <table id="table1" style="border-collapse: separate;border-spacing: 15px 20px;">
            <tr>
               <td><form:label path = "counterParty">CounterParty</form:label></td>
               <td><form:input path = "counterParty" class="form-control" /></td>
            </tr>
            <tr>
               <td><form:label path = "currency">Currency</form:label></td>
			      <td>
			          <form:select path="currency" class="form-control">
			              <form:option value="GBP"/>
			              <form:option value="INR"/>
			              <form:option value="USD"/>
			          </form:select>
			      </td>
            </tr>
            <tr>
               <td><form:label path = "amount">Amount</form:label></td>
               <td><form:input path = "amount" class="form-control"/></td>
            </tr>
            <tr>
               <td><form:label path = "buySell">Buy/Sell:</form:label></td>
               <td><form:input path = "buySell" class="form-control" /></td>
            </tr>
             <tr>
               <td><form:label path = "tradeDate">TradeDate:</form:label></td>
               <td><form:input path = "tradeDate" class="form-control" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Update"/>
               </td>
            </tr>
         </table>  
      </form:form>
</div>
</div>


