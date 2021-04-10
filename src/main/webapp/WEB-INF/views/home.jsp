<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" 
integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" 
crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" 
integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" 
crossorigin="anonymous"></script>
<spring:url value="/resources" var="urlPublic"/>
</head>
<body>
	<h1>INTEGRANTES</h1>
	<h2>GONZALES MORALES PAOLO ANTONIO</h2>
	<h2>SULLON CHAVEZ JUAN DIEGO</h1>
	<h2>WONG ROMERO JOSE MANUEL</h2>
	<h1> Lista de Peliculas </h1>
	<!-- <ul>
		<c:forEach items="${Vpeliculas}" var = "dato">
			<li>${dato}</li>
		</c:forEach>
	</ul>  -->
	
	<table align = "center">
		<thead>
			<tr>
				<th>ID</th>
				<th>Titulo</th>
				<th>Duracion</th>
				<th>Clasificacion</th>
				<th>Genero</th>	
				<th>Imagen</th>
				<th>Fecha</th>
				<th>Estatus</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${Vpeliculas}" var = "dato">
				<tr>
					<td>${dato.id}</td>
					<td>${dato.titulo}</td>
					<td>${dato.duracion}</td>
					<td>${dato.clasificacion}</td>
					<td>${dato.genero}</td>
					<td><img alt="" src="${urlPublic}/images/${dato.imagen}"></td>
					<td>${dato.fechaEstreno}</td>
					<td>${dato.estatus}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>