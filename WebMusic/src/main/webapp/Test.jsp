<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>

<tr>
<% 
int count=0;
for(int num=0;num!=4;num++){
	if(count==7){
		break;
	}
%>
<table>
<tr>
<%
if(num==1 || num==2||  num==0){ %>
<td><%=num %></td>

<%} else if(num==3){ %>
<td><%=num %></td>
</tr>
<%}%>
</table>
<%

count++;
%>
</tr>
</table>
<%
num++;
} %>
</body>
</html>