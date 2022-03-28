<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>App serviço</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
		<h2>Cadastro de Hoteis</h2>
		<form action="Hospedagem" method="get">
			<button type="submit" class="btn btn-primary">Novo Hotel</button>
		</form>
		<c:if test="${not empty comps_hotel}">
			<p>Lista de Hoteis(${comps_hotel.size()})</p>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Nome</th>
						<th>Numero de Estrelas</th>
						<th>Possui Concierge</th>
						<th>Data de Check-in</th>
						<th>Data de Check-out</th>
						<th>Numero de Hospedes</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var ="o" items="${comps_hotel}">
						<tr>
							<td>o.hotel</td>
							<td>o.numstar</td>
							<td>o.concierge</td>
							<td>o.data_ida</td>
							<td>o.data_retorno</td>
							<td>o.count_pessoas</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		<c:if test="${empty comps_hotel}">
			<p>Não há empresas cadastradas</p>
		</c:if>
	</div>
</body>
</html>

