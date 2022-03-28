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
		<h2>Cadastro de Empresas para locação de Automoveis.</h2>
		<form action="/Transporte" method="get">
			<button type="submit" class="btn btn-primary">Nova Empresa</button>
		</form>
		<c:if test="${not empty comps_trans}">
			<p>Lista de Empresas(${comps_trans.size()})</p>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Nome</th>
						<th>Inclui Seguro</th>
						<th>Tipo de Veículo</th>
						<th>Data de Retirada</th>
						<th>Data de Devolução</th>
						<th>Numero de Pessoas</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var ="o" items="${comps_trans}">
						<tr>
							<td>o.empresa</td>
							<td>o.seguro</td>
							<td>o.tipo_veiculo</td>
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

