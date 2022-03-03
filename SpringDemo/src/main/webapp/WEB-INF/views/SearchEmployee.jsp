<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Employee page</title>
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<style>
.center {
	margin-left: auto;
	margin-right: auto;
}

h3 {
	text-align: center;
}
</style>
</head>
<body style="background-color: lightblue">

<h3>Search for Employee Details</h3>
		<br>
		<form action="SearchServlet" method="get" style="text-align: center;">
		<fieldset>
		
		<table class="center">
			<tr>
				<th><label for="empCode">Employee code:</label></th>
				<td><input type="text" name="empCode" id="empCode"
					placeholder="Enter employee code"></td>
			</tr>
			
			<tr>
				<th><label for="empCity">City:</label></th>
				<td><input type="text" name="empCity" id="empCity"
					placeholder="Enter city name"></td>
			</tr>
			
			<tr>
				<th><label for="empState">State:</label></th>
				<td><input type="text" name="empState" id="empState"
					placeholder="Enter state name"></td>
			</tr>
			
			<tr>
				<th><label for="fromdate">Joining Date from:</label></th>
				<td><input type="date" name="fromdate" id="fromdate"
					></td>
			</tr>
			
			<tr>
				<th><label for="todate">Joining Date To:</label></th>
				<td><input type="date" name="todate" id="todate"
					></td>
			</tr>
		
			<table class="center">
				<tr>
				<br>
					<td><button type="submit">Search</button></td>
				</tr>
			</table>
		
	</table>
	</fieldset>
</form>

<table class="table table-dark table-hover">
		<thead>
			<tr>
				<th id="ename">employeeName</th>
				<th id="ecode">employeeCode</th>
				<th id="mailid">email</th>		
				<th id="city">city</th>
				<th id="state">state</th>
			</tr>
		</thead>
		<br>
		<br>
		<tbody>
			<c:forEach items="${searchlist}" var="employeeList">
				<tr>
					<td>${employeeList.employeeName}</td>
					<td>${employeeList.employeeCode}</td>
					<td>${employeeList.email}</td>					
					<td>${employeeList.city}</td>
					<td>${employeeList.state}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>



</body>
</html>