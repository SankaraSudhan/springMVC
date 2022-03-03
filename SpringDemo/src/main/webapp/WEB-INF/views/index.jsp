<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>Register page</title>
<style>
.center {
	margin-left: auto;
	margin-right: auto;
}

h2 {
	text-align: center;
}

p {
	text-align: center;
}
</style>
</head>

<body style="background-color: lightblue">
	<br>
	<br>
	<br>
	<br>
	<form action="RegisterServlet">
		<fieldset>
			<h2>Employee Registeration portal</h2>
			<br>
			<table class="center">

				<tr>
					<th><label for="name">Employee Name:</label></th>
					<td><input type="text" name="EmployeeName"
						onkeyup="validuser()" id="name" placeholder="Enter empolyee name"
						pattern="[a-zA-Z]{3,30}" required autofocus></td>
				</tr>
				<tr>
					<th><label for="code">Employee Code:</label></th>
					<td><input type="text" name="EmpCode" id="name"
						placeholder="Enter employee code" pattern="[a-z0-9]{2,5}" required></td>
				</tr>
				<tr>
					<th><label for="emailId">Email Id:</label></th>
					<td><input type="email" name="UserEmail" id="emailId"
						placeholder="Enter email Id"
						pattern="[a-z0-9]+[@][a-z]+[.][a-z]+{2,5}" required></td>
				</tr>
				<tr>
					<th><label for="name">Address 1:</label></th>
					<td><input type="text" name="address1" id="address1"
						placeholder="Enter Address" pattern="[a-z]{2,20}" required></td>
				</tr>

				<tr>
					<th><label for="name">Address 2:</label></th>
					<td><input type="text" name="address2" id="address2"
						placeholder="Enter other Address" pattern="[a-z]{2,20}" required></td>
				</tr>


				<tr>
					<th><label for="city">City:</label></th>
					<td><input type="text" name="city" id="city"
						placeholder="Enter city name" pattern="[a-z]{2,20}" required></td>
				</tr>


				<tr>
					<th><label for="state">State:</label></th>
					<td><input type="text" name="state" id="state"
						placeholder="Enter state name" pattern="[a-z]{2,20}" required></td>
				</tr>

				<tr>
					<th><label for="dob">Date of Birth:</label></th>
					<td><input type="date" name="dob" id="dob" required></td>
				</tr>

				<tr>
					<th><label for="joiningDate">Joining Date:</label></th>
					<td><input type="date" name="joiningDate" id="joiningDate"
						required></td>
				</tr>
				<p id="userresponse"></p>
			</table>
			<br>
			<table class="center">
				<th id="button">
				<tr>
					<td><button type="submit">Click to Register</button></td>
				</tr>
				<tr>
					<td><button>
							<a href="SearchServlets">Search Employees</a>
						</button></td>
				</tr>
				</th>
			</table>
		</fieldset>
	</form>
	<script>
		function validuser() {
			let username = document.getElementById("name").value;
			console.log(username);
			$
					.ajax({
						type : 'GET',
						url : 'UserAlertServlet',
						data : 'EmployeeName=' + username,
						cache : false,
						success : function(response) {
							document.getElementById("userresponse").innerHTML = response;
						}
					});
		}
	</script>

</body>
</html>