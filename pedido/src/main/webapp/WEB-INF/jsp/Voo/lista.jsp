<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>App serviço</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
		<h2>Cadastro empresas areas.</h2>
		<form action="/Voo" method="get">
			<button type="submit" class="btn btn-primary">Novo Companhia Aerea</button>
		</form>

		<c:if test="${not empty comps_areas}">
			<p>Lista de Empresas(${comps_areas.size()})</p>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Classe</th>
						<th>Empresa</th>
						<th>Acesso a Sala Vip</th>
						<th>Data de Check-in</th>
						<th>Data de Check-out</th>
						<th>Numero de Passageiros</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var ="o" items="${comps_areas}">
						<tr>
							<td>o.classe</td>
							<td>o.companhia</td>
							<td>o.vip_floor</td>
							<td>o.data_ida</td>
							<td>o.data_retorno</td>
							<td>o.count_pessoas</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>	
		</c:if>
		<c:if test="${empty comps_areas}">
			<p>Não há empresas cadastradas</p>
		</c:if>
		</div>
</body>
</html>

