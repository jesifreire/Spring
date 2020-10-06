<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Meu Formulário</title>
</head>
<body>
	<form:form method="POST" modelAttribute="torcedor" action="cadastro">
	<p>Nome: <form:input path="nome"/></p>
	<p>Time: <form:input path="time"/></p>
	<p><form:button>Enviar</form:button></p>
	<p>${mensagem}</p>
	</form:form>
	
 	<p>
 	<table>
		   <thead>
		    <tr>
		     <th>NOME</th>
		     <th>TIME</th>
		     <th>AÇÃO</th>
		    </tr>
		   </thead>
		   <tbody>
		     <c:forEach var="torcedor" items="${torcedores}">
		      <tr>
		       <td>${torcedor.nome}</td>
		       <td>${torcedor.time}</td>
		       <td>
		        <a href="editar>/${torcedores.indexOf(torcedor)}">Editar</a>
		        <a href="excluir>/${torcedores.indexOf(torcedor)}">Excluir</a>
		       </td>
		      </tr>
		     </c:forEach>
		    </tbody>
		</table>
 	</p>
		
</body>
</html>