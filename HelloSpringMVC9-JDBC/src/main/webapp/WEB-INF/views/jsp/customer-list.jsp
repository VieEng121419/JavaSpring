<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Spring MVC + JDBC</title>
<style>
tablle, th, td {
	border: 1px solid black;
}

td {
	padding-right: 30px;
}
</style>
</head>
<body>
	<c:url value="/customer-save" var="urlSave" />
	<c:url value="/customer-view/" var="urlView" />
	<c:url value="/customer-update" var="urlUpdate" />
	<c:url value="/customerDelete/" var="urlDelete" />
	<h1>List Customer</h1>
	<a href="${urlSave}">Add Customer</a>
	<br />
	<br />
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Address</th>
			<th>View</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:if test="${not empty listCustomer}">
			<c:forEach var="customer" items="${listCustomer}">
				<tr style="border: 1px black solid">
					<th>${customer.id}</th>
					<th>${customer.name}</th>
					<th>${customer.address}</th>
					<th><a href="${urlView}/${customer.id}">View</a></th>
					<th><a href="${urlUpdate}/${customer.id}">Edit</a></th>
					<th><a href="${urlDelete}/${customer.id}">Delete</a></th>
				</tr>
			</c:forEach>
		</c:if>
	</table>
</body>
</html>