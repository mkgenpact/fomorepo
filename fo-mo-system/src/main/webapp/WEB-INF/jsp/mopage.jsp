<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ page isELIgnored="false" %>

<div class="panel panel-info">
<div class="panel-heading">Trade Application Middle Office</div>
<div class="panel-body">
		<div style="padding-bottom: 20px;">
	        <form class="form-inline" action="/fomosystem/loadMoData" method="POST">
			  <div class="form-group">
			    <label for="tradeID">Trade Id</label>
			    <input type="tradeID" class="form-control" id="tradeId" name="tradeId">
			  </div>
			  <button type="submit" class="btn btn-info">LoadTrade</button>
			</form>
		</div>
		<div id="borderID"></div>
		<form:form method = "POST" action = "/fomosystem/insertOrUpdateMo" modelAttribute="moModel">
         <table style="border-collapse: separate;border-spacing: 15px 20px;">
            <tr>
               <td><form:label path = "tradeID">TradeID</form:label></td>
               <td><form:input path = "tradeID" class="form-control"  readonly="true"/></td>
            </tr>
            <tr>
               <td><form:label path = "counterParty">CounterParty</form:label></td>
               <td><form:input path = "counterParty" class="form-control" readonly="true"/></td>
               <td><form:label path = "fees">Fees</form:label></td>
               <td><form:input path = "fees" class="form-control" /></td>
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
			   <td><form:label path = "mtmValue">MTM Value</form:label></td>
               <td><form:input path = "mtmValue" class="form-control" /></td>
            </tr>
            <tr>
               <td><form:label path = "amount">Amount</form:label></td>
               <td><form:input path = "amount" class="form-control"/></td>
               <td><form:label path = "exchange">Exchange</form:label></td>
               <td><form:input path = "exchange" class="form-control"/></td>
            </tr>
            <tr>
               <td><form:label path = "buySell">Buy/Sell:</form:label></td>
               <td><form:input path = "buySell" class="form-control" /></td>
               <td><form:label path = "price">Price:</form:label></td>
               <td><form:input path = "price" class="form-control"/></td>
            </tr>
             <tr>
               <td><form:label path = "tradeDate">TradeDate:</form:label></td>
               <td><form:input path = "tradeDate" class="form-control" /></td>
               <td><form:label path = "settlementDate">SettlementDate:</form:label></td>
               <td><form:input path = "settlementDate" class="form-control" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Save" class="btn btn-success"/>
               </td>
            </tr>
         </table>  
      </form:form>
</div>
</div>


